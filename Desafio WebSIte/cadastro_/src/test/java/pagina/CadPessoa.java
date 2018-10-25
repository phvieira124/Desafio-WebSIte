package pagina;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CadPessoa {

	static WebDriver driver;

	public CadPessoa(WebDriver driver) {
		this.driver = driver;

	}

	
	public void preencherCampos() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("admin@phptravels.com");

		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("demoadmin");

		WebElement entrar = driver.findElement(By.xpath("/html/body/div[1]/form[1]/button"));
		entrar.click();

	}

	public void menu(String menu, String botao) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement opcoes = driver.findElement(By.xpath("//a[contains(.,'" + menu + "')]"));
		opcoes.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement opcao = driver.findElement(By.xpath("//a[contains(.,'" + botao + "')]"));
		opcao.click();

	}

	public void cadastro() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement opcoes = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/button"));
		opcoes.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Nome = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[1]/div/input"));
		Nome.sendKeys("Pedro");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement sobrenome = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[2]/div/input"));
		sobrenome.sendKeys("Pedro");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[3]/div/input"));
		email.sendKeys("Pedro");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement senha = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[4]/div/input"));
		senha.sendKeys("Pedro");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement celular = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[5]/div/input"));
		celular.sendKeys("Pedro");
		
			
		WebElement selecionar = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input"));
		selecionar.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Input = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input"));
		Input.click();
		Input.sendKeys("Brazil");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Enter = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input"));
		Enter.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
											
		
		WebElement Endereco_1 = driver.findElement(By.name("address1"));
		Endereco_1.sendKeys("Rua 1");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement Endereco_2 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[9]/div/input"));
		Endereco_2.sendKeys("Rua 2");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
					
		
		WebElement box1 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[11]/div/div/div/select"));
		box1.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement box2 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[11]/div/div/div/select"));
		box2.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
				
		WebElement Nome_fornecedor = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[14]/div/input"));
		Nome_fornecedor.sendKeys("PE");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement Notificacao = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[15]/div/div/label/div/ins"));
		Notificacao.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement escolha = driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/ul"));
		escolha.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement escolha2 = driver.findElement(By.xpath("//*[@id=\"s2id_autogen5\"]/ul"));
		escolha2.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement escolha3 = driver.findElement(By.xpath("//*[@id=\"s2id_autogen7\"]/ul"));
		escolha3.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement icone = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[22]/div[1]/div/div[2]/ul/li[3]/label/div/ins"));
		icone.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement icone1 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[22]/div[2]/div/div[2]/ul/li[1]/label/div/ins"));
		icone1.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement icone2 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[22]/div[3]/div/div[2]/ul/li[4]/label/div/ins"));
		icone2.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement icone3 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[3]/button"));
		icone3.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
			
				
	}
	
	

	
		
	public void closeDriver() {
		driver.close();
	}

}