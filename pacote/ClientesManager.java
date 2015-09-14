package pacote;
import java.util.ArrayList;
import pacote.Clientes;

public class ClientesManager {
    public static ArrayList <Clientes> listaClientes = new ArrayList<>();
        
    public static void carregarLista(){
        listaClientes.add( 
            new Clientes( 
                "Ronaldo", "M", "13/07/1986", "InfielXD", 
                "um Cpf", "123123123", "Rua grande n1", 
                "jow@tromundo.com", "ComplicadaXD" 
            ) 
        ); 
        
    }
    
    
}
