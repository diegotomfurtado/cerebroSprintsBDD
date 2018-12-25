package com.liferay.engineer.analytics.pages;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.By;

import com.liferay.engineer.analytics.utils.CommonMethods;

/**
 * @author Diego Furtado
 */
public class PagesPage {

	public void clickOnDropdownList_Last7Days_PagesPage() {
		clickOnDropdownListFromPeriodTime();
		_commonMethods.clickOnLink(_last7DaysPeriodTimeLocator);
	}

	public void clickOnDropdownList_Last24Hours_PagesPage() {
		clickOnDropdownListFromPeriodTime();
		_commonMethods.clickOnLink(_last24HoursPeriodTimeLocator);
	}

	public void clickOnDropdownList_Last28Days_PagesPage() {
		clickOnDropdownListFromPeriodTime();
		_commonMethods.clickOnLink(_last28DaysPeriodTimeLocator);
	}

	public void clickOnDropdownList_Last30Days_PagesPage() {
		clickOnDropdownListFromPeriodTime();
		_commonMethods.clickOnLink(_last30DaysPeriodTimeLocator);
	}

	public void clickOnDropdownList_Last90Days_PagesPage() {
		clickOnDropdownListFromPeriodTime();
		_commonMethods.clickOnLink(_last90DaysPeriodTimeLocator);
	}

	public void clickOnDropdownList_Yesterday_PagesPage() {
		clickOnDropdownListFromPeriodTime();
		_commonMethods.clickOnLink(_lastYesterdayPeriodTimeLocator);
	}

	public void clickOnDropdownListFromPeriodTime() {
		_commonMethods.clickOnButton(_dropdownPeriodTimeLocator);
	}

	public void clickOnLinkFromPagesList() {
		_commonMethods.clickOnLink(_anElementFromPageListLocator);
	}

	public void clickOnOrder_DropdownList() {
		_commonMethods.clickOnButton(_orderDropdownListLocator);
	}

	public void clickOnOrderByViews_DropdownList() {
		clickOnOrder_DropdownList();
		_commonMethods.clickOnButton(_selectViewsOptionFromOrderDropdown);
	}

	public void clickOutToChangeAPerpectiveOfCursor() {
		_commonMethods.clickOnButton(_selectAnyRegionOnPagesLocator);
	}

	public String returnElementErroMessageNoDataMatching() {
		return _commonMethods.returnElementFromPage(_erroMessageNoDataMatching);
	}

	public String returnElementFromDropdownItemActive() {
		return _commonMethods.returnElementFromPage(
			_elementFromDropdownItemActiveLocator);
	}

	private static final By _anElementFromPageListLocator = xpath(
		"//*[@class=\'table-cell-expand table-first-column\']/child::*");
	private static final By _dropdownPeriodTimeLocator = xpath(
		"//*[@class=\'analytics-dropdown dropdown btn-group border-0\']");
	private static final By _elementFromDropdownItemActiveLocator = xpath(
		"//*[@class=\'dropdown-item active\']");
	private static final By _erroMessageNoDataMatching = xpath(
		"//*[contains(@class,\'m-auto pl-4 pr-4 position-relative\')]");
	private static final By _last7DaysPeriodTimeLocator = xpath(
		"//*[@data-value=\'7\']");
	private static final By _last24HoursPeriodTimeLocator = xpath(
		"//*[@data-value=\'0\']");
	private static final By _last28DaysPeriodTimeLocator = xpath(
		"//*[@data-value=\'28\']");
	private static final By _last30DaysPeriodTimeLocator = xpath(
		"//*[@data-value=\"30\"]");
	private static final By _last90DaysPeriodTimeLocator = xpath(
		"//*[@data-value=\'90\']");
	private static final By _lastYesterdayPeriodTimeLocator = xpath(
		"//*[@data-value=\'1\']");
	private static final By _orderDropdownListLocator = xpath(
		"//*[contains(@class,\'button-root\') and text()=\'Order\']");
	private static final By _selectAnyRegionOnPagesLocator = xpath(
		"//*[@class=\'d-flex align-items-end\']");
	private static final By _selectViewsOptionFromOrderDropdown = xpath(
		"//*[@class=\'custom-control-label-text\' and text()=\'Views\']");

	private final CommonMethods _commonMethods = new CommonMethods();

}