public class Teste {
    public static void main(String[] args) {
        ContaBancaria contaBancaria01 = new ContaBancaria("Bob da Silva");
        ContaPoupanca contaPoupanca01 = new ContaPoupanca("Xampson", 0.5);
        ContaCorrente contaCorrente01 = new ContaCorrente("Manoel", 5.000);

        Banco banco01 = new Banco("Sptech Bank");
        banco01.cadastrarConta(contaBancaria01);
        banco01.cadastrarConta(contaPoupanca01);
        banco01.cadastrarConta(contaCorrente01);


        banco01.exibirSomenteContasPoupanca();
    }
}
