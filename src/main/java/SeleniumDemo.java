import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", args[0]);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/");
        System.out.println("Page Open");
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();
    }
}
