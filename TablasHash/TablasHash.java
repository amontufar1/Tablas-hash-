import java.util.HashMap;

public class TablasHash {
    public static void main(String[] args) {
        // Declarar una variable con sintaxis de C++
        int suma = 0;
        suma = 54 + 20;

        // Crear tabla hash para almacenar los tokens y sus claves hash
        HashMap<String, String> tablaHash = new HashMap<>();

        // Campo de texto multilínea que contiene el código
        String codigo = "int suma = 0;\nsuma = 54 + 20;";

        // Dividir el código en líneas
        String[] lineas = codigo.split("\n");

        // Inicializar las coordenadas para la tabla hash
        int x = 0;
        int y = 0;

        // Iterar a través de cada línea del código
        for (String linea : lineas) {
            // Dividir la línea en tokens
            String[] tokens = linea.split("\\s+");

            // Incrementar la coordenada y (fila) para la próxima línea
            y++;

            // Reiniciar la coordenada x (columna) para la próxima línea
            x = 0;

            // Iterar a través de cada token en la línea
            for (String token : tokens) {
                // Agregar el token y su clave hash a la tabla hash
                tablaHash.put("(" + x + "," + y + ")", token);
                // Incrementar la coordenada x (columna) para el próximo token
                x += token.length() + 1; // Se suma 1 para tomar en cuenta el espacio entre tokens
            }
        }

        // Mostrar el resultado en la consola
        System.out.println("Clave\tToken");
        for (String clave : tablaHash.keySet()) {
            System.out.println(clave + "\t" + tablaHash.get(clave));
        }
    }
}