package br.com.test;

import org.sikuli.script.FindFailed;

import br.com.common.*;
import br.com.test.BaseTestCase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @author Massayoshi Campos Criado em Janeiro/2020
 * @throws InterruptedException
 * @version 1.0.0
 * @since Release 1.0
 * 
 */

public class DashboardPageSteps extends BaseTestCase{
	
	//Login de sucesso - Etapa 1
	@Given("^Preencher o campo E-mail e Password no sistema$")
	public void preencherCamposCadastro() {
		LoginPage.preencherCampoEmail("eu@papito.io");
		LoginPage.preencherCampopassword("pwd123");
		System.out.println("Etapa 1 - Login, preencher o campo e-mail e password no sistema.");

	}

	//Login de sucesso - Etapa 2
	@Then("^Clicar no botao Login no sistema$")
	public void clicar_no_button_Login() throws InterruptedException {
		LoginPage.clicarButtonLogin();
		Thread.sleep(1500);
		System.out.println("Etapa 2 - Login, clicar no botão Login no sistema.");

	}
	
	//Dashboard verificação do titulo do menu lateral - Etapa 9
	@Then("^Validar o titulo do menu lateral dashboard$")
	public void validar_texto_dashboard() {
		DashboardPage.validarTextoDashboard("Dashboard");
		System.out.println("Etapa 9 - Dashboard, validar o titlo do menu lateral dashboard.");
			
	}
	
	//Dashboard verificação do titulo do menu lateral - Etapa 10
	@Then("^Validar o titulo do menu lateral task$")
	public void validar_texto_task() {
		DashboardPage.validarTextoTasks("Tasks");
		System.out.println("Etapa 10 - Dashboard, validar o titlo do menu lateral task.");
	
	}
	
	//Dashboard verificação do titulo do menu lateral - Etapa 11
	@Then("^Validar o titulo do menu lateral settings$")
	public void validar_texto_settings() {
		DashboardPage.validarTextoSettings("Settings");
		System.out.println("Etapa 11 - Dashboard, validar o titlo do menu lateral settings.");
		
	}
	
	//Dashboard verificação do titulo do menu lateral - Etapa 12
	@Then("^Validar o titulo do menu lateral profile$")
	public void validar_texto_profile() {
		DashboardPage.validarTextoProfile("Profile");
		System.out.println("Etapa 12 - Dashboard, validar o titlo do menu lateral profile.");
		
	}
	
	//Dashboard verifição do titulo do menu lateral - Etapa 13
	@Then("^Validar o titulo do menu lateral password$")
	public void validar_texto_password() {
		DashboardPage.validarTextoPassword("Password");
		System.out.println("Etapa 13 - Dashboard, validar o titlo do menu lateral password.");
			
	}
	
	//Dashboard_Adicionar - Direcionando o usuario para a tela de cadastro - Etapa 14
	@Given("^Direcionando o usuario para a tela de cadastro de uma nova task no sistema$")
	public void adicionar_task_sistema() throws InterruptedException {
		Thread.sleep(1500);
		DashboardPage.adicionarNewTask();
		DashboardPage.verificarTituloPagina("New Task");
		System.out.println("Etapa 14 - Dashboard, Direcionando o usuario para a tela de cadastro de uma nova task no sistema.");
				
	}
	
	//Dashboard_Adicionar - Preencher os campos para realizar o cadastro da task - Etapa 15
	@Then("^Preencher os campos para realizar o cadastro da nova task$")
	public void preencher_campo_new_task() {
		DashboardPage.preencherCampoTitle("Tarefa Teste Automação");
		DashboardPage.preencherCampoDate("20/01/2020");
		DashboardPage.preencherCampoTags("Modelo de Automação Teste");
		System.out.println("Etapa 15 - Dashboard, Preencher os campos para realizar o cadastro da nova task.");
				
	}
	
	//Dashboard_Adicionar - Clicar no botao salvar - Etapa 16
	@And("^Clicar no botao salvar$")
	public void clicar_button_save() {
		DashboardPage.clicarButtonSave();
		System.out.println("Etapa 16 - Dashboard, Clicar no botao salvar.");
		
	}
	
	//Dashboard_Adicionar - Validar o cadastro da nova task inserida no sistema - Etapa 17
	@Then("^Validar o cadastro da nova task inserida no sistema$")
	public void verificar_new_task() {
		DashboardPage.verificarNewTask("Tarefa Teste Automação");
		System.out.println("Etapa 17 - Dashboard, Validar o cadastro da nova task inserida no sistema.");
					
	}
	
	//Dashboard_Edicao - Direcionando o usuario para a tela de edicao - Etapa 18
	@Given("^Direcionando o usuario para a tela de edicao$")
	public void edicao_task_sistema() throws InterruptedException {
		Thread.sleep(1500);
		DashboardPage.clicarButtonEdit();
		System.out.println("Etapa 18 - Dashboard, Direcionando o usuario para a tela de edicao.");
					
	}
	
	//Dashboard_Edicao - Preencher os campos para realizar a edicao/alteracao da task - Etapa 19
	@Then("^Preencher os campos para realizar a edicao da task$")
	public void preencher_campo_edicao_task() throws FindFailed {
		DashboardPage.preencherCampoTitleAlt("Alterado com sucesso");
		DashboardPage.preencherCampoDateAlt("13/11/1986");
		DashboardPage.deleteTagAdicionada();
		DashboardPage.preencherCampoTagsAlt("Modelo alterado com sucesso");
		System.out.println("Etapa 19 - Dashboard, Preencher os campos para realizar a edicao da task.");
					
	}
	
	//Dashboard_Edicao - Clicar no botao edicao - Etapa 20
	@And("^Clicar no botao edicao$")
	public void clicar_button_edicao() {
		DashboardPage.clicarButtonSave();
		System.out.println("Etapa 20 - Dashboard, Clicar no botao edicao.");
			
	}
	
	//Dashboard_Edicao - Validar a edicao da task - Etapa 21
	@Then("^Validar a edicao da task$")
	public void verificar_edit_task() {
		DashboardPage.verificarNewTask("Modelo alterado com sucesso");
		System.out.println("Etapa 21 - Dashboard, Validar a edicao da task.");
						
	}
	
	//Dashboard_Exclusao - Validar a exclusao da task alterada - Etapa 22
	@And("^Validar a exclusao da task$")
	public void verificar_excluded_task() {
		DashboardPage.clicarButtonDelete();
		DashboardPage.clicarButtonNao();
		DashboardPage.clicarButtonDelete();
		DashboardPage.clicarButtonSim();
		System.out.println("Etapa 22 - Dashboard, Validar a exclusao da task alterada.");
							
	}

}
