package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
* @author Diego Furtado
*/
public class WebContentFromAssestsPage {

	public String returnElement_ActiveByAssetAppearsOn() {
		return _commonMethods.returnElementFromPage(
			_itemActiveByAssetAppearsOnLocator);
	}

	public String returnElement_ActiveByLocations() {
		return _commonMethods.returnElementFromPage(
			_itemActiveByLocationsLocator);
	}

	public String returnElement_ActiveByViewsBySegments() {
		return _commonMethods.returnElementFromPage(
			_itemActiveByViewsBySegmentsLocator);
	}

	public String returnElement_ActiveByViewsByTechnology() {
		return _commonMethods.returnElementFromPage(
			_itemActiveByViewsByTechnologyLocator);
	}

	public String returnElement_ActiveByVisitorsBehavior() {
		return _commonMethods.returnElementFromPage(
			_itemActiveByVisitorsBehaviorLocator);
	}

	private static final By _itemActiveByAssetAppearsOnLocator = xpath(
		"//div[text()=\"Asset Appears On\"]/following::div[2]/button");
	private static final By _itemActiveByLocationsLocator = xpath(
		".//*[@class=\'card analytics-locations-card\']/descendant::button");
	private static final By _itemActiveByViewsBySegmentsLocator = xpath(
		".//*[@class=\'card analytics-grouped-barchart-card\']//*[contains(@class,\'button-root\')]");
	private static final By _itemActiveByViewsByTechnologyLocator = xpath(
		"//div[text()=\"Views by Technology\"]/following::div[2]/button");
	private static final By _itemActiveByVisitorsBehaviorLocator = xpath(
		"//*[@class=\'card analytics-metrics-card\']//*[contains(@class,\'button-root\')]");

	private final CommonMethods _commonMethods = new CommonMethods();

}