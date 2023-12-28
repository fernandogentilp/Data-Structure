package linked_list;
/**
 * Classe que vai servir para "testar" nossa linked list. Talvez depois, como forma de exercicio
 * irei fazer testes com o Junit. Talvez. Não é uma promessa.
 */
public class Programa {
	public static void main(String[] args) {
		
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("AC");
		lista.add("BA");
		lista.add("MG");
		lista.add("PB");
		System.out.println("Tamanho: " + lista.getSize());
		System.out.println("Primeiro: " + lista.getFirst().getValue());
		System.out.println("Ultimo: " + lista.getLast().getValue());
		
		System.out.println("Lista completa:");
		for(int i = 0; i < lista.getSize(); i++) {
			System.out.println(lista.get(i).getValue());
		}
		
		lista.remove("AC");
		lista.remove("BA");
		lista.remove("MG");
		lista.remove("PB");
		lista.add("RJ");
		
		System.out.println("Tamanho: " + lista.getSize());
		
		System.out.println("Lista incompleta, com um estado removido:");
		for(int i = 0; i < lista.getSize(); i++) {
			System.out.println(lista.get(i).getValue());
		}
	}
}
