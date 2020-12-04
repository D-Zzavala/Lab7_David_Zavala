package lab7_davidzavala;

import java.io.Serializable;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Compilador implements Serializable {

    private String Nombre;
    private Usuario Creador;
    private int Lineas;
    private int ALexico;
    private int ASintactico;
    private int Asemantico;
    private int GCodigoInter;
    private int OCodigo;
    private int GCodigo;
    private DefaultTableModel Simbolos;
    private DefaultTableModel Errores;

    private static final long SerialVersionUID = 666L;

    public Compilador() {
    }

    public Compilador(String Nombre, Usuario Creador, int Lineas, int ALexico, int ASintactico, int Asemantico, int GCodigoInter, int OCodigo, int GCodigo) {
        this.Nombre = Nombre;
        this.Creador = Creador;
        this.Lineas = Lineas;
        this.ALexico = ALexico;
        this.ASintactico = ASintactico;
        this.Asemantico = Asemantico;
        this.GCodigoInter = GCodigoInter;
        this.OCodigo = OCodigo;
        this.GCodigo = GCodigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Usuario getCreador() {
        return Creador;
    }

    public void setCreador(Usuario Creador) {
        this.Creador = Creador;
    }

    public int getLineas() {
        return Lineas;
    }

    public void setLineas(int Lineas) {
        this.Lineas = Lineas;
    }

    public int getALexico() {
        return ALexico;
    }

    public void setALexico(int ALexico) {
        this.ALexico = ALexico;
    }

    public int getASintactico() {
        return ASintactico;
    }

    public void setASintactico(int ASintactico) {
        this.ASintactico = ASintactico;
    }

    public int getAsemantico() {
        return Asemantico;
    }

    public void setAsemantico(int Asemantico) {
        this.Asemantico = Asemantico;
    }

    public int getGCodigoInter() {
        return GCodigoInter;
    }

    public void setGCodigoInter(int GCodigoInter) {
        this.GCodigoInter = GCodigoInter;
    }

    public int getOCodigo() {
        return OCodigo;
    }

    public void setOCodigo(int OCodigo) {
        this.OCodigo = OCodigo;
    }

    public int getGCodigo() {
        return GCodigo;
    }

    public void setGCodigo(int GCodigo) {
        this.GCodigo = GCodigo;
    }

    public DefaultTableModel getSimbolos() {
        return Simbolos;
    }

    public void setSimbolos(DefaultTableModel Simbolos) {
        this.Simbolos = Simbolos;
    }

    public DefaultTableModel getErrores() {
        return Errores;
    }

    public void setErrores(DefaultTableModel Errores) {
        this.Errores = Errores;
    }

    @Override
    public String toString() {
        return "Compilador: " + Nombre + ", Creador: " + Creador + ", Lineas: " + Lineas + '}';
    }

}
