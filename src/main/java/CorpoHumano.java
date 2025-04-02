package main.java;
 
public class CorpoHumano {
   
    private double massa;
    private double volume;
    private double densidade;
    private double altura;
 
   //Construtor
    public CorpoHumano(double massa, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }
 
    // Métodos Getters
    public double getMassa() {
        return massa;
    }
 
    public double getVolume() {
        return volume;
    }
 
    public double getDensidade() {
        return densidade;
    }
 
    public double getAltura() {
        return altura;
    }
 
    // MétodOs Setter
    public void setMassa(double massa) {
        this.massa = massa;
    }
 
    public void setVolume(double volume) {
        this.volume = volume;
    }
 
    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }
 
    public void setAltura(double altura) {
        this.altura = altura;
    }
 
   
    public double IMC() {
        return massa / (altura * altura);
    }
}
