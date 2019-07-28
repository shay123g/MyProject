package Extensions;

import Utilities.CommonOperations;
import org.openqa.selenium.WebElement;

public class FilltextField extends CommonOperations
{
    public void fill(WebElement elem, String value)
    {
        try
        {
            elem.sendKeys(value);
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
