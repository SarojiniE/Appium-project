package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonSignUp {

	public static void main(String[] args) throws MalformedURLException {
		//1. Amazon Sign Up Test case
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\SDET training\\geckodriver\\chromedriver_win32\\chromedriver.exe");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		
		driver.findElement(MobileBy.xpath("//i[@class='nav-icon-a11y nav-sprite']")).click();
		driver.findElement(MobileBy.xpath("//a[text()='Account']")).click();
		driver.findElement(MobileBy.xpath("//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']")).click();
		driver.findElement(MobileBy.xpath("//input[@id='ap_customer_name']")).sendKeys("Sarojini");
		driver.findElement(MobileBy.xpath("//input[@id='ap_phone_number']")).sendKeys("9503418765");
		driver.findElement(MobileBy.xpath("//input[@id='ap_email']")).sendKeys("sarojini.emekar4@gmail.com");
		driver.findElement(MobileBy.xpath("//input[@id='ap_password']")).sendKeys("Password@123");
		driver.findElement(MobileBy.xpath("//input[@id='continue']")).click();
		System.out.println(driver.findElement(MobileBy.xpath("//h4[text()='Mobile number already in use']")).getText());
		
//		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.amazon.mShop.android.shopping");
//		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.windowshop.home.HomeLauncherActivity");
//		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.ImageView[1]")).click();
//		driver.findElement(MobileBy.id("in.amazon.mShop.android.shopping:id/new_user")).click();
		
	}

}
