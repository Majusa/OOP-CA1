/**
 * Maintains a list of objects which may be appended to, queried, and removed from.
 * @author Jonathan Fieldsend
 * @author Matt Gilbert
 * @version 1.5
 */
public class ObjectArrayList {

    private Object[] list;
    
    public ObjectArrayList() {
        list  = new Object[0]; // Initialise array empty
    }
    
    /**
     * Class constructor copies (clones) an ObjectArrayList argument to set 
     * state of this ObjectArrayList
     * @param arrayList ObjectArrayList to set initial state
     */
    public ObjectArrayList(ObjectArrayList arrayList) {
        list = arrayList.list.clone();
    }
	
	public boolean equals(Object object) {
		if (object instanceof ObjectArrayList) {
			return list.equals(((ObjectArrayList) object).list);
		}
		return false;
	}
    
    /**
     * Add Object argument to list
     * @param object Object to add to this list
     */
    public void add(Object object) {
        Object[] temp = new Object[list.length + 1];
		System.arraycopy(list, 0, temp, 0, list.length);
		temp[list.length] = object;
        list = temp;
    }
    
    /**
     * Remove Object argument to list, returns true if Object has been removed,
     * returns false if Object argument was not in list 
     * @param object Object to remove from this list
     * @return boolean denoting if the removed
     */
    public boolean remove(Object object) {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(object)){
                index = i;
                break;
            }
        }
        return remove(index);
    }
    
    /**
     * Remove Object from the given index in the list, returns true if Object has 
     * been removed, returns false if the index is out of the legal range.
     * @param index index of Object to remove from list
     * @return boolean denoting if removed
     */
    public boolean remove(int index) {
        if (index < 0 || index > list.length - 1) return false;
        Object[] temp = new Object[list.length - 1];
		System.arraycopy(list, 0, temp, 0, index);
		System.arraycopy(list, index + 1, temp, index, list.length - index - 1);
        list = temp;
        return true;
    }
    
    /**
     * Replace Object at the given index in the list, with the Object argument.
     * Returns true if successfully replaced,
	 * returns false if the index is out of the legal range.
     * @param object Object to put in list
     * @param index index of Object to replace in list
     * @return boolean denoting if removed
     */
    public boolean replace(Object object, int index) {
        if (index < 0 || index > list.length-1) return false;
        list[index] = object;
        return true;
    }
    
    /**
     * Check if Object is contained in list.
	 * Returns true if present in list, otherwise returns false.
     * @param object Object check in list
     * @return boolean denoting if present in list
     */
    public boolean contains(Object object) {
        for (Object member : list) {
            if (member.equals(object)) return true;
		}
		return false;
    }
    
    /**
     * Get list contents at index.
	 * Will return null if the index is out of the valid range of the list.
     * @param index index of Object to get
     * @return Object at index
     */
    public Object get(int index) {
        if (index < 0 || index > list.length - 1) return null;
        return list[index];
    }
    
    /**
     * Get the total number of elements of the list.
     * @return Number of list elements
     */
    public int size() {
        return list.length;
    }
}
