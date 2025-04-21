import java.util.ArrayList;

public class ArgPassDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer>myList = new ArrayList<>();
        myList.add(2);
        myList.add(4);
        System.out.println("Before Changing: myList " + myList); // this will print the original list
        changeList(myList); //
        System.out.println("After Changing: myList " + myList); // this will print the original list, why?
        // The list is passed by reference, but the reference itself is passed by value.
        // So, if we change the reference to point to a new list, it won't affect the original list.
        // If we modify the contents of the list, it will affect the original list.
        // If we want to change the reference to point to a new list, we need to return the new list and assign it to the original reference.
        // myList = changeList(myList); // this will not work because changeList does not return anything

    }
    public static void changeList(ArrayList<Integer> myList) {
        //myList = new ArrayList<>();
        myList.add(3);
        myList.add(5);
        myList.add(7);
        // The above line will modify the original list, but the reference to the list will not change.
        //System.out.println("Inside changeList: list " + myList);
    }
}
