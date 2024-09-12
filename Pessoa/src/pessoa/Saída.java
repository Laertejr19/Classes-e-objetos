
package pessoa;


public class Saída {
    public static void main(String[] args) {
        Livro l = new Livro();
        Pessoa p = new Pessoa();
        ContaBancária c = new ContaBancária();
        Carro ca = new Carro();
        Retângulo R = new Retângulo();
        Contador co = new Contador();
        Estudante e = new Estudante();
        System.out.println(p.getNome());
         System.out.println(p.getProfissão());
          System.out.println(p.getIdade());
          System.out.println("Seu saldo atual é: " + c.getSaldo());
          System.out.println("Essa é a simulação de uma depositação: " + c.getDepositar());
          System.out.println("Essa é a simulação de um saque: " + c.getSacar());
          System.out.println("agora seu saldo é: " + c.getSaldo());
          System.out.println("Sua velocidade atual é: " + ca.velocidade);
          System.out.println("Aceleração: " + ca.getAceleração());
          System.out.println("Desacelerando: " + ca.getDesaceleração());
          System.out.println("Você tem: " + l.exemplares + " exemplares");
          System.out.println("Emprestando tem: " + l.getEmprestar());
           System.out.println("Devolvendo tem: " + l.getDevolver());
           System.out.println("Sua area do retângulo é: " + R.getArea());
           System.out.println("Seu perimetro é: " + R.getPerímetro());
           System.out.println(e.lista);
          System.out.println(e.AdicionarDisc());
    }
}
