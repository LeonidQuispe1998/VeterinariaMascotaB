/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utilitarios.HibernateUtil;
import entidades.Mascota;
import interfaces.IMascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LEONID
 */
public class MascotaDao implements IMascota{

  

  public void guardarMascota(Mascota mascota) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        
        sesion.save(mascota);
        transaccion.commit();
        
        sesion.close();
    }
   
    @Override
    public ArrayList<Mascota> listarMascota() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Mascota> milista = new ArrayList<>();
      
        Query query = session.createQuery("FROM Mascota");
        ArrayList<Mascota> ArrayList = null;
        milista = (ArrayList<Mascota>) query.list();
        return milista;
    }
    @Override
    public void actualizar(Mascota mascota){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.update(mascota);
        transaccion.commit();
        sesion.close();
        
        
    }
    @Override
    public void eliminar(Mascota mascota){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.delete(mascota);
        transaccion.commit();
        sesion.close();
    }
}