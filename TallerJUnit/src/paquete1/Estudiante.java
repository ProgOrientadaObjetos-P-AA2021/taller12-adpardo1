package paquete1;

/**
 *
 * @author 0zzda
 */
public class Estudiante {
        // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;

    public Estudiante(String nom, String ape, String id,
                      int ed) {
        nombresEstudiante = nom;
        apellidosEstudiante = ape;
        identificacionEstudiante = id;
        edadEstudiante = ed;
    }

    public Estudiante() {
    }
    public void setNombresEstudiante(String n) {
        nombresEstudiante = n;
    }
    public String getNombresEstudiante() {
        return nombresEstudiante;
    }

    public void setApellidosEstudiante(String n) {
        apellidosEstudiante = n;
    }

    public String getApellidosEstudiante() {
        return apellidosEstudiante;
    }

    public void setIdentificacionEstudiante(String n) {
        identificacionEstudiante = n;
    }

   
    public String getIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public void setEdadEstudiante(int n) {
        edadEstudiante = n;
    }
    
    public int getEdadEstudiante() {
        return edadEstudiante;
    }
    @Override
    public String toString() {
        return String.format("Nombre Estudiante: %s %s\n"
                + "Cédula: %s\n", nombresEstudiante, apellidosEstudiante, identificacionEstudiante);
    }
    
}
