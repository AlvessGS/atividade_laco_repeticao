package atividadesGen;

import java.util.Scanner;

public class atividadeif {
	
public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
	
		int idade=0, idadeMaior=0, idadeMenor=0;
		
		while (idade==0) {
			
			for(int i = 0; i <= 10;i++) {
				System.out.println("Digite uma idade: ");
				idade = valor.nextInt();
				
				if (idade <21 && idade >=0) {
					idadeMenor++;
				}else if (idade > 50) {
					idadeMaior++;
				}
			}
			
			idade = 4;
		}
		System.out.println("Total de pessoas menores de 21 anos: "+idadeMenor);
		System.out.println("Total de pessoas maiores de 50 anos: "+idadeMaior);
	}
}


