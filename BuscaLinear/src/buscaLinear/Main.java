package buscaLinear;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] vetor = new int[8];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100000);
			System.out.println(vetor[i]);
		}
		
		System.out.println("Qual valor você quer achar?");
		Scanner sc = new Scanner(System.in);
		int buscado = sc.nextInt();
		
		
		boolean achou = false;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == buscado) {
				achou = true;
				break;
			}
		}
		
		if(achou) {
			System.out.println("Achou essa bosta");
		}
		
		else {
			System.out.println("Se lascou, não tem nada desse numero ai no array kkkkkkkkkkkkkkkkkkkkkkk");
		}
	}
}
