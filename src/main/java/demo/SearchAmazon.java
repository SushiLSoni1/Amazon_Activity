package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAmazon {
     ChromeDriver driver;
    public SearchAmazon()
    {
        System.out.println("Constructor: SearchAmazon");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

     public  void SearchAmazon() throws InterruptedException{
        System.out.println("Start Test case: SearchAmazon");
        //Navigate to url "https://www.google.com"
        driver.get("https://www.google.com");
        //Find element by id "APjFqb"
        WebElement search = driver.findElement(By.id("APjFqb"));
        //Enter text "Amazon" by using sendKeys
        search.sendKeys("Amazon");
        Thread.sleep(4000);
        //find element by xpath "//input[@name='btnK']" and click
        driver.findElement(By.xpath("//input[@name='btnK']")).click();
        //find element by xpath "//span[@class='x2VHCd OSrXXb ob9lvb']" and print the text
        WebElement output = driver.findElement(By.xpath("//span[@class='x2VHCd OSrXXb ob9lvb']"));
        System.out.println(output.getText());
        System.out.println("end Test case: SearchAmazon");
    }


    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
}
