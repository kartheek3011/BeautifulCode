import java.util.*;

/*Author : Kartheek
  Program to check if the given input Binary tree is a valid Binary Search Tree on a distributed or threaded environment.
*/


/*
	Class useful in creating an object or instance of Node class. 
*/
class Node 
{
	int value ;                            
	Node left , right ;

	public Node(int inputValue)
	{
		value = inputValue;
		left  = right = null;
	}
}


/*
	Class useful in creating an object or instance of Binary Tree class.
	It validates if the given binary tree is valid Binary Search Tree. 
*/
class BinaryTreeforDistributedComputing
{
	Node root;
	List<Integer> BTreeInfixNotation = new ArrayList<Integer>(10);

	
	void bTreeToInOrdRec(void)
	{
		bTreeToInOrdRec(root);
	}

	/*
		This is an Recursive method that converts the binary tree to Inorder Traversal Array .
	*/
	void bTreeToInOrdRec (Node presentNode)
	{
		if (presentNode.left ! = null)
			bTreeToInOrdRec(presentNode.left);

		BTreeInfixNotation.add(presentNode.value);

		if (presentNode.right ! = null)
			bTreeToInOrdRec(presentNode.right);

		return ;
	}

	/*
		This is an Iterative method that converts the binary tree to Inorder Traversal Array .
	*/
	void bTreeToInOrdIter (void)
	{
	    	private Stack<Node> tempstack = new Stack<Node>(10) ;
	    	Node presentNode = root ;

	    	while(presentNode ! = null)
	    	{
	    		tempstack.push(presentNode) ;
	    		presentNode = presentNode.left ;
	    	}

	    	while (!tempstack.empty())
	    	{
	    		presentNode = tempstack.pop();
	    		BTreeInfixNotation.add(node.value) ;

	    		if (presentNode.right != null)
	    			presentNode = presentNode.right ;

	    		while (presentNode ! = null)
	    		{
	    			tempstack.push(presentNode) ;
	    			presentNode = presentNode.left ;
	    		}
	    	}
	    return ;	
	}


	/*
	  This method is used in to validate the serialised binary tree data as of here , the inorder traversal array. 
	  This can be extended to multithreaded so that it could be processed easily and efficiently .
	*/
	boolean ValidationOnBTree (void)
	{
		int counter ;

		for (counter = 0 ; counter < BTreeInfixNotation.size() -1 ; ++counter)
			if BTreeInfixNotation.get(counter) > BTreeInfixNotation.get(counter+1)
				return false;

		return true;	
	}



}
