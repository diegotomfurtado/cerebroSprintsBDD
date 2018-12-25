package com.liferay.engineer.analytics.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.liferay.engineer.analytics.pages.PagesOverviewPage;
import com.liferay.engineer.analytics.pages.PagesPage;
import com.liferay.engineer.analytics.utils.CommonMethods;
import com.liferay.gs.testFramework.SeleniumReadPropertyKeys;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterPeriodTimeIsReflectingOnChildrenPages {

	@Before
	public static void setUpAll() {
		SeleniumReadPropertyKeys.DRIVER.manage().timeouts().implicitlyWait(SeleniumReadPropertyKeys.getTimeOut(),
				TimeUnit.SECONDS);
		SeleniumReadPropertyKeys.DRIVER.get(SeleniumReadPropertyKeys.getUrlToHome());

		CommonMethods.shouldBeAccessTheLocalDevelopment(true);
	}

	@Given("^a user is logged into Pages content$")
	public void a_user_is_logged_into_Pages_content() throws Throwable {
		
		_commonMethods.goToPagesPage();
	}

	@When("^a user choose the Last 7 Days option on dropdown list$")
	public void a_user_choose_the_Last_Days_option_on_dropdown_list() throws Throwable {

		_pagesPage.clickOnDropdownList_Last7Days_PagesPage();
	}

	@When("^choose any link from Page List$")
	public void choose_any_link_from_Page_List() throws Throwable {

		_pagesPage.clickOnLinkFromPagesList();
	}

	@Then("^a user will be redirected to another site and will see, on Asset Card, the same period time from the previous filter\\.$")
	public void a_user_will_be_redirected_to_another_site_and_will_see_on_Asset_Card_the_same_period_time_from_the_previous_filter()
			throws Throwable {
		
		Assert.assertTrue("Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByAssets()));
	}

	@Then("^a user will be redirected to another site and will see, on Localization Card, the same period time from the previous filter\\.$")
	public void a_user_will_be_redirected_to_another_site_and_will_see_on_Localization_Card_the_same_period_time_from_the_previous_filter()
			throws Throwable {
		
		Assert.assertTrue("Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByLocations()));
	}

	@Then("^a user will be redirected to another site and will see, on Views By Segments Card, the same period time from the previous filter\\.$")
	public void a_user_will_be_redirected_to_another_site_and_will_see_on_Views_By_Segments_Card_the_same_period_time_from_the_previous_filter()
			throws Throwable {
		
		Assert.assertTrue("Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsBySegments()));
	}

	@Then("^a user will be redirected to another site and will see, on Visitors Behavior Card, the same period time from the previous filter\\.$")
	public void a_user_will_be_redirected_to_another_site_and_will_see_on_Visitors_Behavior_Card_the_same_period_time_from_the_previous_filter()
			throws Throwable {
		
		Assert.assertTrue("Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByVisitorsBehavior()));
	}

	@Then("^a user will be redirected to another site and will see, on Views By Technology Card, the same period time from the previous filter\\.$")
	public void a_user_will_be_redirected_to_another_site_and_will_see_on_Views_By_Technology_Card_the_same_period_time_from_the_previous_filter()
			throws Throwable {
		
		Assert.assertTrue("Last 7 days".contentEquals(_pagesOverviewPage.returnElement_ByViewsByTechnology()));
	}

	private static final PagesPage _pagesPage = new PagesPage();

	private final CommonMethods _commonMethods = new CommonMethods();
	private final PagesOverviewPage _pagesOverviewPage = new PagesOverviewPage();

}
