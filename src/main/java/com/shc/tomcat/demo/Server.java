package com.shc.tomcat.demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//创建服务器并启动
public class Server {
	private ServerSocket server;
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
		server.receive();
	}
	
	//启动方法
	public void start(){
		try {
			server = new ServerSocket(8888);
			this.receive();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//接收客户端
	private void receive(){
		try {
			Socket client = server.accept();
			byte[] data = new byte[20480];
			int len = client.getInputStream().read(data);
			//接收客户端的请求信息
			String requestInfo = new String(data,0,len).trim();
  			/*StringBuilder sb = new StringBuilder();
			String msg = null;//接收客户端的请求信息
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			while((msg=br.readLine()).length()>0) {
				sb.append(msg);
				sb.append("\r\n");
				if (null == msg) {
					break;
				}
			}
			//接收客户端请求信息
			String requestInfo = sb.toString().trim();*/
			System.out.println(requestInfo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void stop(){
		
	}
}
