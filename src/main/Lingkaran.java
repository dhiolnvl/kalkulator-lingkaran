/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


/**
 *
 * @author ASUS
 */
public class Lingkaran {
    
    private double diameter;
    private double jari;
    private double luas;
    private double keliling;
    private double hasil;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }
    
    public double diameter() {
        if(diameter <= 0) {
            throw new ArithmeticException("Input Dengan Benar !");
        }
        jari = diameter / 2; 
        return jari;
    }
    
    public double jari() {
        if(jari <= 0) {
            throw new ArithmeticException("Input Dengan Benar !");
        }
        diameter = jari * 2; 
        return diameter;
    }
    
    public double luas() {
        
        hasil = 3.14 * jari * jari; 
        return hasil;
    }
    
    public double keliling() {
        
        hasil = 2 * 3.14 * jari; 
        return hasil;
    }
}
