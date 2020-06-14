package sixt;

import java.util.*;

public class Main {
  public static void main(String[] args){
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    // List<Hero> heroes = new ArrayList<Hero>();
    // heroes.add(h1);
    // heroes.add(h2);
    // for (Hero i : heroes){
    //   System.out.println(i.getName());
    // }
    Map<Hero, Integer> ene = new HashMap<Hero, Integer>();
    ene.put(h1,3);
    ene.put(h2,7);
    for (Hero key : ene.keySet()){
      int val = ene.get(key);
      System.out.println(key.getName() + "の倒した数は" + val);
    }
  }
}