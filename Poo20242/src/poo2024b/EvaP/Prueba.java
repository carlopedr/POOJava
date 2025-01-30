package EvaP;

public class Prueba {
    public static void main(String[] args) {
        ProductoFresco pf = new ProductoFresco();
        ProductoRefrigerado pr = new ProductoRefrigerado();
        ProductoCongelado pc = new ProductoCongelado();
        

        pf.muestraPais();
        pr.muestraPais();
        pc.muestraPais();

        Producto [] listaProducto = new Producto[4];

        listaProducto[0]=pf;
        listaProducto[1]=pr;
        listaProducto[2]=pc;
        listaProducto[3]=pc;

        for(int i=0;i<listaProducto.length;i++){
            listaProducto[i].muestraPais();
        }
    }

}
