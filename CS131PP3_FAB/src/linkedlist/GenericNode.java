package linkedlist;
	/**
	 * This class models a Node object which can hold any type of object.
	 * Each node has its internal data (an object of type T) and a pointer to the next 
	 * node in the list.
	 * 
	 * CHANGE MADE: Added my name to the author list and made the class parameterized
	 * so that it can hold any type of object.
	 * 
	 * @param <T> the type of object that the node will hold
	 * @author Firstene Badua
	 */
	public class GenericNode<T> {
		
		private T data;  //data that the object stores
		private GenericNode<T> nextNode; //pointer to the nextNode that will be in LinkedList
		
		/**
		 * Constructor builds GenericNode object. Initializes nextNode and data
		 * to null.
		 */
		public GenericNode()
		{
			setNextNode(null);
			data=null;
		}//end empty-argument constructor
		
		/**
		 * This method sets the data of the object.
		 * @param data
		 */
		public void setData(T data) {
			this.data=data;
		}//end setData
		
		/**
		 * This method returns the data of the object.
		 * @return T (data)
		 */
		public T getData() {
			return this.data;
		}//end getData
		
		/**
		 * This method returns itself to the caller.
		 * @return
		 */
		public GenericNode<T> getNode() {
			return this;
		}//end getNode
		
		/**
		 * This method updates the pointer for the next node.
		 * @param nextNode
		 */
		public void setNextNode(GenericNode<T> nextNode)
		{
			this.nextNode=nextNode;
		}//end setNextNode
		
		/**
		 * This method returns the node stored in the next node pointer.
		 * @return GenericNode<T> object
		 */
		public GenericNode<T> getNextNode() {
			return nextNode;
		}//end getNextNode
		
	}//end class
