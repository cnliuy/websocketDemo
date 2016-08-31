package com.ly;

import java.io.IOException;

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

}
