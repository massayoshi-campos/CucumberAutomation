package br.com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import br.com.common.*;

/**
 * @author Massayoshi Campos Criado em Janeiro/2020
 * @version 1.0.0
 * @since Release 1.0
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Login.feature",  
        //glue = { "src/test/java//br//com/steps/LoginPageSteps.java" },
		plugin = {"pretty","html:target/cucumber", "json:target/cucumber.json"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        strict = false, 
        dryRun = false)

public class LoginValidation {

}

