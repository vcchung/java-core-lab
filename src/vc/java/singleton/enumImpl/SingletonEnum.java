package vc.java.singleton.enumImpl;

import java.util.HashMap;
import java.util.Map;

public enum SingletonEnum {
    INSTANCE;
    private Map<String,String> state=new HashMap<String, String>();
    public void doSomething(){
        System.out.println(state);
    }

}
