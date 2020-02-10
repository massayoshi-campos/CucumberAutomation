#Author: Massayoshi Campos - Email: massayoshi.campos@gmail.com
#Keywords Summary: Login, Dashboard.
#Feature: Realizar o login, validacao do home, cadastro, edicao e exclusao.
##@author Massayohi Campos
##Criado em Janeiro/2020
##@version 1.0.0
##@since Release 1.0
@DashboardPageSteps
Feature: Realizacao dos testes no dashboard, incluindo cadastro, alteracao e exclusao de task

  ## Login e validação dos títulos no menu lateral.
  Scenario: Login no sistema e validacao dos titulos no menu lateral
    Given Preencher o campo E-mail e Password no sistema
    Then Clicar no botao Login no sistema
    Then Validar o titulo do menu lateral dashboard
    Then Validar o titulo do menu lateral task
    Then Validar o titulo do menu lateral settings
    Then Validar o titulo do menu lateral profile
    Then Validar o titulo do menu lateral password

  ## Adicionar uma nova task e validar o seu cadastro.
  Scenario: Adicionar uma nova task e validar o seu cadastro no sistema
    Given Direcionando o usuario para a tela de cadastro de uma nova task no sistema
    Then Preencher os campos para realizar o cadastro da nova task
    And Clicar no botao salvar
    Then Validar o cadastro da nova task inserida no sistema

  ## Editar task e validar a edição do cadastro.
  Scenario: Adicionar uma nova task e validar o seu cadastro no sistema
    Given Direcionando o usuario para a tela de edicao
    Then Preencher os campos para realizar a edicao da task
    And Clicar no botao edicao
    Then Validar a edicao da task
    
  ## Exclusao da task no sistema.
  Scenario: Exclusao da task no sistema
    And Validar a exclusao da task
