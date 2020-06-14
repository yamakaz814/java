package nine;

public class Main {
  public static void main(String[] args){

    // Thief thf = new Thief("シーフ",120,150);
    // System.out.println(thf.name + thf.hp + thf.mp );
    // thf.steal();
    
    // Assasin asa = new Assasin();
    // System.out.println("名前" + asa.name );
    // System.out.println("HP" + asa.hp);
    // System.out.println("MP" + asa.mp);
    // asa.steal();

    // Ninja nin = new Ninja();
    // nin.steal();

    int baseHP = 25;
    Thief t = new Thief("アサカ",baseHP);
    System.out.println(baseHP + ":" + t.hp);

    heal(baseHP);
    heal(t);
    System.out.println(baseHP + ":" + t.hp);

    
  }
      public static void heal(int hp){
        hp += 10;
      }
      public static void heal(Thief thief){
        thief.hp += 10;
      }
}