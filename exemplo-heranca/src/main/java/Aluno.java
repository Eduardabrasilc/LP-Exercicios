
public class Aluno {

    private String nome;
    private Double notaAtividade;
    private Double notaAvaliacao;

    public Aluno(String nome, Double notaAtividade, Double notaAvaliacao) {
        this.nome = nome;
        this.notaAtividade = notaAtividade;
        this.notaAvaliacao = notaAvaliacao;
    }



    public Double calcularNotaFinal() {
        return (this.notaAtividade * 0.4) + (this.notaAvaliacao * 0.6);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaAtividade() {
        return notaAtividade;
    }

    public void setNotaAtividade(Double notaAtividade) {
        this.notaAtividade = notaAtividade;
    }

    public Double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(Double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }k

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", notaAtividade=" + notaAtividade +
                ", notaAvaliacao=" + notaAvaliacao +
                ", notaFinal=" + this.calcularNotaFinal() +
                '}';
    }
}

public class Produto {
    private String nome;
    private Double preco;
    private Double pesoKg;
    private Boolean fragil;
    private String categoria;

    // Construtor completo
    public Produto(String nome, Double preco, Double pesoKg, Boolean fragil, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.pesoKg = pesoKg;
        this.fragil = fragil;
        this.categoria = categoria;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Boolean getFragil() {
        return fragil;
    }

    public void setFragil(Boolean fragil) {
        this.fragil = fragil;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método para calcular o frete
    public Double calcularFrete() {
        Double frete = 0.1 * pesoKg; // 10% do peso
        if (fragil) {
            frete *= 2; // Dobrar o frete se for frágil
        }
        return frete;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String nomeCliente;
    private List<Produto> produtos;

    // Construtor
    public Compra(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.produtos = new ArrayList<>();
    }

    // Getters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    // Métodos para adicionar e remover produtos
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int indice) {
        if (indice >= 0 && indice < produtos.size()) {
            produtos.remove(indice);
        }
    }

    // Métodos de busca
    public Produto getProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null; // Retornar null se o produto não for encontrado
    }

    public List<Produto> getProdutosPorCategoria(String categoria) {
        List<Produto> produtosCategoria = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(categoria)) {
                produtosCategoria.add(produto);
            }
        }
        return produtosCategoria; // Retornar lista vazia se não houver produtos na categoria
    }

    // Métodos para obter quantidades de produtos
    public int getQuantidadeProdutos() {
        return produtos.size();
    }

    public int getQuantidadeProdutosFrageis() {
        int quantidadeFrageis = 0;
        for (Produto produto : produtos) {
            if (produto.getFragil()) {
                quantidadeFrageis++;
            }
        }
        return quantidadeFrageis;
    }

    // Métodos para calcular valores totais
    public Double calcularTotalFrete() {
        Double totalFrete = 0.0;
        for (Produto produto : produtos) {
            totalFrete += produto.calcularFrete();
        }
        return totalFrete;
    }

    public Double calcularTotalProdutos() {
        Double totalProdutos = 0.0;
        for (Produto produto : produtos) {
            totalProdutos += produto.getPreco();
        }
        return totalProdutos;
    }

    public Double calcularTotalCompra() {
        Double totalCompra = calcularTotalProdutos() + calcularTotalFrete();
        return totalCompra;
    }
}

