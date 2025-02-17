package com.stepdefinition;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.io.IOException;

import org.monte.screenrecorder.ScreenRecorder;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.Registry;
import org.monte.media.math.Rational;


public class VideoRecorder_utlity extends ScreenRecorder {
	
	private static final Object MediaTypeKey = null;
	private static final Object EncodingKey = null;
	private static final Object ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE = null;
	private static final Object CompressorNameKey = null;
	private static final Object MimeTypeKey = null;
	private static final Object MIME_AVI = null;
	private static final Object DepthKey = null;
	private static final Object FrameRateKey = null;
	private static final Object QualityKey = null;
	private static final Object KeyFrameIntervalKey = null;
	public static ScreenRecorder screenRecorder;
	public String name;
	public VideoRecorder_utlity(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat,
			Format screenFormat, Format mouseFormat, Format audioFormat, File movieFolder, String name)
					throws IOException, AWTException {
		super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder);
		this.name = name;
	}

	@Override
	protected File createMovieFile(Format fileFormat) throws IOException {

		if (!movieFolder.exists()) {
			movieFolder.mkdirs();
		} else if (!movieFolder.isDirectory()) {
			throw new IOException("\"" + movieFolder + "\" is not a directory.");
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		return new File(movieFolder,
				name + "-" + dateFormat.format(new Date()) + "." + Registry.getInstance().getExtension(fileFormat));
	}

	public static void startRecord(String methodName) throws Exception {
		File file = new File("C:\\Users\\Venkateshwaran\\git\\repository\\EightFourthFive_Testing\\VideoRecorder"); //Path where vidoe recording would be stored inside project
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;

		Rectangle captureSize = new Rectangle(0, 0, width, height);

		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().
				getDefaultScreenDevice()
				.getDefaultConfiguration();
		screenRecorder = new VideoRecorder_utlity(gc, captureSize,new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
						CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
						Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
				null, file, methodName);
		screenRecorder.start();
	}

	public static void stopRecord() throws Exception {
		screenRecorder.stop();
	}

}
