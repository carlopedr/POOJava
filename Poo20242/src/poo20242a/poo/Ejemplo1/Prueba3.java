package poo.Ejemplo1;

public class Prueba3 {
    public static void main(String[] args) {
        CocheV2 cv2 = new CocheV2("MAzda", "Rojo", 10000, 1.5, 2021);
        System.out.println(cv2.toString());
        cv2.anadirKm(10);
        System.out.println(cv2.toString());
        cv2.anadirKm(-10);
        System.out.println(cv2.toString());

        int [] arrayInt = new int[5];
        CocheV2 [] arrayCv2 = new CocheV2[10];
        arrayCv2[0]=cv2;
        System.out.println("KM:"+arrayCv2[0].getKm());

    }
}
