import org.junit.Test22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings
{
    @Test2
    public void firstTest()
    {
        driver.get("https://loveandlive.ua/");
        WebElement pageLogo = null;
        try
        {
           pageLogo = driver.findElement(By.xpath("//*[@class='logo']"));
        }
        catch (Exception e)
        {
            System.out.println("Page not found");
        }
        if(pageLogo.isDisplayed())
        {
            System.out.println("Страница найдена");
        }
        try
        {
            driver.findElement(By.xpath("//*[@class='menu-link menu-link--current']")).click();
        }
        catch (Exception e)
        {
            System.out.println("Page isn't opened");
        }
    }
}
