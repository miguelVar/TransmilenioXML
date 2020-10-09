/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ITtroncal;
import java.util.List;
import modelo.Troncales;
import modelo.Zonas;
import org.hibernate.Session;
import util.SessionManagment;

/**
 *
 * @author migue
 */
public class TroncalService implements ITtroncal{

    @Override
    public void agregarTroncal(Troncales troncales) {
        SessionManagment.openSessionHibernate(troncales);
    }

    @Override
    public List<Troncales> listarTroncales() {
        Session session = SessionManagment.getSessionHibernate();
        List<Troncales> troncaleses = session.createQuery("from troncales").list();
        session.close();
        return troncaleses;
    }

    @Override
    public Troncales buscarTroncal(Integer idTroncal) {
        Session session= SessionManagment.getSessionHibernate();
        List<Troncales> response = session.createQuery("from troncales where id_troncal="+String.valueOf(idTroncal)).list();
        Troncales troncal = new Troncales();
        if (response.size()>0){
           troncal.setIdTroncal(response.get(0).getIdTroncal());
           troncal.setLetraTroncal(response.get(0).getLetraTroncal());
           troncal.setNombreTroncal(response.get(0).getNombreTroncal());
           troncal.setZonases(response.get(0).getZonases()); 
        }
        session.close();
        return troncal;
    }

    @Override
    public void agregarTroncalZona(Troncales troncales, Zonas zonas) {
        troncales.getZonases().add(zonas);
        zonas.setTroncales(troncales);
        SessionManagment.openSessionHibernate(troncales);
    }
    
}
