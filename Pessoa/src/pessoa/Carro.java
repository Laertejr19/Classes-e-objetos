
package pessoa;


public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidade;
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public int getAceleração(){
        return velocidade + 100;
    }
    public int getDesaceleração(){
        return velocidade - 20;
    }
}
