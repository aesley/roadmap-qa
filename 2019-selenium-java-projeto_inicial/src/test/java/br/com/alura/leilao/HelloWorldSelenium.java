    package br.com.alura.leilao;

    import org.junit.jupiter.api.Test;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class HelloWorldSelenium {

        @Test
        public void hello(){
            System.setProperty("webdriver.chrome.driver", "/home/aes/Documentos/Projetos/2019-selenium-java-projeto_inicial/drivers/chromedriver");
            WebDriver browser = new ChromeDriver();
            browser.navigate().to("http://localhost:8080/leiloes");
            browser.quit();
        }
    }
