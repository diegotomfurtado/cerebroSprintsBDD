package com.liferay.engineer.analytics.pages;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getDefaultPassword;
import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getDefaultUsername;
import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
 * @author Diego Furtado
 */
public class LoginPage {

	public void clickOnSignInButton() {
		_commonMethods.clickOnButton(_signInButtonLocator);
	}

	public void typeEmailAddressOnLoginForm() {
		_commonMethods.switchToNewWindowPage();
		_commonMethods.input(_emailAddressFieldLocator, getDefaultUsername());
	}

	public void typePasswordOnLoginForm() {
		_commonMethods.input(_passwordFieldLocator, getDefaultPassword());
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final By _emailAddressFieldLocator = xpath(
		".//*[contains(@id,\'LoginPortlet_login\')and @type]");
	private static final By _passwordFieldLocator = xpath(
		".//*[contains(@id,\'LoginPortlet_password\') and @type]");
	private static final By _signInButtonLocator = xpath(
		".//*[contains(@class,\'btn-primary\')]");

}