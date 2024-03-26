import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Pessoa> listaPessoas = new ArrayList<>();
        String[] nomes = {"Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
                "Breno Vinicius", "Vinícius Raphael",
                "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios",
                "Felipe dos Santos",
                "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva",
                "Henrique Cezar",
                "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
                "Marcus Paulo",
                "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe", "Nátali Isaltino",
                "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique",
                "Vinicius Garcia",
                "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira", "Caio Alves",
                "Lucas Marques",
                "Marcela Maria"};

        for (String nome : nomes) {
            listaPessoas.add(new Pessoa(nome));
        }

        for (Pessoa pessoa : listaPessoas){
            System.out.println(pessoa);

        }
    }
}
