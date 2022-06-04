package StepDefinition;

import Base.BaseClass;
import PageObject.GraphicsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class graphics extends BaseClass {
	

	@When("^user click on graphics icon$")
	public void user_click_on_graphics_icon() throws Throwable {
		GraphicsPage g = new GraphicsPage();
		g.Graphics_icon();
		log.info("Click on graphics icon");
	    
	}

	@Then("^user click on BitMap mesh icon$")
	public void user_click_on_BitMap_mesh_icon() throws Throwable {
		GraphicsPage g = new GraphicsPage();
	    g.BitmapMesh_icon();
	    log.info("Click on BitMap_mesh icon");
	}
	
	@And("^close the application$")
	public void close_the_application() throws Throwable {
		stopappium();
	}
	
}
