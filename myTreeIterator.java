package Lab5;
import Lab5.BinarySearchTree.Node;

// Written by Colby Cormier
public class myTreeIterator implements ITreeIterator 
{

  	// Publicly accessible SequenceArray method
	public int[] SequenceArray(BinarySearchTree bst)
	{
		int[] sequenceArray = new int[bst.size];
		return SequenceArray(bst.root, sequenceArray);
	}

  	// Privately accessible SequenceArray method
	private int[] SequenceArray(Node root, int[] list)
	{
		if (root == null)
		{
			return null;
		}

    		// Check the left subtree
		SequenceArray(root.left, list);

		    // Required check to ensure that the first element of the array does not return -1
		    if(list.length > 0)
		    {
	      		list[list.length - 1] = root.data;
		    }
		    else
		    {
	      		list[0] = root.data;
	    	    }

   	 	// Check the right subtree
		SequenceArray(root.right, list);
		
		return list;
	}
}


