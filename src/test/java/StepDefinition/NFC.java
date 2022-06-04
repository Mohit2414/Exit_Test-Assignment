package StepDefinition;

import Base.BaseClass;
import PageObject.NFCPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NFC extends BaseClass {
	
	@When("^user click on NFC icon$")
	public void user_click_on_NFC_icon() throws Throwable {
		NFCPage n = new NFCPage();
		n.NFC_icon();
		log.info("Click on NFC icon");
		
	   
	}

	@Then("^clicks on TechFilter icon$")
	public void clicks_on_TechFilter_icon() throws Throwable {
		NFCPage n = new NFCPage();
		n.TechFilter_icon();
		log.info("Click on TechFilter icon");
	}

}
