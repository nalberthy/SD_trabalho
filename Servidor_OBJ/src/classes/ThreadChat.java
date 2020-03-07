/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import classes.ChatCli;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Nalberthy
 */
public class ThreadChat extends Thread{
    private ObjectInputStream recebeObj;
    private PrintStream enviaStr;
    private ChatCli msg_ChatCli_Recebida;
    private Socket cSocket; 

    public ThreadChat(Socket cSocket) {
        this.cSocket = cSocket;
    }
 
    public void run(){              
            try 
            {
                recebeObj =  new ObjectInputStream(cSocket.getInputStream());
                enviaStr = new PrintStream(cSocket.getOutputStream(), true);
                while(true)
                {
                    msg_ChatCli_Recebida = (ChatCli) recebeObj.readObject();
                   
                    if (!msg_ChatCli_Recebida.getOpcao().equalsIgnoreCase("sair")){
                        
                    }
         
                    
                    else
                    {                        
                        recebeObj.close();
                        enviaStr.close();
                        cSocket.close();
                        break;
                    }
                }                
            } catch (Exception ex) {
                System.err.println("Erro comunicação: "+ex.getMessage());
                System.exit(0);
            } 
    }
}
