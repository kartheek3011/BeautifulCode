import java.util.*;

/*Author : Kartheek
  Program to check if the given input Binary tree is a valid Binary Search Tree on a distributed or threaded environment.
*/


/*
	Class useful in creating an object or instance of Node class. 
*/
class Node 
{
	int data ;                            //data can be made generic 
	Node left , right ;

	public Node(int inputValue)
	{
		data = inputValue;
		left = right = null;
	}
}

/*
	Class useful in creating an object or instance of Binary Tree class.
	It validates if the given binary tree is valid Binary Search Tree. 
*/
class BinaryTree
{
  Node root;
  Node prev = null;
    
	/*
		This is an Recursive method that validates the binary tree if its a Binary Search Tree.
	*/
	boolean checkIfValidBSTRec(Node presentNode)
	{
		if (presentNode)
		{
			if (!checkIfValidBSTRec(presentNode.left) )
				return false;

			if (prev ! = null && !comparePresentToPrev(presentNode) )    
				return false;

			prev = presentNode ;

			return checkIfValidBSTRec(presentNode.right);
		}		

		return true;
	}

	/*
		This is an Iterative method that validates the binary tree if its a Binary Search Tree.
	*/
	boolean checkIfValidBSTIt(Node presentNode)
	{
		private Stack<Node> tempstack = new Stack<Node>(10) ;

		while(presentNode ! = null)
    	{
    		tempstack.push(presentNode) ;
    		presentNode = presentNode.left ;
		}

	    while (!tempstack.empty())
    	{
    		presentNode = tempstack.pop();
    		if (prev ! = null && !comparePresentToPrev(presentNode) )
    			return false ;

    		prev = presentNode ;

    		if (presentNode.right != null)
    			presentNode = presentNode.right ;

    		while (presentNode ! = null)
    		{
    			tempstack.push(presentNode) ;
    			presentNode = presentNode.left ;
    		}
    	}

    	return true ;	

		
	}

	/*
		This checks the present and previous Node data . 
	*/
	boolean comparePresentToPrev(Node present)
	{
		return present.data >= prev.data ? 1: 0 ;
	}


}
