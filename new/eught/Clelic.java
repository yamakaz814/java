package eught;

public class Clelic {
  String name;
  int HP = 50;
  final int maxHP = 50;
  int MP= 10;
  final int maxMP = 10;
  
  public void selfAid(){
    this.MP -= 5;
    this.HP = this.maxHP;
  }

  public int pray(int second){
    int n = new java.util.Random().nextInt(3) - 1;
    int cure = second + n;
    return cure ;
  }
}
