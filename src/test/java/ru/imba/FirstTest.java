package ru.imba;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://imba.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("IMBA — Академия цифрового бизнеса Ingate"));

        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"phone-block\"]/div[2]/a"));
        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"phone-block\"]/div[3]/a"));

        System.out.println(button1.isEnabled());
        System.out.println(button2.isEnabled());
    }
    @After
    public void  tearDown(){
        driver.close();
    }
}