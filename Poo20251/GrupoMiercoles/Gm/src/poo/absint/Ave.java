package poo.absint;

public abstract class Ave extends Animal implements Volador{
    public Ave(String nombre) {
        super(nombre);
        
    }

    private String tipoPlumas;

    @Override
    public abstract void volar();

    @Override
    public abstract void emitirSonido(); 

    //@Override
    //public abstract void emitirSonido();

    



}
