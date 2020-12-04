package lab7_davidzavala;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminUsuarios {
    private ArrayList<Usuario> ArUsuarios = new ArrayList();
    private File Archivo = null;

    public AdminUsuarios() {
    }
    
    public AdminUsuarios(String Path) {
        Archivo = new File(Path);
    }

    public ArrayList<Usuario> getArUsuarios() {
        return ArUsuarios;
    }

    public void setArUsuarios(ArrayList<Usuario> ArUsuarios) {
        this.ArUsuarios = ArUsuarios;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }

    @Override
    public String toString() {
        return "AdminUsuarios{" + "Archivo=" + Archivo + '}';
    }
    
    public void CargarArchivo(){
        try {
            ArUsuarios = new ArrayList();
            Usuario temp;
            if (Archivo.exists()) {
                FileInputStream Entrada = new FileInputStream(Archivo);
                ObjectInputStream Objeto = new ObjectInputStream(Entrada);
                try {
                    while ((temp = (Usuario) Objeto.readObject()) != null) {                        
                        ArUsuarios.add(temp);
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Algo ha salido mal.");
        }
    }
    
    public void EscribirArchivo(){
            FileOutputStream FW = null;
            ObjectOutputStream BW = null;
        try {
            FW = new FileOutputStream(Archivo);
            BW = new ObjectOutputStream(FW);
            for (Usuario t : ArUsuarios) {
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
