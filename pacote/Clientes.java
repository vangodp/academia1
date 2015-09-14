package pacote;
import java.util.ArrayList;
import java.util.Scanner;

public class Clientes{  
    String nome;
    String sexo;
    String dataNascimento;
    String estadoCivil;
    String cpf;
    String telefone;
    String endereco;
    String email;           
    String situacao;

     

    public Clientes( 
      String nome,
      String sexo,
      String dataNascimento,
      String estadoCivil,
      String cpf,
      String telefone,
      String endereco,
      String email,  
      String situacao){
      
      this.nome           = nome;
      this.sexo           = sexo;
      this.dataNascimento = dataNascimento;
      this.estadoCivil    = estadoCivil;
      this.cpf            = cpf;
      this.telefone       = telefone;
      this.endereco       = endereco;
      this.email          = email;         
      this.situacao       = situacao;
      

      
    }
    
    public Clientes(){}
    
    
    
    
    
    
}    
