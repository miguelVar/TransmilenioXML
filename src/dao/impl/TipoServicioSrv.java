/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ITipoServicio;
import java.util.List;
import modelo.Estaciones;
import modelo.Servicios;
import modelo.TipoServicio;
import org.hibernate.Session;
import util.SessionManagment;

/**
 *
 * @author migue
 */
public class TipoServicioSrv implements ITipoServicio{

    @Override
    public void agregarTipoServicio(TipoServicio tipoServicio) {
         SessionManagment.openSessionHibernate(tipoServicio);
    }

    @Override
    public List<TipoServicio> listarTipoServicio() {
        Session session = SessionManagment.getSessionHibernate();
        List<TipoServicio> tipoServicios = session.createQuery("from tipo_servicio").list();
        session.close();
        return tipoServicios;
    }

    @Override
    public TipoServicio buscarTipoServicio(Integer idTipoServicio) {
        Session session= SessionManagment.getSessionHibernate();
        List<TipoServicio> response = session.createQuery("from tipo_servicio where id_tipo_servicio="+String.valueOf(idTipoServicio)).list();
        TipoServicio tipoServicio = new TipoServicio();
        if (response.size()>0){
           tipoServicio.setIdTipoServicio(response.get(0).getIdTipoServicio());
           tipoServicio.setNombreTipoServicio(response.get(0).getNombreTipoServicio());
           tipoServicio.setServicioses(response.get(0).getServicioses());
        }
        session.close();
        return tipoServicio;
    }

    @Override
    public void agregarTipoServicioServicio(TipoServicio servicio, Servicios servicios) {
         servicio.getServicioses().add(servicios);
         servicios.setTipoServicio(servicio);
         SessionManagment.openSessionHibernate(servicio);
    }
    
    
    
}
