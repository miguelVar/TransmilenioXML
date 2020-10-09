/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Troncales;
import modelo.Zonas;

/**
 *
 * @author migue
 */
public interface ITtroncal {
    public void agregarTroncal(Troncales troncales);
    public List<Troncales> listarTroncales();
    public Troncales buscarTroncal(Integer idTroncal);
    public void agregarTroncalZona(Troncales troncales, Zonas zonas);
    
}
