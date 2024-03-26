import java.util.Random;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return " nome=" + nome +
                ", idade=" + idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
