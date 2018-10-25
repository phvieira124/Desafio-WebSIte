package teste;




import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagina.CadPessoa;

public class CadTest {

	static WebDriver driver;
	static CadPessoa cadPessoa;
	
	
	@BeforeClass
	public static void Acessar_Navegador() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro\\Desktop\\Projeto Inmetrics\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
		cadPessoa = new CadPessoa(driver);
		
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
	}
		
	@Test
	public void Preenchimento_campos() {
	
		
		
			try {
			cadPessoa.preencherCampos();
			cadPessoa.menu("Accounts", "Suppliers");
			cadPessoa.cadastro();	
			cadPessoa.closeDriver();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
