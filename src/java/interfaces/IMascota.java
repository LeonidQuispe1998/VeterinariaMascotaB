/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEONID
 */
public interface IMascota {
    
    public abstract void guardarMascota(Mascota masccota);
    public abstract List<Mascota> listarMascota();
    public abstract void actualizar(Mascota mascota);
    public abstract void eliminar(Mascota mascota);
}
