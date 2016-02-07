package org.json.parser;


public class StringTokenizer1 {

	public static void main (String []args){
		
		String tok = "Caused by: org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat";
		String tok1[] = tok.split(":");
		System.out.println(tok1[1]);
		
		System.out.println(tok.contains("Exception"));
		
		
	}
}
