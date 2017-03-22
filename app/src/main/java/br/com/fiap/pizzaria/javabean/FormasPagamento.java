package br.com.fiap.pizzaria.javabean;

public class FormasPagamento {
    private int codigo;
    private String descricao;
    private int qtdVezes;

    public FormasPagamento(int codigo, String descricao, int qtdVezes) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdVezes = qtdVezes;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdVezes() {
        return qtdVezes;
    }

    public void setQtdVezes(int qtdVezes) {
        this.qtdVezes = qtdVezes;
    }
}
