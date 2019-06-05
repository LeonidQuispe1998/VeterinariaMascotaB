
package managedbean;

import dao.MascotaDao;
import entidades.Mascota;
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
    
    public void guardar(){
        MascotaDao dao = new MascotaDao();
        dao.guardarMascota(mascota);
    }
}
