package br.com.faguirre.service;

import br.com.faguirre.dao.ClienteDAO;
import br.com.faguirre.dao.ClienteDAOMock;
import br.com.faguirre.dao.IClienteDAO;

public class ClienteService {

    private IClienteDAO clienteDao;

    public ClienteService(IClienteDAO clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
