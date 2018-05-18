package Flujos;

import java.io.*;
import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		try {
			String usuario = System.getProperty("user.name");
	File directorio=new File("C:\\Users\\"+usuario+"\\Desktop\\carpetaPedro");
	directorio.mkdirs();
	
	FileWriter file=new FileWriter("C:\\Users\\"+usuario+"\\Desktop\\carpetaPedro\\alumno.txt");
	
	PrintWriter p=new PrintWriter(file);
	BufferedReader b=new BufferedReader(new FileReader("C:\\Users\\"+usuario+"\\Desktop\\carpetaPedro\\alumno.txt"));
	Scanner sc=new Scanner(System.in);
	p.write("hola soy pedro");
	
	

	p.close();
String cadena = "";
	int linea;
	String patata = "";
	while ((linea=b.read()) !=-1) {
	cadena+=(char)linea;
	
		patata=cadena.replace(" ", "");
	
		

	}
	
	System.out.println(patata);
	b.close();
	

		} catch (Exception e) {
			System.out.println("entro al catch");
		}
	}


}

