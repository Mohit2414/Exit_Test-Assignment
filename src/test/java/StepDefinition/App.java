package StepDefinition;

import Base.BaseClass;
import PageObject.AppPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class App extends BaseClass {
	

	@When("^user clicks on the App icon$")
	public void user_clicks_on_the_App_icon() throws Throwable {
	    AppPage a = new AppPage();
	    a.App_icon_click();
	    log.info("user clicks on the App icon");
	    
	}

	@And("^click on Action Bar icon$")
	public void click_on_Action_Bar_icon() throws Throwable {
		 AppPage a = new AppPage();
	   a.Actionbar_icon_click();
	   log.info("Click on Action_Bar icon");
	}

	@Then("^click on Display Options icon$")
	public void click_on_Display_Options_icon() throws Throwable {
		 AppPage a = new AppPage();
	   a.Display_icon_click();
	   log.info("Click on display_option icon");
	}

	@And("^click on Display_Show_Title icon$")
	public void click_on_Display_Show_Title_icon() throws Throwable {
		 AppPage a = new AppPage();
	    a.Showtitle();
	    log.info("Click on display show title icon");
	}

	@Then("^click on Display_Show_Logo icon and verified$")
	public void click_on_Display_Show_Custom_icon_and_verified() throws Throwable {
		 AppPage a = new AppPage();
		a.Show_Logo();
	}
	
	@Then("^closes app$")
	public void closes_app() throws Throwable {
		stopappium();
		log.info("Application is closed");
	    
	}


}
