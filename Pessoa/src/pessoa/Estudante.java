//Crie uma classe chamada Estudante com os atributos: nome, idade e lista de disciplinas matriculadas.
//Implemente um método para adicionar disciplinas à lista e outro para exibir as disciplinas matriculadas. 
//Crie um objeto Estudante, realize algumas matrículas e exiba a lista de disciplinas.

package pessoa;

import java.util.ArrayList;


public class Estudante {
    String nome;
    int idade;
    ArrayList <String> lista = new ArrayList<>();
  
    public boolean AdicionarDisc(){
        return lista.add("Disciplina 2");
    }
   
}
