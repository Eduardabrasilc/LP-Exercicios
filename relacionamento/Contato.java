public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    //ordem dos fatores:
    // 1 - atributos
    // 2- Construtor
    // 3 - Métodos
    // 4 - Métodos get/set
    // 5 - Método toString()


    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }

    public Contato() {
    }

    public void bloquear() {
        bloqueado = true;
    }

    public void desbloquear() {
        bloqueado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Telefone: %s
                Bloqueado: %s
                """.formatted(nome, telefone, (bloqueado ? "Sim" : "Não"));7
    }
}
