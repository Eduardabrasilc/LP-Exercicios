public class Velocista implements Corredor{
    private String nome;

    @Override
    public void correr() {
        System.out.println("Correndo...");

    }

    public Velocista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
