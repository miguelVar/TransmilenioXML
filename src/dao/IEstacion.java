/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Estaciones;
import modelo.Troncales;
import modelo.Zonas;

/**
 *
 * @author migue
 */
public interface IEstacion {
    public void agregarEstacion(Estaciones estaciones);
    public List<Estaciones> listarEstaciones();
    public Estaciones buscarEstacion (Integer idEstacion);
    public void agregarEstacionZona(Estaciones estaciones, Zonas zonas);
    
}
