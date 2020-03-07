package classes;

import java.io.Serializable;

/**
 *
 * @author Nalberthy
 */
public class ChatCli implements Serializable{
    private Apelido apelido;
    private String mensagem;
    private String opcao;

    public ChatCli() {
    }
    
    public ChatCli(Apelido apelido, String opcao) {
        this.apelido = apelido;
        this.opcao = opcao;
    }
    
    public ChatCli(Apelido apelido, String mensagem, String opcao) {
        this.apelido = apelido;
        this.mensagem = mensagem;
        this.opcao = opcao;
    }


    public Apelido getApelido() {
        return apelido;
    }

    public void setApelido(Apelido apelido) {
        this.apelido = apelido;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    @Override
    public String toString() {
        return "ChatCli{" + "apelido=" + apelido + ", mensagem=" + mensagem + ", opcao=" + opcao + '}';
    }


}