package br.com.faguirre;

import br.com.faguirre.dao.ClienteDAO;
import br.com.faguirre.dao.ClienteDAOMock;
import br.com.faguirre.dao.IClienteDAO;
import br.com.faguirre.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
    @Test
    public void salvarTest() {
        IClienteDAO mockDao = new ClienteDAOMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDAO mockDao = new ClienteDAO();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
