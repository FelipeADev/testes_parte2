package br.com.faguirre.dao;

import br.com.faguirre.Cliente;

import java.util.Map;
import java.util.TreeMap;

public class ContratoDAO implements IContratoDAO{

    private final Map<Long, Cliente> map;
    public ContratoDAO(){

        map = new TreeMap<>();
    }
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void excluir() {
        Cliente cliente = new Cliente();
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());

        if (clienteCadastrado != null) {
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }

    @Override
    public void atualizar() {
        Cliente cliente = new Cliente();
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome((cliente.getNome()));
        }
    }

    @Override
    public void buscar() {
        Cliente cliente = new Cliente();
        this.map.get(cliente.getCpf());
    }

}
