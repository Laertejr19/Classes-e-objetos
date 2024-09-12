
package pessoa;
//Crie uma classe chamada Retangulo com os atributos: largura e altura.
//Implemente métodos para calcular a área e o perímetro do retângulo. 
//Crie um objeto Retangulo, faça os cálculos e exiba os resultados.
public class Retângulo {
    int largura;
    int altura;
    int lados = 4;
    
    public int getArea(){
        return largura * altura;
    }
    public int getPerímetro(){
        return lados;
    }
}
