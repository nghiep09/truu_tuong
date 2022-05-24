package QL_Khach_Tro;

import java.util.Comparator;

public class SortbyAge implements Comparator<Nguoi> {
    @Override
    public int compare(Nguoi o1, Nguoi o2){
        if(o1.getAge()>o2.getAge()){
            return 1;
        }else {
            return -1;
        }
    }
}
