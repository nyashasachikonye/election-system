/*
Author: Kuziwa Sachikonye
Date: 21 March 2013
Program Title: B_node 3
Program Description: This is the class that contains all the 
 * necessary methods for the Binary Node as well as constructors
 */

public class BS_Tree {
    
    B_Node root;
    
    public BS_Tree()
    {
        root = null ;
    }
    
    BS_Tree(String rootItem ,int cand_numb)
	{
		root = new B_Node(rootItem ,cand_numb ) ;
	}

 public void insert(String e)
	{
		root = insert(e,root) ;
	}

 
 public B_Node insert( String x, B_Node t )
         
{ 
    
if( t == null )
{
    t = new B_Node( x );
}
if( x.compareTo( t.name ) < 0 )

    t.left = insert( x, t.left );

if( x.compareTo( t.name ) > 0 )

    t.right = insert( x, t.right );

    return t;

}
 
public B_Node find (String x, B_Node t)
	{
	while (t != null)
	{
		if (x.compareTo(t.name) < 0)
			t = t.left ;
		else if (x.compareTo(t.name) > 0)
			t = t.right ;
		else
			return t ; //match
	}
	return null ;   // not found
	}
public B_Node find(String s)
{	
	return find(s, root) ;
}

    public void printInOrder()
  {
      if (root != null)
      root.printInOrder();
  }

}