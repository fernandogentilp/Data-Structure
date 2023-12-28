package linked_list;
/**
 * Teste da linked list generica com um objeto qualquer
 */
public class ProgramaClientes {
	public static void main(String[] args) {
		LinkedList<Cliente> clientes = new LinkedList<>();
		clientes.add(new Cliente("123", "Geraldao de Rivia"));
		clientes.add(new Cliente("556", "Heroi de Kvatch"));
		clientes.add(new Cliente("777", "Pacheco"));
		
		System.out.println("Tamanho: " + clientes.getSize());
		for(int i = 0; i < clientes.getSize(); i++) {
			System.out.println(clientes.get(i).getValue());
		}
	}
}
