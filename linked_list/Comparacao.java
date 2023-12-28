package linked_list;

import java.util.ArrayList;

/**
 * Comparação da Linked List Genérica criada com um vetor(arraylist)
 */
public class Comparacao {
	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		//Adicionar elementos
		int limite = 10000;
		long tempoInicial = System.currentTimeMillis();
		long tempoFinal;
		for(int i = 1; i < limite; i++) {
			vetor.add(i);
		}
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("Adicionou: " + limite + " elementos no vetor.");
		System.out.println(tempoFinal - tempoInicial);
		
		
		tempoInicial = System.currentTimeMillis();
		for(int i = 1; i < limite; i++) {
			lista.add(i);
		}
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("\n\nAdicionou: " + limite + " elementos na lista.");
		System.out.println(tempoFinal - tempoInicial);
		
		//ler valores
		
		tempoInicial = System.currentTimeMillis();
		for(int i = 1; i < vetor.size(); i++) {
			vetor.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("\n\nTempo de leitura do vetor:");
		System.out.println(tempoFinal - tempoInicial);
		
		
		tempoInicial = System.currentTimeMillis();
		IteratorLinkedList<Integer> iterator = lista.getIterator();
		while(iterator.isNext()) {
			iterator.getNext();
		}
		tempoFinal = System.currentTimeMillis();
		
		System.out.println("\n\nTempo de leitura da lista:");
		System.out.println(tempoFinal - tempoInicial);
		
	}
}
