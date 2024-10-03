package initialTests;

import initialTests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindElementsTest extends BaseTest {
    //public static final String locator = "//input[@class='input_error form_input'] | //input[@text()='%s']";
    /*private String uname = "%s";
    private static final By PASS = By.id("password");*/

    @Test
    public void firstTest() {  //Task1
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name"));
        driver.findElement(By.xpath("//input[@id='user-name']"));
        //driver.findElement(By.xpath(String.format("standard_user", locator))).click();
        driver.findElement(By.cssSelector("[id='user-name']"));
        driver.findElement(By.name("user-name"));
        driver.findElement(By.className("login_logo"));
        driver.findElement(By.tagName("input"));
        //driver.findElement(By.linkText("text"));
        //driver.findElement(By.partialLinkText("tex"));
        driver.findElement(By.xpath("//input[@id='user-name']"));
        driver.findElement(By.cssSelector("[class='submit-button btn_action']"));
        driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]"));
        driver.findElement(By.xpath("//input[contains(@id,'user')]"));
        driver.findElement(By.xpath("//input[@id='login-button' and @type='submit']"));
        driver.findElement(By.xpath("//input[@id='login-button'] | //input[@type='submit']"));
        driver.findElement(By.xpath("//div[@class='login_logo']//ancestor::div"));
        driver.findElement(By.xpath("//div[@class='login_logo']//parent::div"));
        driver.findElement(By.xpath("//div[@class='login_logo']//preceding::*"));
        driver.findElement(By.xpath("//div[@class='login_container']//descendant::div"));
        driver.findElement(By.xpath("//div[@class='login_container']//following::*"));
        driver.findElement(By.cssSelector("[class='login_credentials']"));
        driver.findElement(By.cssSelector(".login_credentials"));
        //driver.findElement(By.cssSelector(".login_container.login_wrapper"));
        driver.findElement(By.cssSelector(".login_container .login_wrapper"));
        driver.findElement(By.cssSelector("#user-name"));
        driver.findElement(By.cssSelector("input"));
        driver.findElement(By.cssSelector("div.login_logo"));
        driver.findElement(By.cssSelector("[id='user-name']"));
        driver.findElement(By.cssSelector("[id~='user-name']"));
        driver.findElement(By.cssSelector("[id|='user']"));
        driver.findElement(By.cssSelector("[id^='user']"));
        driver.findElement(By.cssSelector("[id$='name']"));
        driver.findElement(By.cssSelector("[id*='name']"));
    }

    /*@Test
    public void clickOnForm() {  //Task2.1
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
        //username.sendKeys("standard_user");
        username.sendKeys(String.format("standard_user", uname));
        //WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement password = driver.findElement(PASS);
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement logo = driver.findElement(By.cssSelector("[class='app_logo']"));
        assertTrue(logo.isDisplayed(), "You are not entered the system");
        //assertFalse(logo.isEnabled(), "error");
    }

    @Test
    public void addItemToBasketAndCheck() {  //Task2.2
        clickOnForm();
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
        WebElement basketButton = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        basketButton.click();

        String itemActual = driver.findElement(By.cssSelector("[data-test='inventory-item-name']")).getText();
        String itemExpected = "Sauce Labs Backpack";
        assertEquals(itemActual, itemExpected, "Error, not right item added.");

        *//*String itemCostActual = driver.findElement(By.cssSelector("[data-test='inventory-item-price']")).getText();
        String itemCostExpected = "$29.99";
        assertEquals(itemCostActual, itemCostExpected, "Error, not right item cost.");*//*
        String itemCostActualInitial = driver.findElement(By.cssSelector("[data-test='inventory-item-price']")).getText();
        String str = itemCostActualInitial.substring(1);
        double itemCostActual = Double.parseDouble(str);
        double itemCostExpected = 29.99;
        assertEquals(itemCostActual, itemCostExpected, "Error, cost doesn't match");
        //assertNotEquals(itemCostActual, itemCostExpected, "Error, cost doesn't match");
    }*/
}