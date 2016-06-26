/*
Author: Kuziwa Sachikonye
Date: 21 March 2013
Program Title: B_node 3
Program Description: This is the class that contains all the 
 * necessary methods for the Binary Node as well as constructors
 */

public class B_Node {
    
    B_Node root , left ,right;
    String name;
    int c_num;
    int faculty1;
    int faculty2;
    int faculty3;
    int faculty4;
    int Total;
    
    B_Node(String n, int c_numbr)
    {
     name = n;
     c_num = c_numbr;
     faculty1 = 0;
     faculty2 = 0;
     faculty3 = 0;
     faculty4 = 0;
     Total = 0;
    }
    
    B_Node(String nm)
    {name = nm;}
    
          public int compareTo(B_Node k)
      {
      
          if (Total > k.Total)
          return -1;
          
          if (Total < k.Total)
              return +1;
          
          return 0;
      }
    
    public void setVotes(int faculty)
    {
        switch(faculty){
            
            case 1:
                faculty1 += 1;
                Total = faculty1 + faculty2 + faculty3 + faculty4;
                break;
            case 2:
                faculty2 += 1;
                Total = faculty1 + faculty2 + faculty3 + faculty4;
                break;
            case 3:
                faculty3 += 1;
                Total = faculty1 + faculty2 + faculty3 + faculty4;
                break;
            case 4:
                faculty4 += 1;
                Total = faculty1 + faculty2 + faculty3 + faculty4;
                break;
                
        }

        
    }
    
      public void printInOrder()
  {
  if(right != null){
      System.out.print("(");
        right.printInOrder();
  }
  System.out.print( root );
  if (left != null){
      left.printInOrder();
      System.out.print(")");
              }
  }
  
   
}
