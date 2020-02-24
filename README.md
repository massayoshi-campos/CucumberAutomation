# CucumberAutomation
Projeto utilizando o Selenium+Cucumber para realização de testes no sistema Web, vamos utilizar Behavior Driven Development (BDD) e a linguagem gherkin. O projeto foi criado para ajudar os iniciantes em automação, também servirá como meu portfólio pessoal.

# Site de demonstração para praticar o WebDriver:

- [HeroKuapp](http://the-internet.herokuapp.com/)
- [jqueryui](https://jqueryui.com/demos/)
- [PHPTravels](https://phptravels.com/demo/)
- [Newtours](http://newtours.demoaut.com/)
- [Way2Automation](http://www.way2automation.com/demo.html)
- [AutomationPractice](http://automationpractice.com/index.php)
- [Demoqa](https://demoqa.com/)

# Índice

- Pré-requisito
- Configuração
- Features
- Suporte
- License

# Pré Requisitos

- JDK install 8
- Eclipse IDE install
- Maven install
- Cucumber plugin install

# Configuração do Ambiente

## Variáveis de Ambiente

### Java

- Windows: https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html

### Maven

- Windows: https://www.mkyong.com/maven/how-to-install-maven-in-windows/


## Instalação e Execução do Projeto

- Faça o download do zip ou clone do repositório Git;
- Descompacte o arquivo zip (se você tiver baixado um);
- Abra o Eclipse;
- File >> Import >> Maven >> Existing Maven Projects >> Navegue até a pasta em que você descompactou o zip;
- Você pode executar o teste pelo Cucumber ou Junit;
- Junit;
-- src/test/java >> br.com.test >> "DashboardValidation.java" ou "LoginValidation.java";
--- Clique com o botão direito do mouse no arquivo e execute como Run As "JUnit test";
- Cucumber;
-- src/teste/resources >> features >> "Dashboard.feature" ou "Login.feature";  
--- Clique com o botão direito do mouse no arquivo e execute como Run As "1 Cucumber Feature";

# Feature

- Arquivo de exemplo .feature

```
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
       
## Exclusão da task no sistema.
Scenario: Exclusão da task no sistema
    And Validar a exclusão da task
```
    
# Suporte
## E-mail: massayoshi.campos@gmail.com
## Linkedin: https://www.linkedin.com/in/massayoshi-campos/
> Se você tiver alguma dúvida sobre este repositório ou precisar de ajuda para contribuir, não hesite em entrar em contato comigo.

## Contribuições
> Se você tem algum exemplo de código que gostaria de contribuir para este repositório, sinta-se à vontade para abrir uma solicitação de recebimento.

## Comentário
> Os colaboradores deste repositório ficarão muito gratos por receber feedback! Se você deseja elogiar ou comentar algum exemplo de teste ou o repositório como um todo, faça-o pelo e-mail. Eu adoraria ouvir o que você pensa, então, reserve um momento para me informar.

# License
- Esse código é livre para ser usado dentro dos termos da licença MIT license
- Copyright 2020 ©Massayoshi Campos
