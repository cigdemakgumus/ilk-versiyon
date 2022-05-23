package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static <WebDriver> void main(String[] args) {
        //En ilkel haliyle bir otomasyon yapmak için calssımıza otomasyon için gerekli olan webdriver ın yerini göstermemiz gerekir.
        //Bunun için java kütüphanesinden System.setProperty() methodu kullanırız
        //Method 2 parametre istemektedir. ilki kullanacağımız driver: webdriver.chorome.driver
        //ikincisi ise bu driverin fiziki yolu:
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
                WebDriver driver= (WebDriver) new ChromeDriver();
        System.out.println("Hello world");




    }
}
