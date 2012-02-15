/**
 * 
 */
package de.offis.health.icardea.cied.tools;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.PixelGrabber;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

import org.apache.log4j.Logger;

/**
 * This image tool class offers helper methods that can be used to convert images.
 * 
 *
 */
public class ImageProcessingTools {
	/**
	 * Logger object
	 */
	private static Logger logger = Logger.getLogger(ImageProcessingTools.class);
	
	/**
	 * This method will create a {@link BufferedImage} from a given byte array
	 * that contains the actual image data.
	 * 
	 * @param byteArrayImage The image as byte array.
	 * @param width The width in pixel.
	 * @param height The height in pixel.
	 * @param bitsPerComponent The bits per component (Color depth).
	 * @return The image as {@link BufferedImage}.
	 */
	public static synchronized BufferedImage toBufferedImage(byte[] byteArrayImage, int width, int height, int bitsPerComponent) {
		BufferedImage bufferedImage = null;
		DataBuffer db = new DataBufferByte(byteArrayImage, byteArrayImage.length);
		WritableRaster raster;
		switch(bitsPerComponent) {
			case 1:
				// Black/White image
				raster = Raster.createPackedRaster( db, width, height, 1, null );
				bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY );
				bufferedImage.setData(raster);
				break;
			default:
				// Color images
				if (width * height == byteArrayImage.length) {
					bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_INDEXED );
					raster = Raster.createPackedRaster(db, width, height, bitsPerComponent, null);
					bufferedImage.setData(raster);
				} else {
					bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB );
					raster = Raster.createInterleavedRaster(db, width, height,
							width * 3, 3, new int[]{0, 1, 2}, null);
					bufferedImage.setData(raster);
				} // end if..else
		} // end switch
		return bufferedImage;
	}
	
	/**
	 * Determines if an {@link Image} has an alpha channel or not.
	 * 
	 * @param image The <code>Image</code> object to work with.
	 * @return true if the image has an alpha channel
	 */
	public static synchronized boolean hasAlpha(Image image) {
		PixelGrabber pg = new PixelGrabber(image, 0, 0, 1, 1, false);
		try {
			pg.grabPixels();
		} catch (InterruptedException ex) {}
		
		ColorModel colorModel = pg.getColorModel();
		if (colorModel == null) {
			logger.warn("The ColorModel is null, so we assume there is no alpha channel.");
			return false;
		} else {
			return colorModel.hasAlpha();
		}
	}
	
	/**
	 * This method decodes a length encoded byte array
	 * (e.g. found in PDF files) and returns the resulting
	 * byte array.
	 * 
	 * @param lengthEncodedByteArray The encoded byte array to decode.
	 * @return Returns a the length decoded byte array.
	 */
	public static synchronized byte[] runLengthDecode(byte[] lengthEncodedByteArray) {
		final ByteArrayOutputStream outputStream = new ByteArrayOutputStream(
				lengthEncodedByteArray.length * 64);
		final ByteBuffer inputBuffer = ByteBuffer.wrap(lengthEncodedByteArray);
		while (inputBuffer.hasRemaining()) {
			final byte lengthByte = inputBuffer.get();
			if (lengthByte >= 0) {
				// Copy lengthByte + 1 byte
				for (int i = 0; i <= lengthByte; i++) {
					outputStream.write(inputBuffer.get());
				} // end for
			} else if (lengthByte == -128) {
				break;
			} else {
				final byte value = inputBuffer.get();
				final int runLength = 1 - (int) lengthByte;
				for (int i = 0; i < runLength; i++) {
					outputStream.write(value);
				} // end for
			} // end if..else
		} // end while
		return outputStream.toByteArray();
	}
}
