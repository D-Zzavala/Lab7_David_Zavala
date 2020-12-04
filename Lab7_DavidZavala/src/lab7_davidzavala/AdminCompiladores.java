package lab7_davidzavala;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminCompiladores {

    private ArrayList<Compilador> ArCampiladores = new ArrayList();
    private File Archivo = null;

    public AdminCompiladores() {
    }

    public AdminCompiladores(String Path) {
        Archivo = new File(Path);
    }

    public ArrayList<Compilador> getArCampiladores() {
        return ArCampiladores;
    }

    public void setArCampiladores(ArrayList<Compilador> ArCampiladores) {
        this.ArCampiladores = ArCampiladores;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    
    public void setCompilador(Compilador C) {
        ArCampiladores.add(C);
    }

    @Override
    public String toString() {
        return "AdminCompiladores{" + "Archivo=" + Archivo + '}';
    }

    public void CargarArchivo() {
        try {
            ArCampiladores = new ArrayList();
            Compilador temp;
            if (Archivo.exists()) {
                FileInputStream Entrada = new FileInputStream(Archivo);
                ObjectInputStream Objeto = new ObjectInputStream(Entrada);
                try {
                    while ((temp = (Compilador) Objeto.readObject()) != null) {
                        ArCampiladores.add(temp);
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo ha salido mal.");
        }
    }

    public void EscribirArchivo() {
        FileOutputStream FW = null;
        ObjectOutputStream BW = null;
        try {
            FW = new FileOutputStream(Archivo);
            BW = new ObjectOutputStream(FW);
            for (Compilador t : ArCampiladores) {
                BW.writeObject(t);
            }
            BW.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo ha salido mal.");
        } finally {
            try {
                BW.close();
                FW.close();
            } catch (Exception e) {
            }
        }
    }
}
