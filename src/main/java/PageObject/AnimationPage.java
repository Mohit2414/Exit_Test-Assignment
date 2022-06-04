package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AnimationPage extends BaseClass{
	public AnimationPage() {
		PageFactory.initElements(new AppiumFieldDecorator(ad),this);
	}
	
	@FindBy(id = "com.android.permissioncontroller:id/continue_button")
	public MobileElement Continuebtn;
	
	@FindBy(id = "android:id/button1")
	public MobileElement okbtn;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public MobileElement Animation;

	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")
	public MobileElement Hideshow;

	@FindBy(id="demo.fun.com.apis:id/customAnimCB")
	public MobileElement Checkbox;

	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement number;

	@FindBy(id="demo.fun.com.apis:id/addNewButton")
	public MobileElement display;

    public void Continuebutton()
    {
      Continuebtn.click();
    }
    
    public void Okbuttton()
    {
      okbtn.click();
    }
    
	public void animationbtn()
	{
	  Animation.click();
	}
	
	public void hideshowbtn()
	{
	  Hideshow.click();
	}
	
	public void checkbox() 
	{
	Checkbox.click();
	}
	
	public void Nobtn()
	{
	number.click();
	Assert.assertTrue(number.isDisplayed());
	}
	
	public void displaybtn()
	{
	display.click();
	Assert.assertTrue(display.isDisplayed());

	}
	}

