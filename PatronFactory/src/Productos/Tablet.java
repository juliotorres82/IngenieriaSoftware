/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import patronfactory.Productos;

/**
 *
 * @author seiya
 */
public class Tablet implements Productos{
    private String marca;
    private int memoriaInterna;
    private int tamanioRam;
    private String sistemaOperativo;

    public Tablet() {
    }

    public Tablet(String modelo, int memoriaInterna, int tamanioRam, String sistemaOperativo) {
        this.marca = modelo;
        this.memoriaInterna = memoriaInterna;
        this.tamanioRam = tamanioRam;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getModelo() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.marca = modelo;
    }

    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(int memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

    public int getTamanioRam() {
        return tamanioRam;
    }

    public void setTamanioRam(int tamanioRam) {
        this.tamanioRam = tamanioRam;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Tablet{" + "modelo= " + marca + ", memoriaInterna= " + memoriaInterna + "GB, tamanioRam= " + tamanioRam + "GB, sistemaOperativo= " + sistemaOperativo + '}';
    }
    
    
    
}
