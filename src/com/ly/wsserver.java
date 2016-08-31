package com.ly;

import java.awt.image.DataBufferFloat;
import java.io.IOException;
import java.util.Date;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/server")
public class wsserver {
	
	@OnOpen
	public void start( Session session) {
		System.out.println("与客户端连接成功。");
		try {
			session.getBasicRemote().sendText("hello client");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@OnMessage
	public void processMsg( Session session, String  msg) {
		System.out.println("get msg from client:"+msg);
		try {
			session.getBasicRemote().sendText("at"+new Date()+" i get  your msg :"+msg );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
