package collections;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Brasil","Brasília");
        capitais.put("Israel","Tel Aviv");
        capitais.put("Argentina","Buenos Aires");

        System.out.println(capitais.get("Brasil"));

        if(capitais.containsKey("Israel")){
            System.out.println("A capital de Israel está no HashMap");
        }

        if(capitais.containsValue("Tel Aviv")){
            System.out.println("O país de Tel Aviv está no HashMap");
        }

        for(String elem : capitais.keySet()){
            System.out.println(elem + " - " + capitais.get(elem));
        }
    }
}
