package com.liferay.engineer.analytics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.liferay.engineer.analytics.pages.AnalyticsCloudHomePage;
import com.liferay.engineer.analytics.pages.AnalyticsCloudProjectPage;
import com.liferay.engineer.analytics.pages.HomePage;
import com.liferay.engineer.analytics.pages.LoginPage;
import com.liferay.engineer.analytics.pages.PagesOverviewPage;
import com.liferay.engineer.analytics.pages.PagesPage;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;
import com.liferay.gs.testFramework.SeleniumWaitMethods;

/**
 * @author Diego Furtado
 */
public class CommonMethods {

	public static void performLogin() {
		_loginPage.typeEmailAddressOnLoginForm();
		_loginPage.typePasswordOnLoginForm();
		_loginPage.clickOnSignInButton();
	}

	public static void shouldBeAccessTheLocalDevelopment(boolean firstLogin) {
		if (firstLogin) {
			_homePage.clickOnLocalDevelopmentLink();
			performLogin();
		}
		else {
			_homePage.clickOnLocalDevelopmentLink();
		}
	}

	public void clickOnButton(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		SeleniumReadPropertyKeys.DRIVER.findElement(locator).click();
	}

	public void clickOnLink(By locator) {
		waitElementVisibilityAndBeClickable(locator);
		SeleniumReadPropertyKeys.DRIVER.findElement(locator).click();
	}

	public void goToPagesPage() {
		_analyticsCloudProjectPage.clickOnCustomerLiferayComProject();
		AnalyticsCloudHomePage.clickOnPagesLinkFromMenu();
	}

	public void goToWebContentPage() {
		_pagesPage.clickOnOrderByViews_DropdownList();
		_pagesPage.clickOutToChangeAPerpectiveOfCursor();
		_pagesPage.clickOnLinkFromPagesList();
		_pagesOverviewPage.clickOnLinkFromAssertCardList();
	}

	public void input(By locator, String input) {
		waitElementVisibilityAndBeClickable(locator);
		SeleniumReadPropertyKeys.DRIVER.findElement(locator).clear();
		SeleniumReadPropertyKeys.DRIVER.findElement(locator).sendKeys(input);
	}

	public String returnElementFromPage(By locator) {
		return SeleniumReadPropertyKeys.DRIVER.findElement(locator).getText();
	}

	public void switchToNewWindowPage() {
		for (String winHandle :
				SeleniumReadPropertyKeys.DRIVER.getWindowHandles()) {

			SeleniumReadPropertyKeys.DRIVER.switchTo().window(winHandle);
		}
	}

	public void waitElementAppearOnScreen(By locator) {
		SeleniumWaitMethods.getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		SeleniumWaitMethods.getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitElementVisibilityAndBeClickable(By locator) {
		waitElementAppearOnScreen(locator);
		SeleniumWaitMethods.getWaitDriver().until(ExpectedConditions.elementToBeClickable(locator));
	}

	private static final AnalyticsCloudProjectPage _analyticsCloudProjectPage =
		new AnalyticsCloudProjectPage();
	private static final HomePage _homePage = new HomePage();
	private static final LoginPage _loginPage = new LoginPage();
	private static final PagesOverviewPage _pagesOverviewPage =
		new PagesOverviewPage();
	private static final PagesPage _pagesPage = new PagesPage();

}