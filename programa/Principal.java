    /*
    Uma academia oferece ao público diversos serviços, como *musculação, *aulas 
    aeróbicas, *pilates, entre *outros. Todas as aulas dessa academia ocorrem com 
    "turmas fechadas" de no "máximo" *5 alunos, e têm duração de *1 hora cada. Essa 
    academia precisa "efetuar o controle dos clientes, professores, serviços", e 
    possuir uma agenda para controlar as turmas. Para tanto, você deve esenvolver 
    um programa em Java que faça este controle.
    */

package programa;
import manager.FileManager;
import informes.Relatorio;

public class Principal {
    
    public static void main(String[] args) {
        Menu.principal();  //Mostrando menú principal
        
        System.out.println();
        FileManager.carregarClientes();     //Carrega un numero indeterminado de clientes predefinidos desde o arquivo clientes.txt
        Relatorio.clientes();              //Mostrando Clientes carregados na lista
        
        System.out.println();
        FileManager.carregarProfessores(); //Carrega un numero indeterminado de professores predefinidos desde o arquivo professores.txt
        Relatorio.professores();          //Mostrando Professores carregados na lista
    }
}































































