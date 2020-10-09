/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IDias;
import java.util.List;
import modelo.Dias;
import modelo.Estaciones;
import modelo.Horario;
import org.hibernate.Session;
import util.SessionManagment;

/**
 *
 * @author migue
 */
public class DiasService implements IDias {

    @Override
    public void agregarDia(Dias dias) {
        SessionManagment.openSessionHibernate(dias);
    }

    @Override
    public List<Dias> listarDias() {
        Session session = SessionManagment.getSessionHibernate();
        List<Dias> dias = session.createQuery("from dias").list();
        session.close();
        return dias;
    }

    @Override
    public Dias buscarDia(Integer idDia) {
        Session session= SessionManagment.getSessionHibernate();
        List<Dias> response = session.createQuery("from dias where id_dia="+String.valueOf(idDia)).list();
        Dias dia = new Dias();
        if (response.size()>0){
           dia.setCombinacionDias(response.get(0).getCombinacionDias());
           dia.setHorarios(response.get(0).getHorarios());
           dia.setIdDia(response.get(0).getIdDia());
        }
        session.close();
        return dia;
    }

    @Override
    public void agregarHorarioDia(Dias dias, Horario horario) {
        dias.getHorarios().add(horario);
        horario.setDias(dias);
        SessionManagment.openSessionHibernate(dias);
    }

}
