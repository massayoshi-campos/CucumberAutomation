package br.com.test;

import br.com.common.LoginPage;
import br.com.test.BaseTestCase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @author Massayoshi Campos Criado em Janeiro/2020
 * @throws Throwable, InterruptedException
 * @version 1.0.0
 * @since Release 1.0
 * 
 */

public class LoginPageSteps extends BaseTestCase {
	
	//Login de sucesso - Etapa 1
	@Given("^Preencher o campo E-mail e Password$")
	public void preencherOCampoEMailEPassword() throws Throwable {
	    LoginPage.preencherCampoEmail("eu@papito.io");
			LoginPage.preencherCampopassword("pwd123"); 
			System.out.println ("Etapa 1 - Login, preencher o campo e-mail e password.");
		
	}
	
	 //Login de sucesso - Etapa 2
	@Then("^Clicar no botao Login$")
	public void clicarNoBotaoLogin() throws Throwable {
	   LoginPage.clicarButtonLogin();
			 System.out.println ("Etapa 2 - Login, clicar no botao Login.");	
			 
	}		 
	 
	 //Login de sucesso - Etapa 3
	@And("^Verificar o titulo presente na tela$")
	 public void verificar_titulo_presente_tela() throws InterruptedException, Throwable{
		 LoginPage.textPresentHome("Hello, Papito");
		 System.out.println ("Etapa 3 - Login, Verificar o titulo na home.");					
	 
	 }
	 
	 //Login de sucesso - Etapa 4
	@Then("^Fazer logout do sistema$")
	 public void fazer_logout_sistema()  throws Throwable {
		LoginPage.clicarLogout();
		LoginPage.clicarButtonSair();
		System.out.println ("Etapa 4 - Login, Fazer logout do sistema.");
	 
	 }
	 
	 //Login Falha e-mail - Etapa 5
	@Given("^Preencher o campo Password e nao preencher o campo e-mail$")
	 public void preencher_Campo_Password () throws InterruptedException, Throwable{
		Thread.sleep(1500);
		LoginPage.preencherCampopassword("pwd123"); 
		System.out.println ("Etapa 5 - Login, preencher o campo password e nao preencher o campo e-mail.");
			
	 }
		
	 //Login Falha e-mail - Etapa 6
	@And("^Verificar a mensagem presente na tela$")
	 public void verificar_mensagem_presente_tela() throws InterruptedException, Throwable{
		LoginPage.verificarMensagemEmail("Email is required");
		LoginPage.limparCamposReflesh();
		System.out.println ("Etapa 6 - Login, Verificar a mensagem presente na tela e limpar os campos.");
	 
	 }
	 
	//Login de sucesso - Etapa 7 
	 @Given("^Preencher o campo E-mail e nao preencher o campo Password$")
	public void preencherCampoEmailFalha () throws InterruptedException, Throwable{
		Thread.sleep(1500);
		LoginPage.preencherCampoEmail("eu@papito.io");
		System.out.println ("Etapa 7 - Login, preencher o campo e-mail e nao preencher o campo password.");					
			
	 }
	
	 //Login Falha e-mail - Etapa 8
	@And("^Verificar a mensagem de password presente na tela$")
	 public void verificar_mensagem_presente_tela_password() throws InterruptedException, Throwable {
		LoginPage.verificaMensagemPassword("Password is required");
		LoginPage.limparCamposReflesh();
		System.out.println ("Etapa 8 - Login, Verificar a mensagem presente na tela de password e limpar os campos.");
	
	 }
	 
}
