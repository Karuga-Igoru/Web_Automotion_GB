package HW3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HW3Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://swgoh.gg");

        System.out.println("Is authorization works: " + authorizationCheck(driver, "gb_test_account","Password!1"));
        System.out.println("Is filtering works: " + filterAdding(driver));

        driver.close();
    }

    static boolean authorizationCheck(WebDriver driver, String login, String password) {
        WebElement loginButton = driver.findElement(By.linkText("Log In"));
        loginButton.click();

        WebElement loginField = driver.findElement(By.id("id_login"));
        loginField.click();
        loginField.sendKeys(login);

        WebElement passwordField = driver.findElement(By.id("id_password"));
        passwordField.click();
        passwordField.sendKeys(password);

        WebElement submitButton = driver.findElement(By.cssSelector(".primaryAction"));
        submitButton.click();

        WebElement loginButton2 = driver.findElement(By.linkText(login));
        return loginButton2.isEnabled();
    }

    static boolean filterAdding (WebDriver driver) {
        WebElement addFilterButton = driver.findElement(By.xpath("//button[@data-target='#filterModal']"));
        addFilterButton.click();

        WebElement addBadBatchButton = driver.findElement(By.xpath("//a[@href='/characters/f/bad-batch/?']"));
        addBadBatchButton.click();

        WebElement checking1 = driver.findElement(By.xpath("//a[@href='/?']"));

        //WebElement checking2 = driver.findElement(By.xpath("xpath=//li[@data-name-lower='echo']/a/div/h5"));

        String checking1result = checking1.getText();
        return checking1result.equals("Bad Batch");
    }


}
