package br.com.common;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.utils.Utils;

public class LoginPage {
	
	/**
	 * @author Massayoshi Campos
	 * Criado em Janeiro/2020
	 * @throws InterruptedException
	 * @version 1.0.0
	 * @since Release 1.0
	 * 
	 */	

	/**
	 * Instancia privada do WebDriver que chama a suite de teste.
	 */
	private static final WebDriver driver;
	private static final WebDriverWait wait;

	/**
	 * Construtor que adiciona a instancia do WebDriver para utilização dos metodos.
	 * 
	 */

	static {
		driver = Selenium.getDriver();
		wait = new WebDriverWait(driver, 40);
		driver.navigate().to(Property.SITE_ADDRESS);
		
	}

	// Login no sistema;
	static By preencherCampoEmail = By.id("login_email");
	static By preencherCampopassword = By.id("login_password");
	static By clicarButtonLogin = By.cssSelector("button[id*=btnLogin]");
	static By clicarLogout = By.linkText("eu@papito.io");
	static By clicarButtonSair = By.linkText("Sair");

	// Login Falha E-mail
	static By verificarMensagemEmail = By.xpath("//div[text()='Email is required']");

	// Login Falha Password
	static By verificaMensagemPassword = By.xpath("//div[text()='Password is required']");

	public LoginPage() {

	}

	// Metodo que preenche o campo e-mail.
	public static void preencherCampoEmail(String email) {
		driver.findElement(preencherCampoEmail).clear();
		driver.findElement(preencherCampoEmail).sendKeys(email);

	}

	// Metodo que preenche o campo Password.
	public static void preencherCampopassword(String pwd) {
		driver.findElement(preencherCampopassword).clear();
		driver.findElement(preencherCampopassword).sendKeys(pwd);

	}

	// Metodo que clica no botao login.
	public static void clicarButtonLogin() {
		driver.findElement(clicarButtonLogin).click();

	}

	// Metodo que valida a mensagem exibida na tela.
	@Test
	public static void textPresentHome(String mensagem) throws InterruptedException {
		Thread.sleep(1500);
		List<WebElement> eleCheck = Utils.findElementsByXpath(
				"/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/small[1]");
		if (eleCheck != null && eleCheck.size() > 0) {
			eleCheck.get(0).getAttribute("Hello, Papito");

		}
	}

	// Metodo que clica no botao e faz Logout.
	public static void clicarLogout() {
		driver.findElement(clicarLogout).click();

	}

	// Metodo que clica no botao Sair.
	public static void clicarButtonSair() {
		driver.findElement(clicarButtonSair).click();

	}

	// Metodo que verifica a mensagem exibida na Tela.
	public static void verificarMensagemEmail(String falhaemail) {
		driver.findElement(verificarMensagemEmail).getAttribute(falhaemail);

	}

	// Metodo que verifica a mensagem exibida na Tela.
	public static void verificaMensagemPassword(String falhapassword) {
		driver.findElement(verificaMensagemPassword).getAttribute(falhapassword);

	}

	// Metodo que limpa os campos da Tela.
	public static void limparCamposReflesh() {
		driver.findElement(preencherCampoEmail).clear();
		driver.findElement(preencherCampopassword).clear();

	}

}
