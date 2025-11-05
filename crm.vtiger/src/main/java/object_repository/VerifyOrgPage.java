package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyOrgPage {
	//initialization
	public VerifyOrgPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//declaration
	@FindBy(id = "dtlview_Organization Name")
	private WebElement actOrgName;

	//getters
	public WebElement getActOrgName() {
		return actOrgName;
	}
}
