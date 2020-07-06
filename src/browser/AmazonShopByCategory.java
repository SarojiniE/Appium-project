package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonShopByCategory {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\SDET training\\geckodriver\\chromedriver_win32\\chromedriver.exe");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i")).click();
		driver.findElement(By.linkText("Shop by Category")).click();
		driver.findElement(By.xpath("(//*[@class = 'a-column a-span8 sbdTextTruncate sbdCategoryTitle sbdCategoryComponent']/span)[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"sbdCategory2\"]/div[2]/div/div[1]/a/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@class='a-icon a-icon-supplemental']/following-sibling::input")).click();
		driver.findElement(By.xpath("//*[@class= 'a-sheet-close a-icon a-icon-close-white a-focus-hidden']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"configuration-button\"]/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"configuration_1\"]/span/input")).click();
		driver.findElement(By.xpath("//*[@class='a-sheet-close a-focus-hidden']")).click();
		driver.findElement(By.xpath("//*[@class='a-button-text a-text-left']")).click();

	}

}
