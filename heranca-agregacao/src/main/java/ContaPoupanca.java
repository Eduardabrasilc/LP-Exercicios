public class ContaPoupanca extends ContaBancaria{
    private Double taxaRendimento;


    public ContaPoupanca(String nomeCliente, Double taxaRendimento) {
        super(nomeCliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void calcularValorRendimento(){
        Double valorRendimento = saldo * taxaRendimento;
        saldo += valorRendimento;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString() {
        return  """
                %s
                Taxa de rendimento: %.2f
                """
                .formatted(super.toString(), taxaRendimento);
    }
}
