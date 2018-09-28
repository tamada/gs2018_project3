package gseminar;

import java.util.List;
import java.util.ArrayList;

public class FibonacciSeries{
    private List<Integer> list = new ArrayList<>();

    public FibonacciSeries(){
        list.add(1);
        list.add(1);
    }

    public int index(int index){
        if(list.size() < index){
            updateList(index);
        }
        return list.get(index - 1);
    }

    private void updateList(int index){
        for(int i = list.size(); i < index; i++){
            list.add(list.get(i - 1) + list.get(i - 2));
        }
    }
}
