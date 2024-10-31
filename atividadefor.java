package atividadesGen;

import java.util.Scanner;

public class atividadefor {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner (System.in);
	

	int par = 0;
	int impar = 0;

    for (int i = 1; i <= 10; i++) {
        System.out.print("Digite o " + i + "° número: ");
        int valor = sc.nextInt();

        
        if (valor % 2 == 0) {
            par++;
        } else {
            impar++;
        }
    }

    System.out.println("Total de números pares " + par+"\nTotal de números ímpares: "+ impar);
  
	}
}
  

