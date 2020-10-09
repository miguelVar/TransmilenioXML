/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Dias;
import modelo.Horario;
import modelo.Troncales;
import modelo.Zonas;

/**
 *
 * @author migue
 */
public interface IDias {
    public void agregarDia (Dias dias);
    public List<Dias> listarDias();
    public Dias buscarDia(Integer idDia);
    public void agregarHorarioDia(Dias dias, Horario horario);
    
}
