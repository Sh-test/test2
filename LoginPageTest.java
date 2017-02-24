@Test
public void notValidLoginEmptyAllFields() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}

@Test
public void notValidLoginEmptyField() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().setLoginWithValidAllFields("");
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}


@Test
public void notValidPasswordEmpryField() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().setPasswordWithValidAllFields("");
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}


@Test
public void notValidLoginIncorrectField() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().setLoginWithValidAllFields("Sho-test");
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}


@Test
public void notValidPasswordIncorrectField() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().setPasswordWithValidAllFields("ik5kk2h");
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}


@Test
public void notValidLoginWithLowerLetters() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().setLoginWithValidAllFields("sho-test");
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}


@Test
public void notValidPasswordWithUpperLetters() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().setPasswordWithValidAllFields("ik5Ck2h");
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}


@Test
public void notValidLoginWithRussianLetters() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().setLoginWithValidAllFields("Sho-tåst");
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}


@Test
public void notValidPasswordWithRussianLetters() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().setPasswordWithValidAllFields("ik5ñk2h");
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}


@Test
public void validLogin() {
    app.getNavigationHelper().openLoginPage();
    app.getLoginHelper().setLoginWithValidAllFields("Sh-test");
    app.getLoginHelper().clickLogin();
    Assert.assertTrue(!app.getLoginHelper().isError());
}

















