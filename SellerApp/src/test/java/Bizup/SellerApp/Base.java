package Bizup.SellerApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException, URISyntaxException {
		// Run appium server automatically
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		// Create capablities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("samsung SM-E146B");
		// options.setDeviceName("Xiaomi Redmi Y1");
		options.setApp("C:\\Users\\lenovo\\eclipse-workspace\\SellerApp\\src\\test\\java\\resources\\app-debug-4.apk");

		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterClass
	public void TearDown() {
		driver.quit();
		service.stop();
	}

}
