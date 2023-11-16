package list;

public class FilaKeila implements Fila{
    
    @Override
    public void enqueue(int item){

     lista.insereFim(item);


    }

    @Override
    public int dequeue(){
      int numero = lista.buscaIndice(0);
      lista.removeInicio();
      return numero;

    }

    @Override
    public boolean isEmpty(){
      return lista.isEmpty();

    }
      
    @Override
    public int size(){


    }
}