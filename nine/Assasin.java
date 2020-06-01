package nine;

public class Assasin extends Thief {
  
 public Assasin(){
   super("アサシン");
 }  
@Override
 public void steal(){
   System.out.println(name + "のぶんどる！");
 }
}