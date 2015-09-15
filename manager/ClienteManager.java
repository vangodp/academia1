package manager;
import java.util.ArrayList;
import dados.Cliente;

public class ClienteManager {
    public static ArrayList <Cliente> listaClientes = new ArrayList<>();    
    
    public static void carregarLista(){
        listaClientes.add(new Cliente( 
                "Ronaldo", "M", "13/07/1986", "InfielXD", 
                "um Cpf", "123123123", "Rua grande n1", 
                "jow@tromundo.com", "ComplicadaXD" 
            ) 
        ); 
        
    }//Fin de carregarLista
    
    public static void carregarCliente(  
        String nome,
        String sexo,
        String dataNascimento,
        String estadoCivil,
        String cpf,
        String telefone,
        String endereco,
        String email,  
        String situacao
    ){
        listaClientes.add(new Cliente( 
                nome, sexo, dataNascimento, estadoCivil, 
                cpf, telefone, endereco, email, situacao 
            ) 
        ); 
    }//fin de carregar cliente
    
    public static void getCliente(int n){
        System.out.println( 
            listaClientes.get(n).nome           + ", " +
            listaClientes.get(n).sexo           + ", " + 
            listaClientes.get(n).dataNascimento + ", " +
            listaClientes.get(n).estadoCivil    + ", " +
            listaClientes.get(n).cpf            + ", " +
            listaClientes.get(n).telefone       + ", " +
            listaClientes.get(n).endereco       + ", " + 
            listaClientes.get(n).email          + ", " +
            listaClientes.get(n).situacao       + "."                   
        );
    }
}