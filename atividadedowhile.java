package atividadesGen;

import java.util.Scanner;

public class atividadedowhile {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	       
		 int numero, cont=0, soma=0;
		 
		 do {
			 System.out.println("Digite um número: ");
			 numero = sc.nextInt();
			 
			 if(numero > 0) {
				 soma = soma+numero;
				 
			 } if (numero != 0) {
				 cont++;
			 }
			 
		 }while (numero != 0 && cont < 10);
		 
		 System.out.println("A soma dos números positivos é: "+soma); 
	}
}


