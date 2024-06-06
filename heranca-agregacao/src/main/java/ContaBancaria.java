public class ContaBancaria {
    protected String nomeCliente;
    protected Double saldo;
    protected Integer qtdOperacoesRealizadas;

    public ContaBancaria(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
        this.qtdOperacoesRealizadas = 0;
    }

    public void sacar(Double valorSaque){
        if (valorSaque > 0 && valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println("Saque Efetuado!");
        }
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getQtdOperacoesRealizadas() {
        return qtdOperacoesRealizadas;
    }

    public void setQtdOperacoesRealizadas(Integer qtdOperacoesRealizadas) {
        this.qtdOperacoesRealizadas = qtdOperacoesRealizadas;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Saldo: %.2f
                Quantidade Operações: %d""".formatted(nomeCliente, saldo, qtdOperacoesRealizadas);
    }
}
