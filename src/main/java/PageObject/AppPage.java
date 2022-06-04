package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppPage extends BaseClass {
	public AppPage() {
		PageFactory.initElements(new AppiumFieldDecorator(ad),this);
	}
	@FindBy(id = "com.android.permissioncontroller:id/continue_button")
	public MobileElement Continuebtn;
	
	@FindBy(id = "android:id/button1")
	public MobileElement okbtn;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	public MobileElement Appicon;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public MobileElement Actionbaricon;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public MobileElement Displayicon;
	
	@FindBy(id = "demo.fun.com.apis:id/toggle_show_title")
	public MobileElement Showtitleicon;
	
	@FindBy(id = "demo.fun.com.apis:id/toggle_use_logo")
	public MobileElement ShowLogoicon;
	
	
	 public void Continuebutton() {
	      Continuebtn.click();
	    }
	    
	    public void Okbuttton() {
	      okbtn.click();
	    }
	    
	public void App_icon_click() {
	Appicon.click();
	}
	
	public void Actionbar_icon_click() {
	Actionbaricon.click();
	}
	
	public void Display_icon_click() {
	Displayicon.click();
	}
	
	public void Showtitle() {
	Showtitleicon.click();
	}
	
	public void Show_Logo() {
	ShowLogoicon.click();
	Assert.assertTrue(ShowLogoicon.isEnabled());
	}
}



