package org.example;

import java.util.ArrayList;
import java.util.List;
// questa e una singelton l'ho presa da https://www.baeldung.com/java-singleton
//con un po di modifike
public final class ClientManager {

    private static ClientManager INSTANCE;

    List<ClientHandler> clientList = new ArrayList<>();

    private ClientManager() {
    }

    public static ClientManager getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClientManager();
        }

        return INSTANCE;
    }

    void add(ClientHandler clientHandler){
        clientList.add(clientHandler);
    }

    void remove(ClientHandler clientHandler){
        clientList.remove(clientHandler);
    }

    int nClients(){
        return clientList.size();
    }

    public void broadcast(String s ,ClientHandler souceClient) {
        for(ClientHandler c : clientList){
            if(c!=souceClient){
                c.getOut().println(s);
            }

        }
    }
}