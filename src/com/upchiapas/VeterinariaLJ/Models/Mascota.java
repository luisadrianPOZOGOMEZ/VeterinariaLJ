package com.upchiapas.VeterinariaLJ.Models;

public class Mascota {
    private String nombre, tipo;
    private int folio;
    private int precio;
    private String diagnostico;
    private int dia,mes,anio;
    private int preci;


    public Mascota(String nombre, String tipo, int folio,int dia,int mes,int anio,int preci) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.folio = folio;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.preci=preci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }


    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getPreci(){
        return preci;
    }
    public void setPreci(int preci){
        this.preci=preci;
    }
}
