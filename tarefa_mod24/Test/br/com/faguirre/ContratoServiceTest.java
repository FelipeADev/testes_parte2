package br.com.faguirre;

import br.com.faguirre.dao.ContratoDAO;
import br.com.faguirre.dao.IContratoDAO;
import br.com.faguirre.dao.mock.ContratoMockDAO;
import br.com.faguirre.service.ContratoService;
import br.com.faguirre.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDAO dao = new ContratoMockDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscar(){
        IContratoDAO dao = new ContratoMockDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("123", retorno);
    }

    @Test
    public void atualizar(){
        IContratoDAO dao = new ContratoMockDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("4321", retorno);
    }

    @Test
    public void excluir(){
        IContratoDAO dao = new ContratoMockDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertNull(null, retorno);

    }
    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
