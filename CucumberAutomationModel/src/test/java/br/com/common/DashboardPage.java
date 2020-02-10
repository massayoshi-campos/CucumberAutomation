package br.com.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;

import br.com.utils.Utils;

public class DashboardPage {
	
	/**
	 * @author Massayoshi Campos
	 * Criado em Janeiro/2020
	 * @throws InterruptedException, FindFailed
	 * @version 1.0.0 
	 * @since Release 1.0
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
	
	//Dashboard
	static By validarTextoDashboard = By.xpath("//li[contains(text(),'Dashboard')]");
	static By validarTextoTasks = By.xpath("//a[contains(text(),'Tasks')]");
	static By validarTextoSettings = By.xpath("//li[contains(text(),'Settings')]");
	static By validarTextoProfile = By.xpath("//a[contains(text(),'Profile')]");
	static By validarTextoPassword = By.xpath("//a[contains(text(),'Password')]");
	
	//New Task
	static By adicionarNewTask = By.id("insert-button");
	static By verificarTituloPagina = By.xpath("//h3[@class='m-b-xs']");
	static By preencherCampoTitle = By.id("title");
	static By preencherCampoDate = By.id("dueDate");
	static By preencherCampoTags = By.xpath("//div[@class='bootstrap-tagsinput form-control']//input");
	static By clicarButtonSave = By.id("form-submit-button");
	static By verificarNewTask = By.id("tasks");
	
	//Alteração New Task
	static By clicarButtonEdit = By.id("edit-button");
	static By verificarTituloPaginaEdit = By.cssSelector("div.wrapper:nth-child(3) section.content div.container-fluid div.row:nth-child(1) div.col-lg-12 div.view-header:nth-child(1) div.header-title > h3.m-b-xs:nth-child(1)");
	static By preencherCampoTitleAlt = By.name("title");
	static By preencherCampoDateAlt = By.id("dueDate");
	static By preencherCampoTagsAlt = By.xpath("//div[@class='bootstrap-tagsinput form-control focus']//input");
	static By deleteTagAlt = By.xpath("//span[@class='tag label label-info']//span");
	
	//Exclusão New Task
	static By clicarButtonDelete = By.id("delete-button");
	static By clicarButtonNao = By.xpath("//button[@class='btn btn-default']");
	static By clicarButtonSim = By.xpath("//button[@class='btn btn-danger']");
	

	
	public DashboardPage() {
						
	}
	
	// Metodo que verifica o texto exibido na Tela.
	public static void validarTextoDashboard(String dashboard) {
		Utils.isVisible(validarTextoDashboard);
		driver.findElement(validarTextoDashboard).getAttribute(dashboard);
		
	}	
	
	// Metodo que verifica o texto exibido na Tela.
	public static void validarTextoTasks(String tasks) {
		//Utils.isVisible(validarTextoTasks);
		driver.findElement(validarTextoTasks).getAttribute(tasks);
			
	}
	
	// Metodo que verifica o texto exibido na Tela.
	public static void validarTextoSettings(String settings) {
		//Utils.isVisible(validarTextoSettings);
		driver.findElement(validarTextoSettings).getAttribute(settings);
			
	}
	
	// Metodo que verifica o texto exibido na Tela.
	public static void validarTextoProfile(String profile) {
		//Utils.isVisible(validarTextoProfile);
		driver.findElement(validarTextoProfile).getAttribute(profile);
				
	}
	
	// Metodo que verifica o texto exibido na Tela.
	public static void validarTextoPassword(String password) {
		//Utils.isVisible(validarTextoPassword);
		driver.findElement(validarTextoPassword).getAttribute(password);
					
	}
	
	// Metodo que clica no botão New para adicionar uma nova Task.
	public static void adicionarNewTask() {
		Utils.isVisible(adicionarNewTask);
		driver.findElement(adicionarNewTask).click();
						
	}
	
	// Metodo que verifica o título exibido na Tela.
	public static void verificarTituloPagina(String titulo) {
		Utils.isVisible(verificarTituloPagina);
		driver.findElement(verificarTituloPagina).getAttribute(titulo);
		
	}
	
	// Metodo que preenche o campo  Título.
	public static void preencherCampoTitle(String titulo1) {
		driver.findElement(preencherCampoTitle).clear();
		driver.findElement(preencherCampoTitle).sendKeys(titulo1);
		
	}
	
	// Metodo que preenche o campo Título na Alteração.
	public static void preencherCampoTitleAlt(String titulo4) {
		Utils.isVisible(preencherCampoTitleAlt);
		driver.findElement(preencherCampoTitleAlt).clear();
		driver.findElement(preencherCampoTitleAlt).sendKeys(titulo4);
			
	}
	
	// Metodo que preenche o campo Date.
	public static void preencherCampoDate(String date) {
		driver.findElement(preencherCampoDate).clear();
		driver.findElement(preencherCampoDate).sendKeys(date);
			
	}
	
	// Metodo que preenche o campo Date na Alteração.
	public static void preencherCampoDateAlt(String date1) {
		Utils.isVisible(preencherCampoDateAlt);
		driver.findElement(preencherCampoDateAlt).clear();
		driver.findElement(preencherCampoDateAlt).sendKeys(date1);
			
	}
		
	// Metodo que preenche o campo Tags.
	public static void preencherCampoTags(String tags) {
		driver.findElement(preencherCampoTags).clear();
		driver.findElement(preencherCampoTags).sendKeys(tags);
			
	}
	
	// Metodo que preenche o campo Tags na alteração.
	public static void preencherCampoTagsAlt(String tags1) {
		Utils.isVisible(preencherCampoTagsAlt);
		driver.findElement(preencherCampoTagsAlt).clear();
		driver.findElement(preencherCampoTagsAlt).sendKeys(tags1);
				
	}
		
	// Metodo que clica no botão Detele
		public static void deleteTagAdicionada() throws FindFailed {
			driver.findElement(deleteTagAlt).click();
	
	}
	
	// Metodo que clica no botão Salvar.
	public static void clicarButtonSave() {
		Utils.isVisible(clicarButtonSave);
		driver.findElement(clicarButtonSave).click();
		
	}
	
	// Metodo que clica no botão New para adicionar uma nova Task.
	public static void verificarNewTask(String titulo2) {
		Utils.isVisible(verificarNewTask);
		driver.findElement(verificarNewTask).getAttribute(titulo2);
			
	}
	
	// Metodo que clica no botão Editar.
	public static void clicarButtonEdit() {
		Utils.isVisible(clicarButtonEdit);
		driver.findElement(clicarButtonEdit).click();
			
	}
	
	// Metodo que verifica o título exibido na Tela.
	public static void verificarTituloPaginaEdit(String titulo3) {
		Utils.isVisible(verificarTituloPaginaEdit);
		driver.findElement(verificarTituloPaginaEdit).getAttribute(titulo3);
				
	}
	
	// Metodo que clica no botão Delete da nova Task.
	public static void clicarButtonDelete() {
		Utils.isVisible(clicarButtonDelete);
		driver.findElement(clicarButtonDelete).click();
	
	}
	
	// Metodo que clica no botão não da nova Task.
	public static void clicarButtonNao() {
		Utils.isVisible(clicarButtonNao);
		driver.findElement(clicarButtonNao).click();
		
	}
	
	// Metodo que clica no botão Sim da nova Task.
	public static void clicarButtonSim() {
		Utils.isVisible(clicarButtonSim);
		driver.findElement(clicarButtonSim).click();
			
	}

}
