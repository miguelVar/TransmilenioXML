/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IEstacion;
import dao.ITtroncal;
import java.util.List;
import modelo.Estaciones;
import modelo.Troncales;
import modelo.Zonas;
import org.hibernate.Session;
import util.SessionManagment;

/**
 *
 * @author migue
 */
public class EstacionService implements IEstacion{

    @Override
    public void agregarEstacion(Estaciones estaciones) {
       SessionManagment.openSessionHibernate(estaciones);
    }

    @Override
    public List<Estaciones> listarEstaciones() {
        Session session = SessionManagment.getSessionHibernate();
        List<Estaciones> estacioneses = session.createQuery("from estaciones").list();
        session.close();
        return estacioneses;
    }

    @Override
    public Estaciones buscarEstacion(Integer idEstacion) {
        Session session= SessionManagment.getSessionHibernate();
        List<Estaciones> response = session.createQuery("from estaciones where id_estacion="+String.valueOf(idEstacion)).list();
        Estaciones estacion = new Estaciones();
        if (response.size()>0){
           estacion.setIdEstacion(response.get(0).getIdEstacion());
           estacion.setNombreEstacion(response.get(0).getNombreEstacion());
           estacion.setPortal(response.get(0).getPortal());
           estacion.setZonas(response.get(0).getZonas()); 
        }
        session.close();
        return estacion;
    }

    @Override
    public void agregarEstacionZona(Estaciones estaciones, Zonas zonas) {
        estaciones.setZonas(zonas);
        zonas.getEstacioneses().add(estaciones);
        SessionManagment.openSessionHibernate(zonas);
    }
    
}
