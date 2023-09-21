package br.com.interato;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest  {
      protected  WebDriver driver;

    @Before
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://hml-8l8oy.ondigitalocean.app/login/interato");
         driver.findElement(By.id("email")).sendKeys("interato.softmakers@gmail.com");
        driver.findElement(By.id("password")).sendKeys("XFeh%lRgL02TPE98");
        driver.findElement(By.cssSelector("body > div.flex.h-screen.w-screen.p-4.items-center.justify-center.bg-gray-50 > div > form > button")).click();
       
}

public void waiting() {
    try {
        // Pausa a execução por 3 segundos
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // Tratamento da exceção
        e.printStackTrace();
    }
}

}
