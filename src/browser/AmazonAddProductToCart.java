package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonAddProductToCart {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\SDET training\\geckodriver\\chromedriver_win32\\chromedriver.exe");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		
		driver.findElement(MobileBy.xpath("//input[@type='text']")).sendKeys("iphone 7s plus");
		driver.findElement(MobileBy.xpath("//div[@class='suggest_link2']")).click();
		driver.findElement(MobileBy.xpath("//span[text()='Apple iPhone 7 (32GB) - Black']")).click();
		driver.findElement(MobileBy.xpath("//*[@class='a-size-base a-color-base a-text-normal']")).click();
		driver.findElement(MobileBy.xpath("//*[@class='a-sheet-close a-icon a-icon-close-white a-focus-hidden']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(MobileBy.xpath("//*[@class='a-icon a-icon-supplemental']/following-sibling::input")).click();
		driver.findElement(MobileBy.xpath("(//*[@class='a-button-input' and @type='submit'])[9]")).click();
		driver.findElement(MobileBy.xpath("//*[@class='a-sheet-close a-focus-hidden']")).click();
		driver.findElement(MobileBy.xpath("//*[@class='a-button-text a-declarative']")).click();
		driver.findElement(MobileBy.xpath("//*[@id='mobileQuantityDropDown_4']")).click();
		driver.findElement(MobileBy.xpath("//*[@class='a-button-text a-text-left']")).click();

		
	}

}
