package FormaGeometrica;

public class Circulo implements FormaInterface {
    protected double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    @Override
    public double calculo() {
        return Math.PI * Math.pow(raio, 2); 
    }
}
