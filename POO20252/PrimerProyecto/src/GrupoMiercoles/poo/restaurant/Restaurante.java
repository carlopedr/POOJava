package GrupoMiercoles.poo.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Restaurante {
    HashMap<String, IFastFood> mapaRecetasRestaurante = new HashMap<>();
    Menu menu;
    
//Método para crear recetas y almacenarlas en el mapa del restaurante.

    public void creaRecetas() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ingredientes = new ArrayList<String>();
        ArrayList<String> pasos = new ArrayList<String>();
        System.out.print("Número de recetas: ");
        int nrecetas = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= nrecetas; i++) {
            System.out.println("Tipo P:Pizza S:Sandwich");
            String tipo = sc.nextLine();
            System.out.print("Nombre de la receta: ");
            String nombre = sc.nextLine();
            System.out.println("Ingredientes");
            boolean mas = true;
            while (mas) {
                System.out.print("Ingrese el ingrediente: ");
                String ing = sc.nextLine();
                ingredientes.add(ing);
                System.out.print("Otro ingrediente? (S/N) ");
                String rta = sc.nextLine();
                if (rta.toUpperCase().equals("N")) {
                    mas = false;
                }
            }
            mas = true;
            while (mas) {
                System.out.print("Ingrese el paso: ");
                String ing = sc.nextLine();
                pasos.add(ing);
                System.out.print("Otro paso? (S/N) ");
                String rta = sc.nextLine();
                if (rta.toUpperCase().equals("N")) {
                    mas = false;
                }
            }
            
            if (tipo.equals("P")) {
                Pizza pizza = new Pizza(nombre, ingredientes, pasos);
                mapaRecetasRestaurante.put(nombre, pizza);
                
            } else if (tipo.equals("S")) {
                Sandwich sandwich = new Sandwich(nombre, ingredientes, pasos);
                mapaRecetasRestaurante.put(nombre, sandwich);
                
            }
        }
        //return 

    }

//Método anadirRecetaAlMenu(IFastFood receta) , que vale para añadir la receta indicada por parámetro al menú.
//Método anadirRecetaAlMenu() , que vale para añadir una receta (de las ya existentes en el mapa de recetas) a un menú. Se le ha de pedir al usuario que elija.
//Método tiempoMedio() que calcula la media de todos los tiempos de preparación del menú. Se devuelve -1 en el caso de que la lista esté vacía.
//Método porcentajeVegetariano() que calcula el porcentaje de elementos vegetarianos de un menú de un restaurante.
//Método main ademas de crear un menú, debe probar el resto de los métodos de la clase Restaurante: creando recetas, añadiéndolas al mapa de recetas del restaurante, y crear un menú eligiendo entre la recetas del restaurante
}
