package lab5;

public class Persona {
    private String nacionalidad;
    private String nombrePersona;
    private String apellido;
    private int edad;
    private String genero;
    private String vocacion;
    private boolean tieneTitulo;
    private boolean infectadoCorona;

    public Persona() {
    }

    public Persona(String nacionalidad, String nombrePersona, String apellido, int edad, String genero, String vocacion, boolean tieneTitulo, boolean infectadoCorona) {
        this.nacionalidad = nacionalidad;
        this.nombrePersona = nombrePersona;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.vocacion = vocacion;
        this.tieneTitulo = tieneTitulo;
        this.infectadoCorona = infectadoCorona;
    }

    public boolean isInfectadoCorona() {
        return infectadoCorona;
    }

    public void setInfectadoCorona(boolean infectadoCorona) {
        this.infectadoCorona = infectadoCorona;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

    public boolean isTieneTitulo() {
        return tieneTitulo;
    }

    public void setTieneTitulo(boolean tieneTitulo) {
        this.tieneTitulo = tieneTitulo;
    }

    @Override
    public String toString() {
        return nombrePersona;
    }
    
}
