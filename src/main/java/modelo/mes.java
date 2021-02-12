/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author manue
 */
public class Calendario {
    private String mes;
    private ArrayList<String> dia;

    public Calendario() {
    }

    public Calendario(String mes, ArrayList<String> dia) {
        this.mes = mes;
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public ArrayList<String> getDia() {
        return dia;
    }

    public void setDia(ArrayList<String> dia) {
        this.dia = dia;
    }
    
}
