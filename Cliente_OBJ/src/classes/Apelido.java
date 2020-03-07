/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.Serializable;

/**
 *
 * @author Nalberthy-PC
 */
public class Apelido implements Serializable {
    private String apelido;
    private String msg;
    public Apelido() {
    }
    
    public Apelido(String apelido, String msg) {
        this.apelido = apelido;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public String getApelido() {
        return this.apelido;
    }
    public void setApelido(String apelido){
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Apelido{" + "apelido=" + apelido + ", msg=" + msg + '}';
    }

}
