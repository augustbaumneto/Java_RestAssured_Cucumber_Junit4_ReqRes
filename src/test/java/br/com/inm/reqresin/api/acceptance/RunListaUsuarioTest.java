package br.com.inm.reqresin.api.acceptance;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;

/**
 * 
 * Classe responsável pela execução dos testes da feature Listar Usuário
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
			tags = "@listar_usuarios"
		)
public class RunListaUsuarioTest {
}
