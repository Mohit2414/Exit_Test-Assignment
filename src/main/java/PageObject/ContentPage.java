package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContentPage extends BaseClass{
	public ContentPage() {
		PageFactory.initElements(new AppiumFieldDecorator(ad),this);
	}
	
	@FindBy(xpath = "/hierarchy/.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
	public MobileElement Contenticon;
	
	@FindBy(id = "/hierarchy/android.widget.Frame/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public MobileElement Clipboardicon;
	
	public void Content_icon() {
		Contenticon.click();
	}
	public void Clipbaord_icon() {
		Clipboardicon.click();
	}

}
