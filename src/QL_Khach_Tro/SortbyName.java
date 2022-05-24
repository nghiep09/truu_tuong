package QL_Khach_Tro;

import java.util.Comparator;

public class SortbyName implements Comparator<Nguoi> {
    @Override
    public int compare(Nguoi o1, Nguoi o2){
        if(o1.getName().compareTo(o2.getName())>0){
            return 1;
        } else {
            return -1;
        }
    }
}
