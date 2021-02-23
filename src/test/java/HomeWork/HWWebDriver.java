package test.java.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HWWebDriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        By buttonInner = By.cssSelector("span[class = 'a-button-inner']");
        By todaysDeal = By.cssSelector("a[data-csa-c-slot-id=\"nav_cs_0\"]");
        By priceLocator = By.cssSelector("span[class = 'gb-font-size-medium inlineBlock unitLineHeight dealPriceText']");

        driver.get("https://www.amazon.com/");
        driver.findElement(buttonInner).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(buttonInner));

        driver.findElement(todaysDeal).click();

        WebElement price = driver.findElement(priceLocator);
        String text = price.getText().replace("$", "");
        System.out.println("The price is " + text);
        driver.quit();
    }
}

