/*
1. program to reverse an array
2. program to delete first node of a linked list
3. program to implement stack using array
4. program to implement queue using array
5. program to create binary tree node
6. program to print all vertices of a graph
7. program to find smallest and largest element in an integer array
 */
package DAY29;

public class Que {
        /*
        idea 1:  take last element, move all the elements to one place up and place the last element in first
        idea 2: swap first and last, second and second last and so on.
         */
       static int[] reverse(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] rev = reverse(arr);

        for (int x : rev) {
            System.out.print(x + " ");
        }
    }

    
    /*  
    to delete last node of linked list:
    check if head = null, check it head.next is null, then use while and check untill head.next.next!=null, swap head with head.next then do head.next as null

     */
    int deleteFirstNode(Node head){
        if(head == null) return -1;
        if(head.prev == null){
            Node temp = head.data;
            head = null;
            return temp;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
            temp.next = null;
        }
    }
}



