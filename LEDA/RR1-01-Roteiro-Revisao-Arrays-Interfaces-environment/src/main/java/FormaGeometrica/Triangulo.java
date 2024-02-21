package FormaGeometrica;

public class Triangulo implements FormaInterface {
    private double base;

    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calculo() {
        return (base * altura) / 2;
    }
}
