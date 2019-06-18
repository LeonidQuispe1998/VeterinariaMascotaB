
package managedbean;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class MascotaBean {
    private Mascota mascota;

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public MascotaBean() {
        mascota = new Mascota();
    }
    
    public String guardar(){
        MascotaDao dao = new MascotaDao();
        dao.guardarMascota(mascota);
        
        return "/RegistroMascota";
    }
    public ArrayList<Mascota> listar(){
        ArrayList<Mascota> milista = new ArrayList<>();
        MascotaDao dao = new MascotaDao();
        milista = (ArrayList<Mascota>) dao.listarMascota();
        return milista;
    }
    
    public String actualizarMascota(){
        
        MascotaDao dao = new MascotaDao();
        dao.actualizar(mascota);
        limpiar();
        return "/RegistroMascota";
    }
    
    public String limpiar(){
        mascota = new Mascota();
        return "/RegistroMascota";
    }
    public String eliminar(Mascota m){
        MascotaDao dao = new MascotaDao();
        dao.eliminar(m);
        return "/RegistroMascota";
        
    }
}
