package br.com.faguirre.service;

import br.com.faguirre.dao.IContratoDAO;

public class ContratoService implements IContratoService{
    private IContratoDAO contratoDao;

    public ContratoService(IContratoDAO  dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "123";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return null;
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "4321";
    }
}
