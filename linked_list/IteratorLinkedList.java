package linked_list;

public class IteratorLinkedList<TYPE> {
	private Element<TYPE> element;
	
	public IteratorLinkedList(Element<TYPE> atual) {
		this.element = atual;
	}

	public boolean isNext() {
		if(element.getNext() == null) {
			return false;
		}
		return true;
	}
	
	public Element<TYPE> getNext() {
		element = element.getNext();
		return element;
	}
	
}
