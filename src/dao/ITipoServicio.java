/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Dias;
import modelo.Horario;
import modelo.Servicios;
import modelo.TipoServicio;
import modelo.Troncales;
import modelo.Zonas;

/**
 *
 * @author migue
 */
public interface ITipoServicio {
    public void agregarTipoServicio (TipoServicio tipoServicio);
    public List<TipoServicio> listarTipoServicio();
    public TipoServicio buscarTipoServicio(Integer idTipoServicio);
    public void agregarTipoServicioServicio(TipoServicio servicio, Servicios servicios);
    
}
