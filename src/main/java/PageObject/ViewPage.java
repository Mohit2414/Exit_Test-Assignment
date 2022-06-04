package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewPage extends BaseClass {

	public ViewPage() {
		PageFactory.initElements(new AppiumFieldDecorator(ad),this);
	}
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]")
	public MobileElement Viewsicon;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	public MobileElement Searchviewicon;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	public MobileElement Filtericon;
	
	@FindBy(id = "android:id/search_src_text")
	public MobileElement searchbtn;
	
	 public void Views_icon()
	    {
	    	Viewsicon.click();
	    }
	    public void SearchView_icon()
	    {
	    	Searchviewicon.click();
	    }
	    public void Filter_icon()
	    {
	    	Filtericon.click();
	    }
	    public void Search_bar(String Search)
	    {
	    	searchbtn.sendKeys(Search);
	    }
}