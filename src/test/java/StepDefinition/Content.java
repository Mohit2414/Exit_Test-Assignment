package StepDefinition;

import Base.BaseClass;
import PageObject.ContentPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Content extends BaseClass {
	@When("^user clicks on content icon$")
	public void user_clicks_on_content_icon() throws Throwable {
	   ContentPage c = new ContentPage();
	   c.Content_icon();
	}

	@And("^click on clipboard icon$")
	public void click_on_clipboard_icon() throws Throwable {
		ContentPage c = new ContentPage();
		c.Content_icon();
		
	} 

	
}
