package test.java.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class HWwaits {
    protected WebDriver driver;
    By signInButton = By.cssSelector("a[data-nav-ref=\"nav_ya_signin\"]");
    By createAccount = By.id("createAccountSubmit");
    By continueButton = By.id("continue");

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void signInTestCustomerNameRedBorder(){
        By customerName = By.id("ap_customer_name");
        WebDriverWait wait = new WebDriverWait(driver,10, 500);
        driver.get("https://www.amazon.com/");
        driver.findElement(signInButton).click();
        driver.findElement(createAccount).click();
        driver.findElement(continueButton).click();
        WebElement enterName = driver.findElement(customerName);
        wait.until(ExpectedConditions.elementToBeClickable(enterName)).click();
        String expectedColor = ("rgb(221, 0, 0)");
        String actualColor = enterName.getCssValue("border-color");
        assertEquals(actualColor, expectedColor);
    }

    @Test
    public void EmailInputRedBorder(){
        By email = By.id("ap_email");
        WebDriverWait wait = new WebDriverWait(driver,10, 500);
        driver.get("https://www.amazon.com/");
        driver.findElement(signInButton).click();
        driver.findElement(createAccount).click();
        driver.findElement(continueButton).click();
        WebElement enterEmail = driver.findElement(email);
        wait.until(ExpectedConditions.elementToBeClickable(enterEmail)).click();
        String expectedColor = ("rgb(221, 0, 0)");
        String actualColor = enterEmail.getCssValue("border-color");
        assertEquals(actualColor, expectedColor);
    }

    @Test
    public void PasswordInputRedBorder(){
        By password = By.id("ap_password");
        WebDriverWait wait = new WebDriverWait(driver,10, 500);
        driver.get("https://www.amazon.com/");
        driver.findElement(signInButton).click();
        driver.findElement(createAccount).click();
        driver.findElement(continueButton).click();
        WebElement enterPassword = driver.findElement(password);
        wait.until(ExpectedConditions.elementToBeClickable(enterPassword)).click();
        String expectedColor = ("rgb(221, 0, 0)");
        String actualColor = enterPassword.getCssValue("border-color");
        assertEquals(actualColor, expectedColor);
    }

    @Test
    public void NegativeReEnterPasswordRedBorder(){
        By customerName = By.id("ap_customer_name");
        By email = By.id("ap_email");
        By password = By.id("ap_password");
        By secondPass = By.id("ap_password_check");

        driver.get("https://www.amazon.com/");
        driver.findElement(signInButton).click();
        driver.findElement(createAccount).click();
        WebDriverWait wait = new WebDriverWait(driver,10, 500);
        driver.findElement(customerName).sendKeys("Anastasiia");
        driver.findElement(email).sendKeys("NastyaDzy@Gmail.com");
        driver.findElement(password).sendKeys("qwerttyyuu");
        driver.findElement(continueButton).click();

        WebElement reEnterPassword = driver.findElement(secondPass);
        wait.until(ExpectedConditions.elementToBeClickable(secondPass)).click();
        String expectedColor = ("rgb(221, 0, 0)");
        String actualColor = reEnterPassword.getCssValue("border-color");
        assertEquals(actualColor, expectedColor);
    }

    @Test
    public void noRedBorderEnterCustomerName(){
        By customerName = By.id("ap_customer_name");
        By email = By.id("ap_email");
        By password = By.id("ap_password");
        By secondPass = By.id("ap_password_check");
        driver.get("https://www.amazon.com/");
        driver.findElement(signInButton).click();
        driver.findElement(createAccount).click();
        WebDriverWait wait = new WebDriverWait(driver,10, 500);
        driver.findElement(customerName).sendKeys("Anastasiia");
        driver.findElement(email).sendKeys("NastyaDzy@Gmail.com");
        driver.findElement(password).sendKeys("qwerttyyuu");
        driver.findElement(continueButton).click();

        WebElement borderOfName = driver.findElement(customerName);
        wait.until(ExpectedConditions.elementToBeClickable(customerName));
        String expectedColorName = ("rgb(221, 0, 0)");
        String actualColorName = borderOfName.getCssValue("border-bottom-color");
        assertNotSame(expectedColorName, actualColorName);

        WebElement borderOfEmail = driver.findElement(email);
        wait.until(ExpectedConditions.elementToBeClickable(email));
        String expectedColorEmail = ("rgb(221, 0, 0)");
        String actualColorEmail = borderOfEmail.getCssValue("border-bottom-color");
        assertNotSame(expectedColorEmail, actualColorEmail);

        WebElement borderOfPass = driver.findElement(password);
        wait.until(ExpectedConditions.elementToBeClickable(password));
        String expectedColorPass = ("rgb(221, 0, 0)");
        String actualColorPass = borderOfPass.getCssValue("border-bottom-color");
        assertNotSame(expectedColorPass, actualColorPass);

        WebElement reEnterPassword = driver.findElement(secondPass);
        wait.until(ExpectedConditions.elementToBeClickable(secondPass)).click();
        String expectedColor = ("rgb(221, 0, 0)");
        String actualColor = reEnterPassword.getCssValue("border-color");
        assertEquals(actualColor, expectedColor);
    }
}