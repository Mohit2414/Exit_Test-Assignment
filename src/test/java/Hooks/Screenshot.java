package Hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.service.ExtentTestManager;
import Base.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Screenshot {
	
	public static String getBase64Screenshot() throws IOException {
	
	return ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
	
	@After
	public void af(Scenario scenario) throws IOException 
	{
		if (scenario.isFailed()) {
			
	ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());
	Date dat = new Date();
	File src = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.FILE);
	SimpleDateFormat Sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
	String sdat = Sdf.format(dat);
	FileUtils.copyFile(src, new File((BaseClass.ssdir) + "image_" + sdat + ".png"));
	}
	}



}
