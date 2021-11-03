public class Alumno {

    //Atributos de "Alumno"
    String nombre;
    float calificacion;
    String matricula;

	public Alumno(String nombre, float calificacion, String matricula){
		setNombre(nombre);
        setCalificacion(calificacion);
		setMatricula(matricula);
	}

    public Alumno(){
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    ///////////////////////////////////////////////////
    public float getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }

    ///////////////////////////////////////////////////
    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}