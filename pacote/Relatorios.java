package pacote;
import java.util.Scanner;

public class Relatorios{
    
    public void exibir( String parametro ){ 
        //Todas essas coisas só podemos fazer quando estiver pronto seus arrays ;)        
        if ( "Clientes".equals(parametro) ){
            //listar clientes ok?
        }else if ( "Professores".equals(parametro) ){
            //listar Profes
        }else if  ( "Turmas".equals(parametro) ){
            //listar turmas
        }else if ( "Tudo".equals(parametro)){
            //lista tudo
        }else{
            //incorreto
        }
    }
    
    void menu(){
        System.out.println("\t\tSUB MENU:         ");
        System.out.println("\t1. Mostrar Clientes ");
        System.out.println("\t2. Mostrar Professor");
        System.out.println("\t3. Mostrar Turmas   ");
        System.out.println("\t0. Sair             ");        
        
        int opcao;   
        Scanner entrada = new Scanner(System.in); 
        
        opcao = entrada.nextInt();
        
        switch( opcao ){ 
            case 1:
                exibir ("Clientes");
                break;
            case 2:
                exibir ("Professores");
                break;                
            case 3:
                exibir ("Turmas");
                break;            
            default:
                System.out.println("Opção incorreta."); 
                break;
        }
    }
    
}

