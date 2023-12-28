package linked_list;
/**
 * Teste da LinkedList Genérica com inteiros
 */
public class ProgramaInteiros {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		num.add(3);
		num.add(6);
		num.add(9);
		
		System.out.println("Tamanho: " + num.getSize());
		for(int i = 0; i < num.getSize(); i++) {
			System.out.println(num.get(i).getValue());
		}
	}
}
