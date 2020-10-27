package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {

    private WebDriver driver;

    public static void main (String args[]){
        BaseTest test = new BaseTest();
        test.setUp();

    }

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","CursoAutomacaoDeTestes/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
       System.out.println("Sistema acessado: " +" "+ driver.getTitle());

       clickLink();

    }


    public void clickLink(){
        WebElement inputLink = driver.findElement(By.linkText("Shifting Content"));
        inputLink.click();

        WebElement linkExample1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        linkExample1.click();

        List<WebElement> linksMenu = driver.findElements(By.tagName("li"));
        System.out.println("Quantidade de Links Menu"+ linksMenu.size());

    }

}
