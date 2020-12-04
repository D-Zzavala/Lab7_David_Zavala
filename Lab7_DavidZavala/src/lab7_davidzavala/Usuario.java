package lab7_davidzavala;

import java.io.Serializable;

class Usuario implements Serializable{
    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String Contraseña;
    private int Nota;

    private static final long SerialVersionUID  = 666L;
    
    public Usuario(String Nombre, String Apellido, String Usuario, String Contraseña, int Nota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Nota = Nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Apellido: " + Apellido + ", Usuario: " + Usuario + '}';
    }
    
    
}
