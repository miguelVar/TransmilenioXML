/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.impl.DiasService;
import dao.impl.EstacionService;
import dao.impl.TipoServicioSrv;
import dao.impl.TroncalService;
import java.util.List;
import modelo.Dias;
import modelo.Estaciones;
import modelo.Horario;
import modelo.Servicios;
import modelo.TipoServicio;
import modelo.Troncales;
import modelo.Zonas;

/**
 *
 * @author migue
 */
public class TransmilenioControlador {

    private TroncalService troncalService;
    private EstacionService estacionService;
    private DiasService diasService;
    private TipoServicioSrv servicioSrv;
    
    public TransmilenioControlador() {
        troncalService = new TroncalService();
        estacionService = new EstacionService();
        diasService = new DiasService();
        servicioSrv = new TipoServicioSrv();
    }

    public void agregarTroncal(Troncales troncales){
       troncalService.agregarTroncal(troncales);
    }
    
    
    public List<Troncales> listarTroncales(){
        return troncalService.listarTroncales();
    }
    public Troncales buscarTroncal(Integer idTroncal){
        return troncalService.buscarTroncal(idTroncal);
    }
    public void agregarTroncalZona(Troncales troncales, Zonas zonas){
        troncalService.agregarTroncalZona(troncales, zonas);
    }
    
    //-----------------------------Estaciones -----------------------
    
    public void agregarEstacion(Estaciones estaciones){
        estacionService.agregarEstacion(estaciones);
    }
    public List<Estaciones> listarEstaciones(){
        return estacionService.listarEstaciones();
    }
    public Estaciones buscarEstacion (Integer idEstacion){
        return estacionService.buscarEstacion(idEstacion);
    }
    public void agregarEstacionZona(Estaciones estaciones, Zonas zonas){
        estacionService.agregarEstacionZona(estaciones, zonas);
    }
    
    
    //---------------------------DIAS----------------------------
    
    public void agregarDia (Dias dias){
        diasService.agregarDia(dias);
    }
    public List<Dias> listarDias(){
        return diasService.listarDias();
    }
    public Dias buscarDia(Integer idDia){
        return diasService.buscarDia(idDia);
    }
    public void agregarHorarioDia(Dias dias, Horario horario){
        diasService.agregarHorarioDia(dias, horario);
    }
    
    //-----------------------Tipo Servicio ---------------------------------
    public void agregarTipoServicio (TipoServicio tipoServicio){
        servicioSrv.agregarTipoServicio(tipoServicio);
    }
    public List<TipoServicio> listarTipoServicio(){
       return servicioSrv.listarTipoServicio();
    }
    public TipoServicio buscarTipoServicio(Integer idTipoServicio){
        return servicioSrv.buscarTipoServicio(idTipoServicio);
    }
    public void agregarTipoServicioServicio(TipoServicio servicio, Servicios servicios){
        servicioSrv.agregarTipoServicioServicio(servicio, servicios);
    }
    
    
}
