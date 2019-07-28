package Utilities;

import PageObjects_Web_Google.GoogleMainPage;
import PageObjects_Web_Google.GoogleResult;
import org.openqa.selenium.WebDriver;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GlobalVariables
{
    public static WebDriver driver;
    public static GoogleMainPage GoogleHomePage;
    public static GoogleResult ResultsPage;


    public static String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());


}
