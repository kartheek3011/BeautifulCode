# BeautifulCode
The Binary Tree validation .

The 2 classes are written so that each perfomrs better in different situations .

	1.The first class BinaryTree is used when there is a constraint on the memory .
	This is difficult to implement on threaded or distributed environment.

	2.The second class BinaryTreeforDistributedComputing is used when 
	there is no constraint on the memory usage .
	Having the capability of being used in the multithreaded or distributed environment .
	
	If the distributed environment is considered , then the master slave can be considered 
	where the master computes the Inorder Traversal array and then, it manipulates 
	the other nodes which carry out the validation of the Binary Tree if its a Binary Search Tree.


*****************************************************************
NOTE:
Each Class contains 2 different methods Iterative and Recursive .

ITERATIVE:Most Efficient.
	Iterative is used when the stackframes are considered to be larger than 
the generic data type that will be implemented further in terms of data usage. 
Usually the stackframes are considered to be huge when compared to the data types.
For instance , the int when used as data .
	Advantages:
	1.Efficient in memory usage.

RECURSIVE:Not highly Efficient.
	Recursive is used when the stackframes are considered to be smaller than 
the generic data type that will be implemented further in terms of data usage. 

	Advantages :
	1.Readability


*****************************************************************
TODO LIST:

1.The data in the Node class can be made generic in both classes.
2.The comparePresentToPrev method can be made to work with generic data type.
3.The validation method i.e. ValidationOnBTree functionality can be extended 
  to work with the threaded or distributed environment .

