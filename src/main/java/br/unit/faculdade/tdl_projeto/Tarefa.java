package br.unit.faculdade.tdl_projeto;


public class Tarefa {
    private String descricao;
    private int idTarefa;
    private boolean concluida;
    private int prioridade;
     private Tarefa proximo;
     private Tarefa anterior;

    public Tarefa(String descricao, int idTarefa, int prioridade) {
        this.descricao = descricao;
        this.idTarefa = idTarefa;
        this.prioridade = prioridade;
        this.concluida = false;
        this.proximo = null;
        this.anterior = null;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public boolean isConcluida() {
        return concluida;
    }    
    
    public int getPrioridade() {
        return prioridade;
    }

    public Tarefa getProximo() {
        return proximo;
    }

    public Tarefa getAnterior() {
        return anterior;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void setProximo(Tarefa proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(Tarefa anterior) {
        this.anterior = anterior;
    }
     
    @Override
    public String toString() {
        return "Tarefa: " + descricao + " (ID: " + idTarefa + ", Prioridade: " + prioridade + ")";
    }
    
}
