package Extensions;

import Utilities.CommonOperations;
import org.openqa.selenium.WebElement;

public class ClickButton extends CommonOperations
{
    public void Click(WebElement elem)
    {
        try
        {
            elem.click();
            //log to report PASS
        }
        catch (Exception e)
        {
            //log to report FAIL
            //fail
            System.out.println("failed");
        }
    }

}
