package src.linked;

public class ListaLigada {

    private Node init;
    private Node end;

    public void adicionar(int value){
        if(init == null){
            init = new Node(value);
            end = init;
        }else{            
            end.setNext(new Node(value));
            end = end.getNext();
        }
    }


    public void remocao(int value){
        if(init == null){
            if(value == init.getValue()){

            }
        }else{
            Node aux = init;
            while(aux.getNext() != null || value == aux.getValue()){
                aux = aux.getNext();
            }
        }
    }


    @Override
    public String toString() {
        if (init == null) return "[]";
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("[");
        Node aux = init;
        while(aux.getNext() != null){
            strBuilder.append(aux + " ");
            aux = aux.getNext();
        }        
        strBuilder.append(aux + "]");
        return strBuilder.toString();
    }

}
