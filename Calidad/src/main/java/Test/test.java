package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class test {

    public static void main(String[] args) {
        // Establecer la propiedad del sistema para el driver de Edge
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Irma\\IdeaProjects\\Calidad\\src\\main\\resources\\driver\\msedgedriver.exe");

        // Inicializar el WebDriver para Edge
        WebDriver driver = new EdgeDriver();

        // Configurar un tiempo de espera explícito
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Abrir la URL en el navegador
        driver.get("https://arrocha.com");

        // Maximizar la ventana del navegador
        driver.manage().window().maximize();

        // Datos de usuario para el formulario
        String username = "Eliezer";
        String password = "Calidadsoftware2023";
        String id = "8-887-1845";
        String birth = "08-09-1994";
        String email = "eliezer0816@gmail.com";
        String celphone = "65268028";

        // Localizar los elementos del formulario y realizar acciones sobre ellos
        // Esperar hasta que el elemento esté visible y luego interactuar con él
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("686772")));
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("119233")));

        // Localizar otros elementos del formulario por nombre
        WebElement idInput = driver.findElement(By.name("identificacin_cdula_o_pasap"));
        WebElement birthInput = driver.findElement(By.name("fecha_de_nacimiento"));
        WebElement sexInput = driver.findElement(By.name("sexo"));
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement celphoneInput = driver.findElement(By.name("phone"));

        // Localizar el botón de condiciones y el botón de registro por ID y XPath, respectivamente
        WebElement cndInput = driver.findElement(By.id("199093"));
        WebElement registerbtnInput = driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div/div/div[3]/button[2]"));

        // Rellenar el formulario con los datos proporcionados
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        idInput.sendKeys(id);
        birthInput.sendKeys(birth);
        sexInput.click(); // Suponiendo que hace clic en una opción de género
        emailInput.sendKeys(email);
        celphoneInput.sendKeys(celphone);

        // Hacer clic en las condiciones y luego en el botón de registro
        cndInput.click();
        registerbtnInput.click();

        // Cerrar el navegador después de completar las acciones
        driver.quit();
    }
}
