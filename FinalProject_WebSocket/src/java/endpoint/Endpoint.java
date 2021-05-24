/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endpoint;


import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Zannie
 */
@ServerEndpoint("/endpoint")
public class Endpoint {

    
    
    @OnMessage
    public String onMessage(String message) {
        System.out.println(message);
        return null;
    }

    @OnOpen
    public void onOpen() {
    }


    @OnError
    public void onError(Throwable t) {
        
    }

    @OnClose
    public void onClose() {
        System.out.println("The user has been disconnected");
    }
    
}
