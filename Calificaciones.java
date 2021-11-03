import java.util.Scanner;

public class Calificaciones{

    public static void main(String[] args) {

        int opcion = 0;

        //Constructores
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ListaAlumnos lista = new ListaAlumnos();
        
        //Ejecucion del programa mientras el usuario lo desee
        while(opcion != 5){
            menu.ImprimirMenu();
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    lista.Capturar();
                    sc.nextLine();
                    break;
                case 2: 
                    lista.Promedio();
                    break;
                case 3:
                    lista.Baja();
                    break;
                case 4: 
                    lista.Alta();
                    break;
                case 5:
                    break;
            }
        }
        sc.close();
    }
}