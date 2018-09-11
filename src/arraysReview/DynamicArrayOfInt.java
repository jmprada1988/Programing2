package arraysReview;
/**
 * 
 * An array of unlimited size if ints, it shuold be used the the notation A.get(i) 
 * Instead of A[i] with a traditional arrray and A.set(i) instead of A[i] = v
 * @author lein
 */

public class DynamicArrayOfInt {
    private int[] data;
    /**
     * constructor creates an array with an initial size of 1, however, the size will be increased whenever 
     * a reference is made to an array position that does not yet exist
     */
    public DynamicArrayOfInt() {
        data = new int[1];        
    }
    /**
    *  Get the value from the specified position in the array.
    *  Since all array elements are initialized to zero, when the
    *  specified position lies outside the actual physical size
    *  of the data array, a value of 0 is returned.  Note that
    *  a negative value of position will still produce an
    *  ArrayIndexOutOfBoundsException.
    */
    public int get(int position) {
        if (position >= data.length)
            return 0;
        else
            return data[position];
    }
    
    /**
    *  Store the value in the specified position in the array.
    *  The data array will increase in size to include this
    *  position, if necessary.
    */
    public void put(int position, int value) {
        if (position >= data.length) {
            int newSize = 2 * data.length;
            if (position >= newSize)
                newSize = 2 * position;
            int[] newData = new int[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
            System.out.println("The size of the dynamic array has been increased to " + newSize);
        }
        data[position] = value;
    }
    
    

}
