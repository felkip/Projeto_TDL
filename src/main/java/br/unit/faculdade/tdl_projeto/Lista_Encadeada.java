package br.unit.faculdade.tdl_projeto;

public class Lista_Encadeada {
    private Tarefa inicio;
    private Tarefa fim;
    int contadorID =1;
    
    public Lista_Encadeada(){
        this.inicio = null;
        this.fim = null;
    }
    
    public void adicionarTarefa(String descricao,int prioridade){
        Tarefa nova = new Tarefa(descricao,contadorID++,prioridade);
        
       if (inicio == null){
           inicio = nova;
           fim = nova;
       } else{
           nova.setAnterior(fim); 
           fim.setProximo(nova);
           fim = nova;
       }
        
    }
    
    public boolean removerTarefa(String descricao){
        Tarefa atual = inicio;
        
        while (atual != null){
            if(atual.getDescricao().equals(descricao)){
                if (atual.getAnterior() != null){
                    atual.getAnterior().setProximo(atual.getProximo());
                } else{
                    inicio = atual.getProximo();
                }
                return true;
            }
            atual= atual.getProximo();
        }
        return false;
    }
    
    public void exibirTarefas(){
        Tarefa atual = inicio;
        while(atual != null){
            System.out.println(atual);
            atual = atual.getProximo();
        }
    }
    
    public void exibirTarefas_Reverso(){
        Tarefa atual = fim;
        while(atual != null){
            System.out.println(atual);
            atual = atual.getAnterior();
        }
    }
    
    public void listarTarefasPendentes() {
        Tarefa atual = inicio;
        while (atual != null) {
            if (!atual.isConcluida()) {
                System.out.println(atual);
            }
            atual = atual.getProximo();
        }
    }
    
    public boolean editarTarefas(int idTarefa,String novaDescricao,int novaPrioridade){
         Tarefa atual = inicio;
         while(atual != null){
             if (atual.getIdTarefa() == idTarefa) {
                atual.setDescricao(novaDescricao);
                atual.setPrioridade(novaPrioridade);
                return true;
             }  
            atual = atual.getProximo();
            
        }
        return false;
    }  
    
    public Tarefa buscarTarefaEspecifica(int idTarefa) {
        Tarefa atual = inicio;
        while (atual != null) {
            if (atual.getIdTarefa() == idTarefa) {
                return atual;
            }
            atual = atual.getProximo();
        }
        return null;
    }
    
}

