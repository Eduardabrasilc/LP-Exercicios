import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nomeBanco;
    private List<ContaBancaria> contas;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.contas = new ArrayList<>();
    }

    public void cadastrarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public void exibirContas(){
        for (ContaBancaria contaDaVez: contas){
            System.out.println(contaDaVez);
        }
    }

    public void exibirSomenteContasPoupanca(){
        for (ContaBancaria contaDaVez: contas) {
            if (contaDaVez instanceof ContaPoupanca) {
                System.out.println(contaDaVez);
            }
    }
}

 
public Double somarChequeEspecial(){
        Double total = 0.0;
        for (ContaBancaria conta : this.contas) {
            if (conta instanceof ContaCorrente){
                total += ((ContaCorrente) conta).getLimiteChequeEspecial();
            }
        }

        return total;
    }
}
