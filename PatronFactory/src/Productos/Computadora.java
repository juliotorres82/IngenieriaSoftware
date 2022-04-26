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
public class Computadora implements Productos{
    private String marca;
    private String procesador;
    private int tamanioRam;
    private String sistemaOperativo;

    public Computadora() {
    }

    public Computadora(String marca, String procesador, int tamanioRam, String sistemaOperativo) {
        this.marca = marca;
        this.procesador = procesador;
        this.tamanioRam = tamanioRam;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
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
        return "Computadora{" + "marca= " + marca + ", procesador= " + procesador + ", tamanioRam= " + tamanioRam + "GB, sistemaOperativo= " + sistemaOperativo + '}';
    }
    
    
}
