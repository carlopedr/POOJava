package Coches;

public class Prueba2 {
    public static void main(String[] args) {
        CocheE ce=new CocheE();
        ce.setColor("Fucsia");
        System.out.println("Color: "+ce.getColor());
        CocheE ce1=new CocheE("BMW","Negro","WQE456",2000);
        CocheE [] loteCoches = new CocheE[3];
        loteCoches[0]=ce;
        loteCoches[1]=ce1;
        loteCoches[2]=new CocheE("ren","verde","HGF678",1600);

        for(int i=0;i<loteCoches.length;i++){
            System.out.println("Color: "+loteCoches[i].getColor());
        }
    }

}
