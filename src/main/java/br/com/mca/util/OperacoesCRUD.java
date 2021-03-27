package br.com.mca.util;


public enum OperacoesCRUD {
    NOVO(1), EDITAR(2), EXCLUIR(3);
    
    private final  Integer operacao;

    private OperacoesCRUD(Integer operacao) {
        this.operacao = operacao;
    }

    public Integer getOperacao() {
        return operacao;
    }
    
    
}
