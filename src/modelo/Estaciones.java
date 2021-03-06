package modelo;
// Generated 6/10/2020 07:46:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estaciones generated by hbm2java
 */
public class Estaciones  implements java.io.Serializable {


     private int idEstacion;
     private Zonas zonas;
     private String nombreEstacion;
     private Boolean portal;
     private Set recorridosHasServiciosesForEstacioneFin = new HashSet(0);
     private Set recorridosHasServiciosesForEstacionInicio = new HashSet(0);
     private Set rutases = new HashSet(0);

    public Estaciones() {
    }

	
    public Estaciones(int idEstacion, Zonas zonas, String nombreEstacion) {
        this.idEstacion = idEstacion;
        this.zonas = zonas;
        this.nombreEstacion = nombreEstacion;
    }
    public Estaciones(int idEstacion, Zonas zonas, String nombreEstacion, Boolean portal, Set recorridosHasServiciosesForEstacioneFin, Set recorridosHasServiciosesForEstacionInicio, Set rutases) {
       this.idEstacion = idEstacion;
       this.zonas = zonas;
       this.nombreEstacion = nombreEstacion;
       this.portal = portal;
       this.recorridosHasServiciosesForEstacioneFin = recorridosHasServiciosesForEstacioneFin;
       this.recorridosHasServiciosesForEstacionInicio = recorridosHasServiciosesForEstacionInicio;
       this.rutases = rutases;
    }
   
    public int getIdEstacion() {
        return this.idEstacion;
    }
    
    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }
    public Zonas getZonas() {
        return this.zonas;
    }
    
    public void setZonas(Zonas zonas) {
        this.zonas = zonas;
    }
    public String getNombreEstacion() {
        return this.nombreEstacion;
    }
    
    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }
    public Boolean getPortal() {
        return this.portal;
    }
    
    public void setPortal(Boolean portal) {
        this.portal = portal;
    }
    public Set getRecorridosHasServiciosesForEstacioneFin() {
        return this.recorridosHasServiciosesForEstacioneFin;
    }
    
    public void setRecorridosHasServiciosesForEstacioneFin(Set recorridosHasServiciosesForEstacioneFin) {
        this.recorridosHasServiciosesForEstacioneFin = recorridosHasServiciosesForEstacioneFin;
    }
    public Set getRecorridosHasServiciosesForEstacionInicio() {
        return this.recorridosHasServiciosesForEstacionInicio;
    }
    
    public void setRecorridosHasServiciosesForEstacionInicio(Set recorridosHasServiciosesForEstacionInicio) {
        this.recorridosHasServiciosesForEstacionInicio = recorridosHasServiciosesForEstacionInicio;
    }
    public Set getRutases() {
        return this.rutases;
    }
    
    public void setRutases(Set rutases) {
        this.rutases = rutases;
    }




}


