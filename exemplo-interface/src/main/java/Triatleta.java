public class Triatleta implements Corredor, Nadador{
    private String nome;
    @Override
    public void correr() {
        System.out.println("Correndo...");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }

    public Triatleta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
