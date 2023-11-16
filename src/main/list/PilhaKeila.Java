package list;

import linked.ListaLigada;

public class PilhaKeila implements Pilha{
    @Override
    public boolean isEmpty(){

     return l.buscaIndice(0) == -1;

    }
     
    @Override
    public void push(int item){
        l.insereInicio(item);
    }
    
    @Override
    public int pop(){
        n = l.buscaIndice(0);
        l.removeInicio();
        return n;
    }

}
     