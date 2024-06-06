public class AlunoPos extends Aluno {


    //Super = ta chamando os atributos da super classe para esta nova classe;
//    public AlunoPos(String nome, Double notaAtividade, Double notaAvaliacao) {
//        super(nome, notaAtividade, notaAvaliacao);

    private Double notaTcc;

    public Double getNotaTcc() {
        return notaTcc;
    }

    public Double calcularNotaFinal(){
        return 0.0;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    public AlunoPos(String nome, Double notaAtividade, Double notaAvaliacao, Double notaTcc) {
        super(nome, notaAtividade, notaAvaliacao);
        this.notaTcc = notaTcc;
    }

    @Override
    public String toString() {
        return "AlunoPos{" +
                "notaTcc=" + notaTcc +
                "} " + super.toString();
    }
}

