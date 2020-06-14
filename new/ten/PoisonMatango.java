package ten;

public class PoisonMatango extends Matango{

  int poisonC = 5;

  public PoisonMatango(char surffix){
    super(surffix);
  }

  public void attack(Hero h){
    super.attack(h);
    if (poisonC > 0){
      System.out.println("毒の胞子をばらまいた！");
      int n = h.hp/5;
      h.hp -= n;
      System.out.println(n + "のダメージ！");
      poisonC -= 1;
      System.out.println("毒の胞子残り回数:" + poisonC + "回");
      
    }
  }
  
}