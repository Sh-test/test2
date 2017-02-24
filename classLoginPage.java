package login.com.github;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AnyPage{

   

    @FindBy(id = "login_field")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(name = "commit")
    private WebElement submitButton;

    @FindBy(href= "password_reset")
    private WebElement errorText;

    public LoginPage(PageManager pages) {
        super(pages);
    }

  
    public LoginPage setLogin(String login){
        loginField.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

  
   
    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isError() {
        if(errorText.isDisplayed()) {
            return true;
        } else {
            return false;
        }
}
