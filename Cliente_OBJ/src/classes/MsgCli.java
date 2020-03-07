package classes;

import java.io.Serializable;

/**
 *
 * @author Madianita
 */
public class MsgCli implements Serializable{
    private Contato contato;
    private String opcao;

    public MsgCli() {
    }

    public MsgCli(Contato c, String opcao) {
        this.contato = c;
        this.opcao = opcao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    @Override
    public String toString() {
        return "MsgCli{" + "contato=" + contato + ", opcao=" + opcao + '}';
    }

}