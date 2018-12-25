package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
* @author Diego Furtado
*/
public class HomePage {

	public void clickOnLocalDevelopmentLink() {
		_commonMethods.clickOnLink(_localDevelopementLinkLocator);
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final By _localDevelopementLinkLocator = xpath(
		"//*[text()=\'Local Development\']");

}