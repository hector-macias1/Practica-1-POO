import java.util.ArrayList;
import java.util.Scanner;

public class ListaAlumnos{

    //Variables de la clase ListaAlumnos
    String nombre;
    float calificacion;
    String matricula;

    //Constructores
    Scanner sc = new Scanner(System.in);
    Alumno alumno = new Alumno(nombre, calificacion, matricula);

    //ArrayList de objetos de Alumno
    ArrayList<Alumno> lista_alumnos = new ArrayList<Alumno>();

    //Metodo para capturar los datos del ArrayList
    public void Capturar(){
        System.out.println("\nIngrese el nombre del alumno: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la matricula del alumno: ");
        matricula = sc.nextLine();
        System.out.println("Ingrese la calificacion del alumno: ");
        calificacion = sc.nextFloat();
        sc.nextLine();

        alumno = new Alumno(nombre, calificacion, matricula);

        lista_alumnos.add(alumno);        
    }

    //Metodo para promediar califacaciones
    public void Promedio(){
        String string = "";
        float n = 0;
        float promedio = 0;
        //Impresion de datos
        for(int i = 0; i < lista_alumnos.size(); i++){
            string += "\nAlumno " + (i+1) + "\n";
            string += "Nombre: "+lista_alumnos.get(i).getNombre() + "\n";
            string += "Matricula: "+lista_alumnos.get(i).getMatricula() + "\n";
            string += "Calificacion: "+lista_alumnos.get(i).getCalificacion() + "\n";
        }

        System.out.println(string + "\n");

        //Calculo del promedio de calificaciones
        alumno = lista_alumnos.get(0);
        for(int i = 1; i <= lista_alumnos.size(); i++){
            alumno = lista_alumnos.get(i-1);
            n = (n + alumno.getCalificacion());
        }
        promedio = n / lista_alumnos.size();
        System.out.println("El promedio de las calificaciones es: " + promedio + "\n");
    }

    //Metodo para calcular la calificacion mas baja
    public void Baja(){
        String string = "";
        //Impresion de datos
        for(int i = 0; i < lista_alumnos.size(); i++){
            string += "\nAlumno " + (i+1) + "\n";
            string += "Nombre: "+lista_alumnos.get(i).getNombre() + "\n";
            string += "Calificacion: "+lista_alumnos.get(i).getCalificacion() + "\n";
        }

        System.out.println(string + "\n");

        alumno = lista_alumnos.get(0);
        for(Alumno al : lista_alumnos){
            if(al.getCalificacion() < alumno.getCalificacion()){
                alumno = al;
            }
        }
        System.out.println("La calificacion mas baja fue: " + alumno.getNombre()); 

    }

    //Metodo para calcular la calificacion mas alta
    public void Alta(){
        String string = "";
        //Impresion de datos
        for(int i = 0; i < lista_alumnos.size(); i++){
            string += "\nAlumno " + (i+1) + "\n";
            string += "Nombre: "+lista_alumnos.get(i).getNombre() + "\n";
            string += "Calificacion: "+lista_alumnos.get(i).getCalificacion() + "\n";
        }

        System.out.println(string + "\n");

        alumno = lista_alumnos.get(0);
        for(Alumno al : lista_alumnos){
            if(al.getCalificacion() > alumno.getCalificacion()){
                alumno = al;
            }
        }
        System.out.println("La calificacion mas alta fue: " + alumno.getNombre());
    }

}