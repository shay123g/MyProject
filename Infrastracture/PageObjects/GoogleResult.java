package PageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleResult
{
    //change all
    @FindBy(how = How.XPATH, using="//form[@id='tsf']/div[2]/div/div[1]/input")
    public WebElement putthecorrectvariable2;

    @FindBy(how = How.XPATH, using="//form[@id='tsf']/div[2]/div/div[3]/center/input[1]")
    public WebElement putthecorrectvariable1;
}
