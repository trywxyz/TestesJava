package SA2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa_2 {

public static void menu() {
	System.out.println("--------------Sistema--------------");
	System.out.println("1  - A");
	System.out.println("2  - B");
	System.out.println("3  - C");
	System.out.println("4  - D");
	System.out.println("5  - E");
	System.out.println("6  - F");
	System.out.println("7  - G");
	System.out.println("Escolhe uma Das Opçoes!");
}
public static void main(String[] args) {
	
	int opcao = 0;
	
	Scanner ler = new Scanner(System.in);
	
	menu();
	
	opcao = ler.nextInt();
	
	switch(opcao) {
	
	
	case 1:
		a();
		break;
	case 2:
		b();
		break;
	case 3:
		c();
		break;
	case 4:
		d();
		break;
	case 5:
		e();
		break;
	case 6:
		f();
		break;
	case 7:
		a();
		break;
		
	default:
		System.out.println("Essa Opção Não Existe , Tente Novamente");
		
	}
}
public static void  a() {
	Scanner ler = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Qual Tabuada Voce escolhera?:\n");
	numero = ler.nextInt();
	
	System.out.println("Aqui Está Sua Tabuada:");
	System.out.println(numero * 1);
	System.out.println(numero * 2);
	System.out.println(numero * 3);
	System.out.println(numero * 4);
	System.out.println(numero * 5);
	System.out.println(numero * 6);
	System.out.println(numero * 7);
	System.out.println(numero * 8);
	System.out.println(numero * 9);
	System.out.println(numero * 10);
	
}
public static void  b() {
	Scanner ler = new Scanner(System.in);
	
	int valor;
	
	System.out.println("Por Favor Escreva Um Valor Positivo");
    valor = ler.nextInt();
    
	for(valor = valor ; valor >= 0  ; valor --) {
	System.out.println(valor);
	} 
	
	 //System.out.println("Seu Valor Nao e Positivo");		
	} 
public static void  c() {
	Scanner ler = new Scanner(System.in);                                         
	//Nâo Esta Terminado falta Acertar a Media correta
	int num ;
	int contador =1;
	int resultado = 0;
	int media = 0;
	int tudo;
	double c;
	
	 System.out.println("Cadastre Um Numero:");
	   contador = ler.nextInt(); 
	   media ++;
	 
	  while (contador > 1) {   
		  System.out.println("Seus Numeros Cadastrados:");
		   System.out.println(media);
		   System.out.println("Cadastre Um Numero:");
		   contador = ler.nextInt();
		   contador ++;
		   media++;
	  }
	  System.out.println("Seus Numeros Cadastrados:");
	   System.out.println(media);
	   c = new Double(resultado).doubleValue();
	   resultado = contador ;
	   System.out.println("E a Media Deste Numeros:");
	   System.out.println(resultado);
	  
	  /*if (contador == 0) {
		   System.out.println("Seus Numeros Cadastrados:");
		   System.out.println(media);
		   resultado = media / contador;
		   c = new Double(resultado).doubleValue();
		   System.out.println("E a Media Deste Numeros:");
		   System.out.println(resultado);
	    }
      }*/
	  
}
private static void d() {
	Scanner ler = new Scanner(System.in);
	 int valor,valortotal = 0 , valorfu = 10 , valorvi = 5 , cli, valorc = 0 , resultado = 0 , valorf = 0 , valori = 0;
	 String nome ,cliente = null , clientev, clientef  , clientec;
	 
	 System.out.println("Ola Qual Seu Nome?");
	 nome = ler.next();
	 
	 
	 System.out.println("Qual a Sua Compra?");
	 valor = ler.nextInt();
	 
	 /*System.out.println("Qual Tipo De Cliente voce e?");     
	 cliente = ler.next();*/
	 
	 System.out.println("Digite 1 , Se For Cliente (V.I.P)");
	 System.out.println("Digite 2, Se For Funcionario");
	 System.out.println("Digite 3, Se For Cliente Comum");
	 cli = ler.nextInt();
	 
	 if(cli == 3) {
		resultado = valor + 0;
		cliente = ("COMUM");
	 }
	 
	 if(cli == 2){
		 resultado = valor * 10;
		 valorf = resultado / 100;
		 cliente = ("FUNCIONARIO");
	 }
	 
	  if(cli ==1) {
		 resultado = valor * 5;
		 valorf = resultado / 100;
		 cliente = ("VIP");
	  }


      //valorf = resultado / 100;
      valori = valor - valorf;
	  
     System.out.println("Seu Nome e:");
     System.out.println(nome);
     System.out.println("Voce e Tipo De Cliente:");
     System.out.println(cliente);
     System.out.println("E o Valor a Ser Pago e:");
     System.out.println(valori);

}
public static void  e() {
	
	Scanner numeros = new Scanner(System.in);

	// Constrói um Array com 5 posições
	int [] listaDeNumeros = new int[6];
	           
	           
	           for (int i = 1; i < listaDeNumeros.length; i++) 
	           {
		           System.out.print("Digite "+ i + " numeros: "); 
		           listaDeNumeros[i] = (numeros.nextInt());
		       }
	          
	           Arrays.sort(listaDeNumeros);
	           
	           // Ordem crescente
	          System.out.println("\nOrdem Crescente:");
	       	  for (int c = 1; c < listaDeNumeros.length; c++) {
	       		System.out.print(listaDeNumeros[c]+ " | ");
	       	  }
	       		// Ordem Decrescente
	       	  System.out.println("\nValores Decrescentes:");{
	       	  for( int d = 5 ;d >= 1; d--) 
	       		System.out.print(listaDeNumeros[d] + " | ");
	       		    
	       		}
	       	  }
public static void  f() {
	Scanner ler = new Scanner(System.in);
	
}
public static void  g() {
	Scanner ler = new Scanner(System.in);
}
public static void  f() {
	Scanner ler = new Scanner(System.in);
	
}}

