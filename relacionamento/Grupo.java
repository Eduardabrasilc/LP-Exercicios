import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nomeGrupo;
    private List<Contato> contatos;

    public Grupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato c){
        contatos.add(c);
    }

    public void exibirContatos(){
        System.out.println("Contatos:\n");
        //for simplificado para visualização (.for)
        for (Contato contatoDaVez : contatos){
            System.out.println(contatoDaVez);
        }

        //for tradicional (.fori):
//        for (int i = 0; i < contatos.size(); i++){
//            Contato contatoDaVez = contatos.get(i);
//            System.out.println(contatoDaVez);
//        }
    }

    public Boolean existePorNome(String pesquisa){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(pesquisa)) {
                return true;
            }

            return false;
        }
    }

    public Contato buscaPorNome(String pesquisa){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(pesquisa)) {
                return contato;
            }

            return null;
        }
    }

    public void removeContato(Contato c){
        contatos.remove(c);
    }

    @Override
    public String toString() {
        return """
                Nome do Grupo: %s
                Lista de Contatos: %s
                """.formatted(nomeGrupo, contatos);
    }
}
