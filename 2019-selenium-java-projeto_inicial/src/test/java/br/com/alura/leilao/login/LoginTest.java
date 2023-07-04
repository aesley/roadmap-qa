package br.com.alura.leilao.login;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LoginTest {

    private LoginPage paginaLogin;

    @BeforeEach
    public void beforeEach(){
        this.paginaLogin = new LoginPage();
    }
    @AfterEach
    public void afterEach(){
        this.paginaLogin.fechar();
    }

    @Test
    public void deveriaEfetuarLoginComDadosValidos(){
        paginaLogin.preencherFormularioDeLogin("fulano", "pass");
        paginaLogin.efetuaLogin();

        Assert.assertFalse(paginaLogin.isPaginaDeLogin());
        Assert.assertEquals("fulano", paginaLogin.getNomeUsuarioLogado());

    }

    @Test
    public void nãoDeveriaLogarComDadosInvalidos(){
        paginaLogin.preencherFormularioDeLogin("invalido", "12345");
        paginaLogin.efetuaLogin();

        Assert.assertTrue(paginaLogin.isPaginaDeLoginComDadosInvalidos());
        Assert.assertNull(paginaLogin.getNomeUsuarioLogado());
        Assert.assertTrue(paginaLogin.contemTexto("Usuário e senha inválidos."));


    }
    @Test
    public void naoDeveriaAcessarPaginaRestritaSemEstarLogado(){
        paginaLogin.navegaParaPaginaDeLances();

        Assert.assertTrue(paginaLogin.isPaginaDeLogin());
        Assert.assertFalse(paginaLogin.contemTexto("Dados do Leilão"));

    }
}
