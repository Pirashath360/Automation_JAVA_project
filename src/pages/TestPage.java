package pages;

import org.openqa.selenium.By;

import utils.PageBase;

public class TestPage extends PageBase {
	
	private static By tctUsername =By.id("txtUsername");
	private static By tctPassword =By.id("txtPassword");
	private static By cliLogin =By.id("btnLogin");

	
public static void tctusernameee(String naw) {
	getDriver().findElement(tctUsername).sendKeys(naw);
}
	
public static void setPassword(String password) {
getDriver().findElement(tctPassword).sendKeys(password);
}

public static void cliLoginh() {
getDriver().findElement(cliLogin).click();
}




	
	
}
