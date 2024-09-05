package principal;

import java.util.Scanner;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scn = new Scanner(System.in);
		
			Cachorro H = new Cachorro();
			Gato T = new Gato();
			Vaca C = new Vaca();
		
		 System.out.println("O som do cachorro é: " + H.emitirSom());
	     
		 System.out.println("O som do gato é: " + T.emitirSom());
		 
		 System.out.println("O som do Vaca é: " + C.emitirSom());
		 
		
		 
		 
	}
}
