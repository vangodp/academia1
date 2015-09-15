package informes;

import manager.ProfessorManager;
import manager.ClienteManager;

public class Relatorio{
    public static void professores(){
        for ( int i = 0; i < (int)ProfessorManager.listaProfessores.size(); i++ ){
            ProfessorManager.getProfessor(i);
        }
    }    

    public static void clientes(){
        for ( int i = 0; i < (int)ClienteManager.listaClientes.size(); i++ ){
            ClienteManager.getCliente(i);
        }        
    }     
}

