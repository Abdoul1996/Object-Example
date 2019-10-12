//MAIN CLASS/METHOD

public class Runner
{
   public static void main(String[] args)
   {
      Rectangle box1 = new Rectangle(3,6); //create object box1
      Rectangle box2 = new Rectangle(27,23);
      Rectangle box3 = new Rectangle(332,6325);
      Rectangle box4 = new Rectangle(4,2);
      Rectangle box5 = new Rectangle(6123,21);
      
      System.out.println(box1); //compiler writes here box1.toString()
      System.out.println(box2);
      System.out.println(box3);
      System.out.println(box4);
      System.out.println(box5);
      
      System.out.println(box2.getLength()); //calls getLength() method and pulls int
      System.out.println(box4.getLength());
      
      System.out.println(box2.getWidth()); //calls getWidth() method and pulls int
      System.out.println(box4.getWidth());
      
      //setting length/width printing and using get methods to verify that it has been set
      System.out.println(box1);
      box1.setLength(2);
      System.out.println(box1);
      box1.setWidth(17);
      System.out.println(box1);
      System.out.println(box1.getWidth());
      System.out.println(box1.getLength());
   }
}