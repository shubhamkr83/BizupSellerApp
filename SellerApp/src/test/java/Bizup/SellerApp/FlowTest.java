package Bizup.SellerApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class FlowTest extends Base{

	@Test
	public void Enquiryvideoflow() throws InterruptedException {

	//Home home = new Home(driver);
	
	//Notification enable
	driver.findElement(By.id("android:id/button1")).click();
	
	//Allow Notification
	driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
	
	// Java
	
	WebElement firstImage = driver.findElement(By.xpath("//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup"));
	
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		"elementId", ((RemoteWebElement)firstImage).getId(),
	    "direction", "left",
	    "percent", 1.0
	));
	
	driver.findElement(By.xpath("")).click();
	
	driver.findElement(By.xpath("")).click();
	
	driver.findElement(By.xpath("")).click();
	
	driver.findElement(By.xpath("")).click();
	
	driver.findElement(By.xpath("")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
