import java.util.LinkedList;

public class LinkedListExample_1 
{
	public static void main(String[] args) 
	{
		//Declaring LinkedList
		LinkedList<String> linkedlist=new LinkedList<String>();
		
		//Adding String element to the linkedlist by using add(); method
		linkedlist.add("Item_1");
		linkedlist.add("Item_2");
		linkedlist.add("Item_3");
		linkedlist.add("Item_4");
		linkedlist.add("Item_5");
		
		//Displaying LinkedList Content
		System.out.println(linkedlist);                                             //[Item_1, Item_2, Item_3, Item_4, Item_5]
		
		//Add first and last element to list
		linkedlist.addFirst("First_Name");
		linkedlist.addLast("Last_Name");
		
		//Display LinkedList Content
		System.out.println("LinkedList Content after Addition:"+linkedlist);        //[First_Name, Item_1, Item_2, Item_3, Item_4, Item_5, Last_Name]
		
		//Remove First and Last element
		linkedlist.removeFirst();
		linkedlist.removeLast();
		
		//Display LinkedList Content
		System.out.println("LinkedList after Deletion:"+linkedlist);               //[Item_1, Item_2, Item_3, Item_4, Item_5]
		
		//Add and Remove to a specific position
		linkedlist.add(0, "New_Item");
		linkedlist.remove(2);
		
		//Display Final LinkedList
		System.out.println("Final LinkedList:"+linkedlist);                        //[New_Item, Item_1, Item_3, Item_4, Item_5]
	}

}
