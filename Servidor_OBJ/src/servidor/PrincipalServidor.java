/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author Nalberthy-PC
 */


import classes.ThreadChat;
import classes.Contato;
import java.io.IOException;


import java.net.ServerSocket;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import javax.swing.JOptionPane;

public class PrincipalServidor{     
    public static void main(String[] args) {
    	Socket cSocket = null; 
        ServerSocket sSocket = null;
        
      	try {
            sSocket = new ServerSocket(8000); 
      	}catch (IOException e) {
            System.err.println("Servidor nao pode ouvir a porta: 8000 ");
            System.exit(0);
      	}
      	
        while(true){
            try{
	        System.out.println("\n\nEsperando cliente:"+
                                    "Endereço IP do servidor: " + sSocket.getInetAddress());
                cSocket = sSocket.accept();
                
                System.out.println("\n\nCliente conectou:"+
                                    "Endereço IP e porta do cliente: " + 
                                    cSocket.getInetAddress() + ":" + cSocket.getPort());
                
                //criar Thread para atender o cliente
              new ThreadChat(cSocket).start();
                
            }catch(IOException e){
                System.err.println("Erro na conexão: "+e.getMessage());
                System.exit(0);	  	
            }                       
        } //fim do while(true)
    } //fim do main()  	
}
