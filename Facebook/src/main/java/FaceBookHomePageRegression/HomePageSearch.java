package FaceBookHomePageRegression;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageSearch extends CommonAPI {
    @FindBy(css ="#email")
    WebElement userName;
    @FindBy(css="#pass") WebElement userPassword;
    @FindBy (className = "_1frb") WebElement searchBoxOnMainPage;
    @FindBy(className="_1vp5") WebElement userProfileName;

    public void logInFacebook() {
        userName.sendKeys("sesire_islam@yahoo.com");
        userPassword.sendKeys("01711528942", Keys.ENTER);
    }
    public void clickOnProfileName() {
        userProfileName.click();
    }
    public void inputDataOnSearchBox() {
        searchBoxOnMainPage.sendKeys("Hira", Keys.ENTER);
    }
}