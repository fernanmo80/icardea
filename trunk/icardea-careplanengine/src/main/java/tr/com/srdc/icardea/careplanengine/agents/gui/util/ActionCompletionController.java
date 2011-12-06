package tr.com.srdc.icardea.careplanengine.agents.gui.util;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.agents.gui.graph.GuidelineMonitoringPanel;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.*;
import org.apache.log4j.Logger;

/**
 * User: mehmet olduz [mehmet@srdc.metu.edu.tr] Date: Jan 18, 2007 Time:
 * 10:07:16 AM
 */
public class ActionCompletionController implements ActionListener{
	private GuidelineMonitoringPanel guidelineMonitoringPanel = null;

	// private LinkedBlockingQueue<CompletedStep> completedStepsQueue = null;
	// private Timer delayTimer = null;

	AudioInputStream source = null;
	private Clip clip; // The sound clip
	public static Logger logger = Logger.getLogger(ActionCompletionController.class);
	public ActionCompletionController(
			GuidelineMonitoringPanel guidelineMonitoringPanel) {
		this.guidelineMonitoringPanel = guidelineMonitoringPanel;

		// completedStepsQueue = new LinkedBlockingQueue<CompletedStep>();
		loadSoundFile();

		// delayTimer = new Timer(2000, this);
	}

	private void loadSoundFile() {
		try {
			// sound file played upon completion of a step
			URL soundUrl = this.getClass().getClassLoader().getResource("sound/done.wav");
			
			source = AudioSystem.getAudioInputStream(soundUrl);

			DataLine.Info clipInfo = new DataLine.Info(Clip.class,
					source.getFormat());

			if (AudioSystem.isLineSupported(clipInfo)) {

				// Create a local clip to avoid discarding the old clip
				Clip newClip = (Clip) AudioSystem.getLine(clipInfo); // Create
																		// the
																		// clip

				newClip.open(source);

				// Deal with previous clip
				if (clip != null) {
					if (clip.isActive()) // If it's active
					{
						clip.stop(); // ...stop it
					}

					if (clip.isOpen()) { // If it's open...
						clip.close(); // ...close it.
					}
				}

				clip = newClip; // We have a clip, so discard old
			} else {
				JOptionPane.showMessageDialog(null, "Clip not supported",
						"Clip NotSupported", JOptionPane.WARNING_MESSAGE);
			}
		} catch (UnsupportedAudioFileException e) {
			logger.info("File not supported - Unsupported File Type");
//			JOptionPane.showMessageDialog(null, "File not supported",
//					"Unsupported File Type", JOptionPane.WARNING_MESSAGE);
		} catch (LineUnavailableException e) {
			JOptionPane.showMessageDialog(null, "Clip not available",
					"Clip Error", JOptionPane.WARNING_MESSAGE);
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "I/O error creating clip",
					"Clip Error", JOptionPane.WARNING_MESSAGE);
		}
	}

	/*
	 * public void putIntoStepQueue(String guidelineStep, String info) {
	 * completedStepsQueue.add(new CompletedStep(guidelineStep, info));
	 * if(!delayTimer.isRunning()){ stepWaitingTimeHasTerminated();
	 * delayTimer.start(); } }
	 */
	public void actionPerformed(ActionEvent actionEvent) {

		// stepWaitingTimeHasTerminated();
	}

	/*
	 * private class CompletedStep { private String guidelineStep; private
	 * String info;
	 * 
	 * public CompletedStep(String guidelineStep, String info) {
	 * this.guidelineStep = guidelineStep; this.info = info; }
	 * 
	 * public String getGuidelineStep() { return guidelineStep; }
	 * 
	 * public String getInfo() { return info; } }
	 * 
	 * private void stepWaitingTimeHasTerminated() { CompletedStep completedStep
	 * = completedStepsQueue.poll(); if(completedStep == null){
	 * delayTimer.stop(); }else{ playCompletionSound();
	 * guidelineMonitoringPanel.updateStepStatus(
	 * completedStep.getGuidelineStep(), 2, completedStep.getInfo()); } }
	 */
	public void playCompletionSound() {
		if (clip != null) {
			clip.stop();
			clip.setMicrosecondPosition(0);
			clip.start();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new ActionCompletionController(null);
		Thread.sleep(100000);
	}
}

// ~ Formatted by Jindent --- http://www.jindent.com
