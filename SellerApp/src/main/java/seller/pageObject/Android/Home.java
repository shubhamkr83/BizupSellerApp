package seller.pageObject.Android;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//import buyer.pageObjects.Android.Search;

public class Home {

	AndroidDriver driver;

	public Home(AndroidDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
/*
	@AndroidFindBy(xpath="")private WebElement;

	@AndroidFindBy(xpath="")private WebElement;

	@AndroidFindBy(xpath="")private WebElement;

	@AndroidFindBy(xpath="")private WebElement;

	@AndroidFindBy(xpath="")private WebElement;

	@AndroidFindBy(xpath="")private WebElement;

	@AndroidFindBy(xpath="")private WebElement;

	@AndroidFindBy(xpath="")private WebElement;

	@AndroidFindBy(xpath="")private WebElement;

	public void()

	{
		.click();
	}

	public void()
	{
		.click();
	}

	public void()
	{
		.click();
	}

	public void()
	{
		.click();
	}public void()
	{
		.click();
	}

	public void()
	{
		.click();
	}

	public void()
	{
		.click();
	}

	public void()
	{
		.click();
	}

	public void()
	{
		.click();
	}

	public void()
	{
		.click();
	}
	*/
}
