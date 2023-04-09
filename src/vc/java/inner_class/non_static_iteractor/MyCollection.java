package vc.java.inner_class.non_static_iteractor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollection {
    private List<String> list=new ArrayList<>();

    public Iterator<String> iterator(){
        return new MyIterator();
    }

    public void add(String item) {
        list.add(item);
    }

    public class MyIterator implements Iterator<String> {
        private int currentIndex=0;

        @Override
        public boolean hasNext() {
            return currentIndex<list.size();
        }

        @Override
        public String next() {
            return list.get(currentIndex++);
        }
    }

}
