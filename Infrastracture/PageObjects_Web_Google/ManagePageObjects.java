package PageObjects_Web_Google;

import Utilities.GlobalVariables;
import org.openqa.selenium.support.PageFactory;


public class ManagePageObjects extends GlobalVariables
{
    public static void InitializePages()
    {
        GoogleHomePage = PageFactory.initElements(driver, GoogleMainPage.class);
        ResultsPage = PageFactory.initElements(driver, GoogleResult.class);
    }
}
