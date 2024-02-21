package FormaGeometrica;

public class Retangulo implements FormaInterface {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculo() {
        return base * altura;
    }
}
