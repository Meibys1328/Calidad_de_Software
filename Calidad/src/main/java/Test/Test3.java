package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.edge.EdgeOptions;

public class Test3 {
    public static void main(String[] args) {
        // Configuración del driver de Edge
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Irma\\IdeaProjects\\Calidad\\src\\main\\resources\\driver\\msedgedriver.exe");

        // Configuración de opciones para Edge
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        // Iniciar el navegador con opciones
        WebDriver driver = new EdgeDriver(options);

        // Navegar a la URL
        driver.get("https://arrocha.com");
        driver.manage().window().maximize();

        // Configurar espera explícita
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Datos de prueba
        String contact = "Eliezer";
        String email = "eliezer0816@outlook.com";
        String cellphone = "65667845";
        String message = "Hola para preguntar sobre una crema Cerave para la cara que me interesa saber si funciona para el Acne";

        // Interactuar con elementos web
        WebElement contactus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='site-header-nav']/nav/ul[1]/li[2]/a")));
        contactus.click();

        WebElement contactInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contact_name")));
        WebElement emailInput = driver.findElement(By.id("contact_email"));
        WebElement phoneInput = driver.findElement(By.id("contact_phone"));
        WebElement messageInput = driver.findElement(By.id("contact_message"));

        contactInput.sendKeys(contact);
        emailInput.sendKeys(email);
        phoneInput.sendKeys(cellphone);
        messageInput.sendKeys(message);

        // Esperar a que el botón de envío sea clickeable
        WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_form']/div/div[4]/button")));

        // Scroll hasta el botón de envío
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sendButton);

        // Hacer clic en el botón de envío
        sendButton.click();

        // Cerrar el navegador al final de las pruebas
        driver.quit();
    }
}

