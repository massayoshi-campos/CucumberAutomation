#Author: Massayoshi Campos - Email: massayoshi.campos@gmail.com
#Keywords Summary: Login, Dashboard.
#Feature: Realizar o login, validacao do home, cadastro, edicao e exclusao.
##@author Massayohi Campos
##Criado em Janeiro/2020
##@version 1.0.0
##@since Release 1.0
@LoginPageSteps
Feature: Fazer o Login no sistema

Scenario: Realizar o login no sistema
Given Preencher o campo E-mail e Password
Then Clicar no botao Login
And Verificar o titulo presente na tela
Then Fazer logout do sistema

Scenario: Realizar o login com falha no e-mail
Given Preencher o campo Password e nao preencher o campo e-mail
Then Clicar no botao Login
And Verificar a mensagem presente na tela

Scenario: Realizar o login com falha no password 
Given Preencher o campo E-mail e nao preencher o campo Password
Then Clicar no botao Login
And Verificar a mensagem de password presente na tela