package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver,", "C:\\Users\\Irma\\IdeaProjects\\Calidad\\src\\main\\resources\\driver\\msedgedriver.exe");

        // Inicializar navegador
        WebDriver driver = new EdgeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://arrocha.com");
        driver.manage().window().maximize();

        String search = "Crema";
        String cant = "2";

        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"boost-pfs-search-box-0\"]"));
        WebElement btn_search = driver.findElement(By.xpath("//*[@id=\"shopify-section-static-header\"]/div[1]/div[1]/div[2]/form/div[1]/button[2]"));

        searchInput.sendKeys(search);
        btn_search.click();

        // Desplazamiento hacia abajo
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", ""); // Ajusta este valor según sea necesario

        WebElement clickInput = driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15818701078683__main\"]/div[2]/div[2]/ul/li[1]/div/a/figure/img"));
        clickInput.click();

        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("window.scrollBy(0,300)", "");

        WebElement cantInput = driver.findElement(By.id("product-quantity-select"));
        cantInput.click();
        cantInput.sendKeys(cant);

        WebElement carshopInput = driver.findElement(By.xpath("//*[@id=\"product_form_5791794823323\"]/div[1]/button"));
        carshopInput.click();

        // Agregar un tiempo de espera de 2 segundos
        Thread.sleep(2000);

        WebElement viewcarInput = driver.findElement(By.xpath("//*[@id=\"shopify-section-static-header\"]/div[1]/div[2]/div"));
        viewcarInput.click();

        Thread.sleep(2000);

        WebElement quitInput = driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15818699440283__main\"]/form/section/div[1]/ul/li/div/div[2]/div[3]/a"));
        quitInput.click();

        Thread.sleep(2000);

        WebElement quittInput = driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15818699440283__main\"]/form/section/div[1]/ul/li/div/div[2]/div[3]/a"));
        quittInput.click();

        Thread.sleep(8000);

        driver.quit();

    }
}