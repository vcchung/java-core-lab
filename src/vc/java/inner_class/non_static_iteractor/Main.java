package vc.java.inner_class.non_static_iteractor;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        MyCollection collection=new MyCollection();
        collection.add("Vincent");
        collection.add("Chung");
        Iterator<String> it= collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
