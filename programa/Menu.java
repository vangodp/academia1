package programa;

public class Menu {
    
    public static void principal(){
        System.out.println("MENU PRINCIPAL: ");
        System.out.println("1. Agendamento  ");
        System.out.println("2. Registro     ");
        System.out.println("3. Informes     ");
        System.out.println("0. Sair         ");         
    }

    public static void agendamento(){
        System.out.println("MENU AGENDAMENTO:   ");
        System.out.println("1. Marcar Horario   ");
        System.out.println("2. Remarcar Horario ");
        System.out.println("0. Sair             ");         
    }
    public static void registros(){
        System.out.println("MENU PRINCIPAL:         ");
        System.out.println("1. Registrar Cliente    ");
        System.out.println("2. Registrar Professor  ");
        System.out.println("3. Registrar Modalidade ");
        System.out.println("4. Registrar turmas     ");
        System.out.println("0. Sair                 ");         
    }    
    public static void informes(){
        System.out.println("MENU AGENDAMENTO:       ");
        System.out.println("1. informe alunos       ");
        System.out.println("2. informe professores  ");
        System.out.println("3. informe turmas       ");
        System.out.println("4. informe servicios    ");
        System.out.println("5. informe de turmas para uma determinada data      ");
        System.out.println("6. informe de alunos por situação (ativo/inativo);  ");
        //...
        System.out.println("0. Sair                 ");      
    
    }
}