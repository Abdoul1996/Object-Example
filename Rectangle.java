//RECTANGLE OBJECT CREATOR

class Rectangle
{
   //ATTRIBUTES
   int length;
   int width;
   
   public Rectangle() //Default Constructor
   {
   
   }
   public Rectangle(int length,int width) //Constructor with 2 parameters for length/width
   {
      this.length = length; //this refers to the length in this class
      this.width = width;
   }
   
   public void setLength(int newLength) //Method to set length
   {
      length = newLength; //could of used 'this.length = length' and called 'newLength' 'length'
   }
   
   public void setWidth(int newWidth) //Method to set width
   {
      width = newWidth;
   }
   
   public int getLength() //Get the length and return the int to main class
   {
      return length;
   }
   
   public int getWidth() //Get the width and return the int to main class
   {
      return width;
   }
   
   public String toString() //Allows object to be printed instead of memory address and returns String below
   { 
      return "Your rectangle has a length of " + length + " and a width of " + width;
   }
}