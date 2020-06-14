package ten;

public class Main {
  public static void main(String[] args){
    PoisonMatango pm = new PoisonMatango('A');
    Hero h = new Hero();
    pm.attack(h);
    System.out.println(h.hp);
    pm.attack(h);
    System.out.println(h.hp);
    pm.attack(h);
    System.out.println(h.hp);
  }
}