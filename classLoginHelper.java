package login.com.github.logic;

public class LoginHelper extends DriverBasedHelper implements ILoginHelper {

    private final String username = "Sh-test";
    private final String password = "ik5ck2h";

    private ApplicationManager manager;

    public LoginHelper(ApplicationManager applicationManager) {
        super(applicationManager.getWebDriver());
        this.manager = applicationManager;
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    public void setLoginWithValidAllFields(String login) {
        pages.loginPage.setLogin(login).setPassword(password);
        
    }

    public void setPasswordWithValidAllFields(String password) {
        pages.loginPage.setLogin(login).setPassword(password);
        
    }
    public void clickLogin() {
        pages.loginPage.clickSubmitButton();
    }

    public boolean isError() {
        return pages.loginPage.isError();
    }
  
}
