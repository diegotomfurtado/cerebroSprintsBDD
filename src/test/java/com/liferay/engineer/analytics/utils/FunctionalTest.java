package com.liferay.engineer.analytics.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import com.liferay.engineer.analytics.testsuites.RunAllTests;

/**
 * @author Manoel Cyreno
 */
public abstract class FunctionalTest {

	@AfterClass
	public static void afterClass() throws Exception {
		RunAllTests.closeDriver();
	}

	@Rule
	public RetryTestExecution retry = new RetryTestExecution(2);

	@Rule
	public TestWatcher writeScreenshotOnFailure = new TestWatcher() {

		protected void failed(Throwable e, Description description) {
			if (_screenshot == null) {
				return;
			}

			String fileName =
				description.getClassName() + "." + description.getMethodName() +
					".png";

			try {
				FileUtils.writeByteArrayToFile(
					new File(_SCREENSHOTS_DIR, fileName), _screenshot);
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	};

	private static final String _SCREENSHOTS_DIR =
		"build/test-results/functionalTest/attachments/";

	private byte[] _screenshot = null;

}