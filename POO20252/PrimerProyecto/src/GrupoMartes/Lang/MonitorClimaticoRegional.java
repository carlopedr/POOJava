package GrupoMartes.Lang;
  
   //import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MonitorClimaticoRegional {
 // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar si se generan los datos aleatoriamente o manualmente
        System.out.println("¿Quieres generar los datos aleatoriamente? (true/false): ");
        boolean aleatorio = scanner.nextBoolean();

        // Solicitar temperaturas mínimas y máximas
        System.out.println("Introduce la temperatura mínima permitida: ");
        double tempMinima = scanner.nextDouble();
        System.out.println("Introduce la temperatura máxima permitida: ");
        double tempMaxima = scanner.nextDouble();

        // Generar los datos de las subestaciones
        double[] temperaturasRivera = generarTemperaturasAnuales(aleatorio, tempMinima, tempMaxima);
        double[] temperaturasNeiva = generarTemperaturasAnuales(aleatorio, tempMinima, tempMaxima);
        double[] temperaturasCampoalegre = generarTemperaturasAnuales(aleatorio, tempMinima, tempMaxima);

        // Imprimir estadísticas anuales
        imprimirEstadisticasAnuales(temperaturasRivera, "Rivera");
        imprimirEstadisticasAnuales(temperaturasNeiva, "Neiva");
        imprimirEstadisticasAnuales(temperaturasCampoalegre, "Campoalegre");

        // Comparar subestaciones
        System.out.println(compararSubestaciones(temperaturasRivera, temperaturasNeiva));
        System.out.println(compararSubestaciones(temperaturasRivera, temperaturasCampoalegre));
        System.out.println(compararSubestaciones(temperaturasNeiva, temperaturasCampoalegre));

        // Detectar anomalías
        int[] anomalíasRivera = detectarAnomalias(temperaturasRivera);
        int[] anomalíasNeiva = detectarAnomalias(temperaturasNeiva);
        int[] anomalíasCampoalegre = detectarAnomalias(temperaturasCampoalegre);

        // Imprimir resultados de anomalías
        System.out.println("Anomalías térmicas en Rivera: " + anomalíasToString(anomalíasRivera));
        System.out.println("Anomalías térmicas en Neiva: " + anomalíasToString(anomalíasNeiva));
        System.out.println("Anomalías térmicas en Campoalegre: " + anomalíasToString(anomalíasCampoalegre));
    }

    // Método para generar datos simulados
    public static double[] generarTemperaturasAnuales(boolean aleatorio, double tempMinima, double tempMaxima) {
        double[] temperaturas = new double[12];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        if (aleatorio) {
            for (int i = 0; i < 12; i++) {
                temperaturas[i] = tempMinima + (tempMaxima - tempMinima) * random.nextDouble();
            }
        } else {
            for (int i = 0; i < 12; i++) {
                System.out.println("Introduce la temperatura del mes " + (i + 1) + " (entre " + tempMinima + " y " + tempMaxima + "): ");
                temperaturas[i] = scanner.nextDouble();
            }
        }

        return temperaturas;
    }

    // Método para calcular las estadísticas anuales
    public static void imprimirEstadisticasAnuales(double[] temperaturas, String nombreSubestacion) {
        double sumaTemperaturas = 0;
        double maxTemp = Double.NEGATIVE_INFINITY;
        double minTemp = Double.POSITIVE_INFINITY;
        int mesMax = 0, mesMin = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            sumaTemperaturas += temperaturas[i];
            if (temperaturas[i] > maxTemp) {
                maxTemp = temperaturas[i];
                mesMax = i;
            }
            if (temperaturas[i] < minTemp) {
                minTemp = temperaturas[i];
                mesMin = i;
            }
        }

        double promedio = sumaTemperaturas / temperaturas.length;
        System.out.println("Estadísticas de la subestación " + nombreSubestacion + ":");
        System.out.println("Temperaturas mensuales: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Mes " + (i + 1) + ": " + temperaturas[i]);
        }
        System.out.println("Temperatura más alta: Mes " + (mesMax + 1) + " = " + maxTemp);
        System.out.println("Temperatura más baja: Mes " + (mesMin + 1) + " = " + minTemp);
        System.out.println("Promedio anual: " + promedio);
    }

    // Método para comparar dos subestaciones
    public static String compararSubestaciones(double[] subestacion1, double[] subestacion2) {
        double promedio1 = calcularPromedioAnual(subestacion1);
        double promedio2 = calcularPromedioAnual(subestacion2);

        if (promedio1 > promedio2) {
            return "La subestación 1 es más cálida";
        } else if (promedio1 < promedio2) {
            return "La subestación 2 es más cálida";
        } else {
            return "Ambas subestaciones tienen temperaturas promedio similares";
        }
    }

    // Método para calcular el promedio anual
    public static double calcularPromedioAnual(double[] temperaturas) {
        double sumaTemperaturas = 0;
        for (double temp : temperaturas) {
            sumaTemperaturas += temp;
        }
        return sumaTemperaturas / temperaturas.length;
    }

    // Método para detectar anomalías térmicas
    public static int[] detectarAnomalias(double[] temperaturas) {
        int [] mesesAnomalia = new int[12];
        //ArrayList<Integer> mesesAnomalia = new ArrayList<>();
        double promedioAnual = calcularPromedioAnual(temperaturas);
        double umbralSuperior = promedioAnual * 1.2;
        double umbralInferior = promedioAnual * 0.8;
        int j=0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > umbralSuperior || temperaturas[i] < umbralInferior) {
                mesesAnomalia[j]=(i);
                j++;
            }
        }

        // Convertir ArrayList a arreglo de enteros
        /*int[] resultado = new int[mesesAnomalia.size()];
        for (int i = 0; i < mesesAnomalia.size(); i++) {
            resultado[i] = mesesAnomalia.get(i);
        }*/
        return mesesAnomalia;
    }

   
    // Método auxiliar para convertir los índices de anomalías a String
    public static String anomalíasToString(int[] anomalías) {
        if (anomalías.length == 0) {
            return "No se detectaron anomalías";
        }
        StringBuilder sb = new StringBuilder();
        for (int mes : anomalías) {
            sb.append(mes + 1).append(" ");
        }
        return sb.toString();
    }
    
    public static void reporteMensual(double[] temperaturasSub){
        
    }
}
