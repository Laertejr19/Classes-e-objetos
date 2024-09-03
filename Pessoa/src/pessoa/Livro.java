
package pessoa;


public class Livro {
    String título;
    String autor;
    String paginas;
    int exemplares = 1;
    
    public int getExemplares(){
     return exemplares;
    }
    public int getEmprestar(){
        return exemplares - 1;
    }
    public int getDevolver(){
        return exemplares + 1;
    }
}
