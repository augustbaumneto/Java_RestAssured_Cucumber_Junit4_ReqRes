package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class teste3 {
	private Selenium selenium;

	private String pPrecoDia;
	private	String sSimbolo;
	private	String dDataCotacao;
	private	String sTituloComum;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://economia.uol.com.br/");
		selenium.start();
	}

	@Test
	public void testTeste3() throws Exception {
		selenium.open("/");
		selenium.click("link=Cotações");
		Thread.sleep(10000);
		selenium.click("link=Bolsas de Valores");
		Thread.sleep(20000);
		selenium.type("name=busca", "VALE");
		selenium.click("css=button[type=\"submit\"]");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'Companhia Vale do Rio Doce')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Histórico de cotações");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=begin");
		Thread.sleep(10000);
		selenium.click("//div[@id='dp-popup']/div[5]/table/tbody/tr[5]/td[2]");
		selenium.click("id=end");
		Thread.sleep(10000);
		selenium.click("//div[@id='dp-popup']/div[5]/table/tbody/tr[5]/td[2]");
		selenium.click("id=a");
		pPrecoDia = selenium.getText("css=td.price");
		sSimbolo = selenium.getText("css=em");
		dDataCotacao = selenium.getText("css=td.date");
		sTituloComum = selenium.getText("css=h2.titulo2");
		selenium.captureEntirePageScreenshot("C:\\Users\\AUGUSTBN\\Desktop\\teste4.png", "");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}


// leitura da tabela (dia/mês e ano); teste de saida da tabela; gravar em txt; apresentar tela com qual é que deve comprar;
// script para rodar o java; automatico


//para a promoção do dia; com print;

//para casa/ apartamento zap (com end) ; leilões