public class Coche {

    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar(int cuanto) {
        this.velocidad = this.velocidad + cuanto;
    }
}
