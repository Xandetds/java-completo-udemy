package IOeSerialization.Serialization.exercicio01;

import java.io.Serializable;

class Contato implements Serializable {
    public String nome;
    public String telefone;

    public Contato(String initNome, String initTelefone) {
        nome = initNome;
        telefone = initTelefone;
    }
}
