package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
 * @author Diego Furtado
 */
public class PagesOverviewPage {

	public void clickOnLinkFromAssertCardList() {
		_commonMethods.clickOnLink(_firstAssertLinksToWebContentLocator);
	}

	public String returnElement_ByAssets() {
		return _commonMethods.returnElementFromPage(_itemActiveByAssetsLocator);
	}

	public String returnElement_ByLocations() {
		return _commonMethods.returnElementFromPage(
			_itemActiveByLocationsLocator);
	}

	public String returnElement_ByViewsBySegments() {
		return _commonMethods.returnElementFromPage(
			_itemActiveByViewsBySegmentsLocator);
	}

	public String returnElement_ByViewsByTechnology() {
		return _commonMethods.returnElementFromPage(
			_itemActiveByViewsByTechnologyLocator);
	}

	public String returnElement_ByVisitorsBehavior() {
		return _commonMethods.returnElementFromPage(
			_itemActiveByVisitorsBehaviorLocator);
	}

	public String returnElement_ErroMessage_NoDataMactchingFromAssestCard() {
		return _commonMethods.returnElementFromPage(
			_erroMessageNoDataMatchingFromAssetsCardLocator);
	}

	private static final CommonMethods _commonMethods = new CommonMethods();
	private static final By _erroMessageNoDataMatchingFromAssetsCardLocator =
		xpath("//*[@class=\'m-auto pl-4 pr-4 position-relative text-center\']");
	private static final By _firstAssertLinksToWebContentLocator = xpath(
		"//*[@class=\'font-weight-semibold text-truncate-inline\']");
	private static final By _itemActiveByAssetsLocator = xpath(
		"//*[text()=\'Assets\']/following::button[8]");
	private static final By _itemActiveByLocationsLocator = xpath(
		".//*[@class=\'card analytics-locations-card\']/descendant::button");
	private static final By _itemActiveByViewsBySegmentsLocator = xpath(
		"//*[@class=\'card analytics-grouped-barchart-card\']//*[contains(@class,\'button-root\')]");
	private static final By _itemActiveByViewsByTechnologyLocator = xpath(
		"//*[text()=\'Views by Technology\']/following::button[1]");
	private static final By _itemActiveByVisitorsBehaviorLocator = xpath(
		"//*[@class=\'card analytics-metrics-card\']//*[contains(@class,\'button-root\')]");

}