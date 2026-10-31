

package POO.Coche;


public class Garage {
    PlazaGarage[] plazas;
    
    public void construyePlazas(int numPlazas){
        plazas=new PlazaGarage[numPlazas];
    }
    //método alquilarPlaza(Coche uncoche, int numplaza), 
    //que asigna el coche uncoche al array de plazas, 
    //en la posición numplaza. 
    //No puede alquilarse una plaza si ya tenia
    //un coche asignado a ella
    
    
    public void alquilarPlaza(Coche unCoche,int numPlaza){
        //Validar que numPlaza sea valido
        if (plazas[numPlaza]==null){
            System.out.println("Agrega coche!!");
            PlazaGarage pg = new PlazaGarage(unCoche,0);
            plazas[numPlaza]=pg;
        }
        else{
            System.out.println("Plaza ocupada!!");
        }
        
    }
    
    //método asignarImporte(double importeAlquiler, int numplaza), 
    //que aplica el valor importeAlquiler en el atributo coste, 
    //en la plaza que ocupa la posición numplaza en el array
    
    public void asignarImporte(double importeAlquiler, int numPlaza){
        plazas[numPlaza].setCoste(importeAlquiler);
    }
    
    public void listarCoches(){
        for(int i=0;i<plazas.length;i++){
            if(plazas[i]==null){
                System.out.println("Pos "+i+" vacia");
            }
            else
                
                System.out.println("Pos "+i+" "+plazas[i].toString());
        }
    }
    
    public boolean validarNumPlaza(int numPlaza){
        boolean res=false;
        if (numPlaza>=0 & numPlaza<plazas.length)
            res=true;
        return res;
    }
    

}
