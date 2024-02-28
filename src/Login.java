import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");
        WebElement pswd = driver.findElement(By.id("password"));
        pswd.sendKeys("SuperSecretPassword!");
        WebElement btn = driver.findElement(By.className("radius"));
        btn.click();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
}
