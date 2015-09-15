package manager;
import java.io.File;
import java.util.Scanner;
import manager.ClienteManager;
public class FileManager {

    public static void carregarClientes() {
        File fichero = new File("src/clientes.txt");
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            System.out.print("... Leemos el contenido del fichero ...\n");
            s = new Scanner(fichero);
            String linea;
            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                linea = s.nextLine(); 	// Guardamos la linea en un String
                armazenarCliente(linea);
            }
            //ClienteManager.getCliente(ClienteManager.nClientes);
            
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }

    }
    
    public static void armazenarCliente(String s){
                String[] dados = s.split(", ");
                ClienteManager.carregarCliente( 
                    dados[0], dados[1], dados[2],
                    dados[3], dados[4], dados[5],
                    dados[6], dados[7], dados[8]  
                );
                ClienteManager.getCliente(ClienteManager.nClientes++);        
    }
    
    
    
}
