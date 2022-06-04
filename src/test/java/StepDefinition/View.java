package StepDefinition;

import Base.BaseClass;
import PageObject.ViewPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class View extends BaseClass {
	
	
	@When("^user clicks on view icon$")
	public void user_clicks_on_view_icon() throws Throwable {
		ViewPage v = new ViewPage();
		v.Views_icon();
		log.info("Click on view icon");
	}

	@And("^scrolls down$")
	public void scrolls_down() throws Throwable {
		scroll();
		Thread.sleep(1000);
		scroll();
		Thread.sleep(1000);
		scroll();
		Thread.sleep(1000);
		scroll();
		Thread.sleep(1000);
		scroll();
	}
	
	

	@And("^clicks on search view icon$")
	public void clicks_on_search_view_icon() throws Throwable {
		ViewPage v = new ViewPage();
		v.SearchView_icon();
		log.info("Click on Search_view icon");
	}

	@Then("^user clicks on filter$")
	public void user_clicks_on_filter() throws Throwable {
		ViewPage v = new ViewPage();
		v.Filter_icon();
		log.info("Click on filter icon");
	}

	@And("^user enters the (.*)$")
	public void user_enters_the_word(String Search) throws Throwable {
		ViewPage v = new ViewPage();
		v.Search_bar(Search);
		log.info("Enters any word to Search in searchbox");
	  
	}



}
