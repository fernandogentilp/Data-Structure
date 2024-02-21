package recursao;

public class TestarMetodosRecursivos {
	public static void main(String[] args) {
		MetodosRecursivos recursivo = new MetodosRecursivos();

		// Testando o metodo recursivo de fatorial
		System.out.println(recursivo.calcularFatorial(5));
		System.out.println(recursivo.calcularFatorial(0));

		// Testando o metodo recursivo de fibonnaci
		System.out.println(recursivo.calcularFibonacci(5));
		System.out.println(recursivo.calcularFibonacci(3));
		System.out.println(recursivo.calcularFibonacci(10));
	}
}
