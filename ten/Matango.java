package ten;

public class Matango {
  int hp = 50;
  char surffix;
  
  public Matango(char surffix){
    this.surffix = surffix;
  }
  public void attack(Hero h){
    System.out.println("きのこ"+this.surffix +"の攻撃！");
    System.out.println("10のダメージ");
    h.hp -= 10;
  }
  
}