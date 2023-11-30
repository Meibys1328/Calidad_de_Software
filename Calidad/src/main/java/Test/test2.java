package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class test2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver,", "C:\\Users\\Irma\\IdeaProjects\\Calidad\\src\\main\\resources\\driver\\msedgedriver.exe");

        //Inicializar navegador

        WebDriver driver = new EdgeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //driver.get("https://arrocha.com/account/login");
        driver.get("https://arrocha.com");
        driver.manage().window().maximize();

        String username = "Eliezer";
        String password = "Calidadsoftware2023";
        String id = "8-887-1845";
        String birth = "08-09-1994";
        String email = "eliezer0816@gmail.com";
        String celphone = "65268028";


        WebElement registerInput = driver.findElement(By.xpath("//*[@id=\"shopify-section-static-header\"]/div[1]/div[2]/ul/li/a"));



        //acciones

       // Thread.sleep(1500);
        registerInput.click();
       // Thread.sleep(1500);
        WebElement usernameInput = driver.findElement(By.id("customer_email"));
        WebElement passwordInput = driver.findElement(By.id("customer_password"));
        WebElement loginInput = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[3]/button"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginInput.click();
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement captchaInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='recaptcha-anchor']/div[1]")));
        Thread.sleep(4000);
        //WebElement captchaInput = driver.findElement(By.xpath("//*[@id=\"rc-anchor-container\"]/div[3]/div[1]/div"));
        //captchaInput.click();
        WebElement recaptcha = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"rc-anchor-container\\\"]/div[3]/div[1]/div")));
        //WebElement sendInput = driver.findElement(By.xpath("//*[@id=\"site-main\"]/div[2]/form/input[2]"));
        //sendInput.click();
        recaptcha.click();
    }

}

