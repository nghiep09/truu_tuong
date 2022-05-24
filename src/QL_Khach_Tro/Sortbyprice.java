package QL_Khach_Tro;

import java.util.Comparator;

public class Sortbyprice implements Comparator<Hotell> {
    @Override
    public int compare(Hotell o1, Hotell o2){
        if(o1.getRoomRates()>o2.getRoomRates()){
            return 1;
        }else {
            return -1;
        }
    }

}
