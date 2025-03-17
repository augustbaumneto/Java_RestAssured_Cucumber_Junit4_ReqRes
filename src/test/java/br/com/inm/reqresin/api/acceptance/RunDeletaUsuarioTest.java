package br.com.inm.reqresin.api.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * Classe responsável pela execução dos testes da feature Deletar Usuários
 * 
 * @author August Neto
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/resources/features",
			glue = "br.com.inm.reqresin.api.acceptance.steps",
			snippets = SnippetType.CAMELCASE,
			monochrome = true,
			tags = "@deletar_usuario"
		)

public class RunDeletaUsuarioTest {
}
