package de.offis.health.icardea.ppm;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Configures the perspective layout. This class is contributed through the
 * plugin.xml.
 */
public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
//		layout.setFixed(true);
//		{
//			IFolderLayout folderLayout = layout.createFolder("folder", IPageLayout.LEFT, 1.0f, editorArea);
//			folderLayout.addView("de.offis.health.icardea.ppm.PPMMain");
//		}
		PPMDataset currentPPM = PPMDataset.getInstance();
		currentPPM.setCurrentPatID("2");
		layout.addView("de.offis.health.icardea.ppm.GeneralView", IPageLayout.TOP, 0.3f, editorArea);
		layout.addPlaceholder("de.offis.health.icardea.ppm.PPMMain", IPageLayout.BOTTOM, 0.7f, editorArea);
//		layout.addView("de.offis.health.icardea.ppm.PPMMain", IPageLayout.BOTTOM, 0.8f, editorArea);

	}
}
