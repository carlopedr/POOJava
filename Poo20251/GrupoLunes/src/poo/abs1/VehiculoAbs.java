public abstract class VehiculoAbs {
    private String marca;
    private String color;

    public VehiculoAbs(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    public VehiculoAbs() {
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void pintar(String color) {
        this.color = color;
    }

    public abstract void acelerar();
    
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", color=" + color + "]";
    }


}
