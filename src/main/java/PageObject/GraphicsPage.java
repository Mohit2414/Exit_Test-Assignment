package PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GraphicsPage extends BaseClass {
	public GraphicsPage() {
		PageFactory.initElements(new AppiumFieldDecorator(ad),this);
	}
	
	@FindBy(id = "com.android.permissioncontroller:id/continue_button")
	public MobileElement Continuebtn;
	
	@FindBy(id = "android:id/button1")
	public MobileElement okbtn;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public MobileElement graphicsicon;
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public MobileElement BitmapMeshicon;
	
	 public void Continuebutton()
	    {
	      Continuebtn.click();
	    }
	    
	    public void Okbuttton()
	    {
	      okbtn.click();
	    }
	    public void Graphics_icon()
	    {
	    	graphicsicon.click();
	    }
	    public void BitmapMesh_icon()
	    {
	    	BitmapMeshicon.click();
	    }
	

}
