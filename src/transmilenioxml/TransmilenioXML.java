/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transmilenioxml;

import constantes.EnumServicios;
import controlador.TransmilenioControlador;
import java.util.Date;
import modelo.Dias;
import modelo.Estaciones;
import modelo.Horario;
import modelo.HorarioId;
import modelo.Recorridos;
import modelo.RecorridosHasServicios;
import modelo.RecorridosHasServiciosId;
import modelo.Rutas;
import modelo.RutasId;
import modelo.Servicios;
import modelo.TipoServicio;
import modelo.Troncales;
import modelo.Usuarios;
import modelo.Zonas;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;
import util.SessionManagment;

/**
 *
 * @author migue
 */
public class TransmilenioXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TransmilenioControlador controladorTrm = new TransmilenioControlador();
        Troncales troncales = new Troncales(2, "Troncal B", "B");
        Zonas zonas = new Zonas(2, troncales, "B", "Azul");
        
        
        Estaciones estaciones = new Estaciones(1, zonas, "Estacion 161");
        Dias dias = new Dias(1, "Lunes-Jueves");
        TipoServicio tipoServicio = new TipoServicio(1, "Ruta facil");
        Servicios servicios = new Servicios(1, tipoServicio, "H13", "Azul", EnumServicios.COMPLETO.toString());
        SessionManagment.openSessionHibernate(servicios);
        HorarioId horarioId = new HorarioId(servicios.getIdServicio(), dias.getIdDia());
        Horario horario = new Horario(horarioId, dias, new Date(), new Date());
        RutasId rutasId = new RutasId(servicios.getIdServicio(), estaciones.getIdEstacion());
        Rutas rutas = new Rutas(rutasId, estaciones, servicios,(byte)1,(byte)0);
        estaciones.getRutases().add(rutas);
        servicios.getRutases().add(rutas);
        
        Usuarios usuarios = new Usuarios(1, "Miguel", "Vargas", "3223");
        SessionManagment.openSessionHibernate(usuarios);
        Recorridos recorridos = new Recorridos(usuarios, new Date(), new Date());
        SessionManagment.openSessionHibernate(recorridos);
        
        RecorridosHasServiciosId recorridosHasServiciosId = new RecorridosHasServiciosId(recorridos.getUsuariosIdUsuario(), servicios.getIdServicio());
        RecorridosHasServicios  recorridosHasServicios = new RecorridosHasServicios(recorridosHasServiciosId, estaciones, estaciones, recorridos, servicios, "1");
        recorridos.getRecorridosHasServicioses().add(recorridosHasServicios);
        servicios.getRecorridosHasServicioses().add(recorridosHasServicios);
        
        
        controladorTrm.agregarTroncalZona(troncales, zonas);
        dias.getHorarios().add(horario);
        servicios.getHorarios().add(horario);
        SessionManagment.openSessionHibernate(dias);
        controladorTrm.agregarEstacionZona(estaciones, zonas);
        controladorTrm.agregarTipoServicioServicio(tipoServicio, servicios);
        SessionManagment.openSessionHibernate(recorridos);
        
        System.out.println("Satisfactorio!!");
        System.exit(0);
    }
    
}
