package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public static String ssdir = System.getProperty("user.dir") + "/FailedScreenshots/";
	public static  AppiumDriver<MobileElement> ad;
	public static DesiredCapabilities ab;
	public static void launchapp() throws MalformedURLException {
		
		
		ab = new DesiredCapabilities();
		ab.setCapability("platformVersion", "11");
		ab.setCapability("platformName", "Android");
		ab.setCapability("appPackage", "demo.fun.com.apis");
		ab.setCapability("appActivity", "demo.fun.com.apis.ApiDemos");
		ab.setCapability("app", "C:/Users/mohitsharma10/Downloads/demo.fun.com.apis-v1.1.apk");
		ab.setCapability("deviceName", "Android");
		
		ad = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),ab);
		
	}
	public static void scroll() {

		List <MobileElement> lists = ad.findElements(By.xpath("//android.widget.TextView"));

		for(MobileElement e: lists)
		System.out.println(e.getAttribute("text"));
		Dimension di =  ad.manage().window().getSize(); 

		int startpointx = (int)(di.width *0.5);
		int startpointy = (int)(di.height *0.7);

		int endpointx = (int)(di.width * 0.2);
		int endpointy = (int)(di.height *0.3);

		TouchAction touch = new TouchAction(ad);
		touch.press(PointOption.point(startpointx, startpointy))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(endpointx, endpointy)).release().perform();
	}
	
	public void stopappium() {
			ad.quit();
		}
	public static AppiumDriver<MobileElement> getDriver() {
		return ad;
		}
		
	}

