package cmp405hw1;
import java.io.*;
import java.net.*;
import java.util.*;

public class httpserver {

	public static void main(String[] args) {
		String domain = "google.com";
		int port = 80;
		
		if(args.length > 0) {
			domain = args[0];
		}
		if(args.length > 1) {
			port = Integer.valueOf(args[1]);
		}
		
		Socket sock = new Socket(domain,port);
		

	}

}
