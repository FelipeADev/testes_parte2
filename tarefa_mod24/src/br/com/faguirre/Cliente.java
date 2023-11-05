package br.com.faguirre;
import java.util.Objects;

/**
 * @author rodrigo.pires
 */

public class Cliente {

    private String nome;
    private Long cpf;

    public Cliente (){
        this.nome = null;
        this.cpf = Long.valueOf(getCpf());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash +Objects.hashCode(this.cpf);
        return hash;
    }
}
