package linked_list;
/**
 * I wrote this code together with the professor 
 * who taught the class about linked list in the data structure playlist on the 2Guarinos channel. 
 * It's not my own code, but it's helping me study and understand the concepts of linked list :)
 * @author Fernando Pacheco
 * @author 2Guarinos
 */
public class LinkedList<TYPE> {
	private Element<TYPE> first; // first element of  my linked list
	private Element<TYPE> last; // last element of my linked list
	private int size; // size of my linked list
	
	public LinkedList() {
		this.size = 0;
	}
	
	public Element<TYPE> getFirst() {
		return first;
	}
	public void setFirst(Element<TYPE> first) {
		this.first = first;
	}
	public Element<TYPE> getLast() {
		return last;
	}
	public void setLast(Element<TYPE> last) {
		this.last = last;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * method used to add new elements to my linked list
	 * @param newValue new value to be added to the linked list
	 */
	public void add(TYPE newValue) {
		Element<TYPE> newElement = new Element<TYPE>(newValue);
		
		if(this.first == null && this.last == null) {
			this.first = newElement;
			this.last = newElement;
		}
		else {
			this.last.setNext(newElement);
			this.last = newElement;
		}
		this.size++;
	}
	/**
	 * method to remove elements from the linked list
	 * @param newValue new value to be removed to the linked list
	 */
	public void remove(TYPE soughtValue) {
		Element<TYPE> previous = null;
		Element<TYPE> current = this.first;
		for(int i=0; i < this.getSize(); i++) {
			if(current.getValue().equals(soughtValue)) {
				if(this.size == 1) {
					this.first = null;
					this.last = null;
				}
				else if(current == this.first) {
					this.first = current.getNext();
					current.setNext(null);
				}
				else if(current == this.last) {	
					this.last = previous;
					current.setNext(null);
				}
				else {
					previous.setNext(current.getNext());
					current = null;
				}
				this.size--;
				break;
			}
			previous = current;
			current = current.getNext();
		}
	}
	/**
	 * method that gets the element through its position
	 * @param position
	 * @return
	 */
	public Element<TYPE> get(int position) {
		Element<TYPE> current = this.first;
		for(int i=0; i < position; i++) {
			if(current.getNext() != null) {
				current = current.getNext();
			}
		}
		return current;
	}
	
	public IteratorLinkedList<TYPE> getIterator() {
		return new IteratorLinkedList<TYPE>(this.first);
	}
	
}
