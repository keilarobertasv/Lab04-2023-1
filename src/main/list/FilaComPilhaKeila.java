package list;

public class FilaComPilhaKeila implements FilaComPilha{

    public void FilaComPilhaKeila(){

    
    private PilhaKeila um;
    private PilhaKeila dois;
    }


    @Override
    public void enqueue(int item) {
        um.push(item);
    }

    @Override
    public int dequeue() {
       if(dois.isEmpty()){
         while(!um.isEmpty()){
            int n = um.pop();
            dois.push(n)
         }
         return dois.pop();
       }
       return 1;
    }

    @Override
    public boolean isEmpty() {
       if(um.isEmpty() || dois.isEmpty()){
        return true;
       }
       return false;
    }

    @Override
    public int size() {
        return 1;
    }

}