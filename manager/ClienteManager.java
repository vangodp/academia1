package manager;
import java.util.ArrayList;
import dados.Clientes;

public class ClienteManager {
    public static ArrayList <Clientes> listaClientes = new ArrayList<>();
    public static int nClientes = 0; //clientes em lista... Cada vez que incluyas un cliente debes incrementar essa variavel igualmente que decrementar si remover um cliente.
    
    
    public static void carregarLista(){
        listaClientes.add( 
            new Clientes( 
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
        listaClientes.add( 
            new Clientes( 
                nome, sexo, dataNascimento, estadoCivil, 
                cpf, telefone, endereco, email, situacao 
            ) 
        ); 
    }//fin de carregar cliente
    
    public static void getCliente(int n){
        System.out.println( 
            listaClientes.get(n).nome           + " " +
            listaClientes.get(n).sexo           + " " + 
            listaClientes.get(n).dataNascimento + " " +
            listaClientes.get(n).estadoCivil    + " " +
            listaClientes.get(n).cpf            + " " +
            listaClientes.get(n).telefone       + " " +
            listaClientes.get(n).endereco       + " " + 
            listaClientes.get(n).email          + " " +
            listaClientes.get(n).situacao                   
    );
    
    }
}