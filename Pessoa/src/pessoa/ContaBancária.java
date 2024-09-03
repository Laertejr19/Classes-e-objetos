
package pessoa;


public class ContaBancária {
    String titular;
    int saldo = 0;
    int numero;
    public String getTitular(){
       return titular; 
    }
    public int getSaldo(){
        return saldo;
    }
    public int getDepositar(){
        return saldo + 20;
    }
    public int getSacar(){
        return saldo - 5;
    }
    public void setDepositar(){
        this.saldo = saldo;
    }
    public void setSacar(){
        this.saldo = saldo;
    }
    public void setSaldo(){
        this.saldo = saldo;
    }
    public void setTitular(){
        this.titular = titular;
    }
    
}

