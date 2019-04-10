package com.vans.qa.utils;


import java.net.InetSocketAddress;
import java.net.Socket;

public class ConexionRed {
	
	public static boolean ConexionRed() {
		
		Socket s = new Socket();
		InetSocketAddress direccion = new  InetSocketAddress("www.google.com",80);
		
		try {
			
			s.connect(direccion,3000);
			
			return true;
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			return false;
		}
		
		finally {
			try {
				
				s.close();
				
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
			
		}
		
		
		
	}

}
