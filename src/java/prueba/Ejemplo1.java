
package prueba;

import dao.MascotaDao;
import entidades.Mascota;


public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MascotaDao mascotadao = new MascotaDao();
        
        Mascota mimascota = new Mascota(1, "Hachi", "Leonid", "Pitbull");
        
        mascotadao.guardarMascota(mimascota);
    }
    
}
