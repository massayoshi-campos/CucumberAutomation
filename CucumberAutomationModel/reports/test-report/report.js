$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/dev/eclipse-workspace-new/CucumberAutomationModel/src/test/java/br/com/test/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Fazer o Login no sistema",
  "description": "",
  "id": "fazer-o-login-no-sistema",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginPageSteps"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Realizar o login no sistema",
  "description": "",
  "id": "fazer-o-login-no-sistema;realizar-o-login-no-sistema",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Preencher o campo E-mail e Password",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Clicar no botao Login",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verificar o titulo presente na tela",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Fazer logout do sistema",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "Realizar o login com falha no e-mail",
  "description": "",
  "id": "fazer-o-login-no-sistema;realizar-o-login-com-falha-no-e-mail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Preencher o campo Password e nao preencher o campo e-mail",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Clicar no botao Login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Verificar a mensagem presente na tela",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "Realizar o login com falha no password",
  "description": "",
  "id": "fazer-o-login-no-sistema;realizar-o-login-com-falha-no-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Preencher o campo E-mail e nao preencher o campo Password",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Clicar no botao Login",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Verificar a mensagem de password presente na tela",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});