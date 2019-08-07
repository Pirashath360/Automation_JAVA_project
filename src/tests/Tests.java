package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.TestPage;
import utils.Constants;
import utils.TestBase;

public class Tests extends TestBase {
	
    @Test
    public void testGenderlInformation(){
    	softAssert = new SoftAssert();
    	TestPage.tctusernameee(Constants.USERNAME);
    	TestPage.setPassword(Constants.PASSWORD);
    	TestPage.cliLoginh();

    }
}
