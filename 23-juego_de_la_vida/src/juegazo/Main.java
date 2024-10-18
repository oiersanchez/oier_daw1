package juegazo; 
import java.util.Random; 
import java.util.Scanner; 
public class Main { 
   public static void main(String[] args) { 
       Scanner entrada = new Scanner(System.in); 
       String viva = "*"; 
       String muerta = "."; 
       // Solicita al usuario el n�mero de filas y columnas de la matriz.
       System.out.println("Introduce el n�mero de filas:");
       int filas = entrada.nextInt(); 
       System.out.println("Introduce el n�mero de columnas:");
       int columnas = entrada.nextInt(); 
       String[][] matriz = new String[filas][columnas]; 
       // Inicializa la matriz llen�ndola con c�lulas muertas.
       for (int fila = 0; fila < matriz.length; fila++) { 
           for (int col = 0; col < matriz[fila].length; col++) { 
               matriz[fila][col] = muerta; 
           }
       }
       mostrarMatriz(matriz); // Muestra la matriz inicial en la consola, el metodo esta abajo.
       // Ofrece opciones al usuario para seleccionar el modo de introducci�n de c�lulas.
       System.out.println("Selecciona el modo de introducci�n:");
       System.out.println("1. Manual");
       System.out.println("2. Autom�tico");
       int modo = entrada.nextInt(); 
       // Se utiliza un 'switch' para determinar el modo de introducci�n de c�lulas.
       switch (modo) {
           case 1: // Si el usuario elige el modo manual.
               while (true) { 
                   System.out.println("�D�nde quieres c�lulas vivas? Introducir fila (0 para parar):");
                   int f = entrada.nextInt(); 
                   if (f == 0) { 
                       break;
                   }
                   System.out.println("�D�nde quieres c�lulas vivas? Introducir columna:");
                   int c = entrada.nextInt(); 
                  
                   // Verifica que la posici�n ingresada sea v�lida.
                   if (f > 0 && f <= filas && c > 0 && c <= columnas) {
                       matriz[f - 1][c - 1] = viva; 
                   } else {
                       System.out.println("Posici�n inv�lida. Intenta de nuevo."); 
                   }
               }
               break; 
           case 2: // Si el usuario elige el modo autom�tico.
               Random rand = new Random(); 
               int cantidadCeldasVivas = (filas * columnas) / 4;
              
               // Rellena c�lulas vivas en posiciones aleatorias.
               for (int i = 0; i < cantidadCeldasVivas; i++) {
                   int f = rand.nextInt(filas); 
                   int c = rand.nextInt(columnas); 
                   matriz[f][c] = viva; 
               }
               break; 
           default: // Si el modo seleccionado no es v�lido.
               System.out.println("Modo no v�lido. Saliendo."); 
               entrada.close(); 
               return; 
       }
       mostrarMatriz(matriz); 
       // Simulaci�n de generaciones del juego.
       boolean cambios = true;
       int generacion = 1; 
       // Bucle que simula generaciones hasta que no haya cambios.
       while (cambios) {
           System.out.println("Generaci�n " + generacion + ":"); 
           String[][] nuevaMatriz = new String[filas][columnas];
           cambios = false; // Reinicia el estado de cambios para esta generaci�n.
           for (int fila = 0; fila < filas; fila++) {
               for (int col = 0; col < columnas; col++) {
                   int vecinasVivas = 0;
                   // Contar vecinas vivas en las posiciones adyacentes.
                   for (int i = -1; i <= 1; i++) {
                       for (int j = -1; j <= 1; j++) {
                           if (i == 0 && j == 0) continue; 
                           int filaVecina = fila + i;
                           int colVecina = col + j; 
                           // Verifica que la posici�n vecina est� dentro de los l�mites de la matriz.
                           if (filaVecina >= 0 && filaVecina < filas && colVecina >= 0 && colVecina < columnas) {
                               if (matriz[filaVecina][colVecina].equals(viva)) { 
                                   vecinasVivas++;
                               }
                           }
                       }
                   }
                   // Aplica las reglas del juego a la c�lula actual.
                   if (matriz[fila][col].equals(viva)) { // Si la c�lula actual est� viva.
                       if (vecinasVivas == 2 || vecinasVivas == 3) { 
                           nuevaMatriz[fila][col] = viva; 
                       } else {
                           nuevaMatriz[fila][col] = muerta; 
                       }
                   } else { // Si la c�lula est� muerta.
                       if (vecinasVivas == 3) { 
                           nuevaMatriz[fila][col] = viva; 
                       } else {
                           nuevaMatriz[fila][col] = muerta; 
                       }
                   }
               }
           }
           mostrarMatriz(nuevaMatriz);
           // Comprueba si hay cambios en la matriz.
           for (int fila = 0; fila < filas; fila++) {
               for (int col = 0; col < columnas; col++) {
                   if (matriz[fila][col].equals(nuevaMatriz[fila][col])) { 
                       cambios = true; // Cambios detectados.
                   }
               }
           }
           matriz = nuevaMatriz; // Actualiza la matriz para la siguiente generaci�n.
           generacion++;
           // Limita la simulaci�n a 100 generaciones.
           if (generacion == 101) {
               break;
           }
       }
       entrada.close();
   }
   // M�todo para mostrar la matriz en la consola.
   private static void mostrarMatriz(String[][] matriz) {
       for (int fila = 0; fila < matriz.length; fila++) { 
           for (int col = 0; col < matriz[fila].length; col++) { 
               System.out.print(matriz[fila][col] + " ");
           }
           System.out.println(""); 
       }
   }
}
