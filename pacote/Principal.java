package pacote;
import java.util.Scanner;

public class Principal {
    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        Menu.principal();
        
        ClientesManager.carregarLista();
        System.out.println( ClientesManager.listaClientes.get(0).nome );
        System.out.println("prova netbeams integracion");
    }
    
    
}































































