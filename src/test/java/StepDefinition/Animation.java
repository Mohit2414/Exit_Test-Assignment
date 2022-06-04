package StepDefinition;

import Base.BaseClass;
import PageObject.AnimationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Animation extends BaseClass {
	
	
	@Given("^The emulator is open$")
	public void the_emulator_is_open() throws Throwable {
	    launchapp();
        Thread.sleep(1000);
	   log.info("application is started");
	}
	
	@And("^clicks on continue, ok button$")
	public void clicks_on_continue_ok_button() throws Throwable {
		AnimationPage ap = new AnimationPage();
		ap.Continuebutton();
		Thread.sleep(1000);
		ap.Okbuttton();
		log.info("Click on continue and ok button");
	}

	@When("^user clicks on the Animation$")
	public void user_clicks_on_the_Animation() throws Throwable {
		AnimationPage ap = new AnimationPage();
	    ap.animationbtn();
	    log.info("Click on the animation icon");
	    }

	@And("^clicks on the hide-Show animation$")
	public void clicks_on_the_hide_Show_animation() throws Throwable {
		AnimationPage ap = new AnimationPage();
		ap.hideshowbtn();
		log.info("Click on the hide-show icon");
	    
	}

	@Then("^verifies the hide show page$")
	public void verifies_the_hide_show_button() throws Throwable {
		AnimationPage ap = new AnimationPage();
		ap.checkbox();
		Thread.sleep(1000);
	    ap.Nobtn();
	    Thread.sleep(1000);
	    ap.displaybtn();
	    log.info("Verfies the complete page");
	}

	@And("^closes the app$")
	public void closes_the_app() throws Throwable {
		stopappium();
	    log.info("application is closed");
	}



}
