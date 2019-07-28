package PageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleResult
{
    @FindBy(how = How.ID, using="hdtb-tls")
    public WebElement ToolsTab;

    @FindBy(how = How.XPATH, using="//div[@class='hdtb-mn-hd']/span")
    public WebElement ToolsDropDownArrow;

    @FindBy(how = How.XPATH, using="//div[@class='hdtb-td-o']/ul/li[2]")
    public WebElement TimeSelection;

    @FindBy(how = How.XPATH, using="//div[@class='hdtb-mn-hd hdtb-tsel']/div")
    public WebElement SelectedTime;

}
