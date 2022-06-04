package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NFCPage extends BaseClass {
	public NFCPage() {
		PageFactory.initElements(new AppiumFieldDecorator(ad),this);
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[7]")
	public MobileElement NFCicon;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	public MobileElement TechFiltericon;
	
	 public void NFC_icon()
	    {
	    	NFCicon.click();
	    }
	    public void TechFilter_icon()
	    {
	    	TechFiltericon.click();
	    }

}
