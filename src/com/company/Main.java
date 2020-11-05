package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        //nastavte si prosím cestu k svemu driveru
        System.setProperty("webdriver.gecko.driver", "C:\\DevGit\\geckodriver.exe");

        //muzete pouzit FirefoxOptions pokud chete nebo jste meli problem s firefox binary
        WebDriver browser = new FirefoxDriver();

        // metody ktere budeme pouzivat muzou vyhodit vyjimku a proto budeme operace delat v bloku try
        try {

            // do toho bloku piste kod
            browser.navigate().to("http://czechitas-shopizer.azurewebsites.net/shop/");

            //search box element
            WebElement element = browser.findElement(By.id("qqqqqqq"));

            Thread.sleep(2000);


        } catch (Exception ex) {
            // catch blok slouzi ke zpracovani vyjimky, v nasem pripade nechame vyjimku byt
            System.out.println("Bohuzel doslo k chybe. Jedna z poslednich informaci by mel byt: (Main.java:**cislo radku kde chyba vznikla**) ");

        } finally {
            // blok finally nam v tomto pripade poslouzi k tomu aby se WebDriver ukoncil spravne za kazdych okolnosti

            browser.quit();
        }
    }
}
