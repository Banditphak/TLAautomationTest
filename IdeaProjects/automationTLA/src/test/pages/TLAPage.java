package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLAPage extends BasePage {
    protected WebDriver driver;

    public TLAPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div/nav[1]/a")
    public WebElement firstRow;
    @FindBy(xpath = "//div/nav[2]/a")
    public WebElement secondRow;
    @FindBy(xpath = "//div/a")
    public WebElement bottomRow;
}
