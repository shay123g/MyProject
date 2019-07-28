package PageObjects_Web_Google;

import Utilities.ProjectVariables;
import org.openqa.selenium.support.PageFactory;


public class ManagePageObjects extends ProjectVariables
{
    public static void InitializePages()
    {
        GoogleHomePage = PageFactory.initElements(driver, GoogleMainPage.class);
        ResultsPage = PageFactory.initElements(driver, GoogleResult.class);
    }
}
