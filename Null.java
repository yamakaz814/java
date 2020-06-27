public class Null {
  public static void main(String[] args){
    String [] items = new String[3];
    items[1] = "1";
    items[2] = "2";
    for (int i = 0; i < items.length;i++){
      System.out.println(items[i]);
    }
    // Item[] items = new Item[3];
    // items[1] = new Item("A");
    // items[2] = new Item("B");
    // for (int i = 0; i < items.length;i++){
    //   System.out.println(items[i]);
    // }
    // for (Item item : items){
    //   System.out.print(item.name);
    // }
  }
}

class Item{
  String name;
  public Item(String name){
    this.name = name;
  }
}