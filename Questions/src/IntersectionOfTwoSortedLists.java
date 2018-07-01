import java.util.*;
public class IntersectionOfTwoSortedLists{

    public static void main(String[] args){
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(5);
        listA.add(7);
        listA.add(9);
        listA.add(10);
        LinkedList<Integer> listB = new LinkedList<Integer>();
        listB.add(1);
        listB.add(3);
        listB.add(8);
        listB.add(7);
        listB.add(10);
        listB.add(12);

        IntersectionOfTwoSortedLists i = new IntersectionOfTwoSortedLists();
        System.out.println(i.getIntersection(listA, listB));
    }


    public LinkedList<Integer> getIntersection(LinkedList<Integer> a, LinkedList<Integer> b){
        LinkedList<Integer> common = new LinkedList<Integer>();
        for(int i = 0; i< a.size(); i++){
            for(int j=0; j<b.size();j++){
                if(a.get(i)==b.get(j)){              
                    common.add(a.get(i));
                }
            }
        }

        return common;
    }


    public class ListNode{
        int data;
        ListNode next;
        public ListNode(int value){
            data = value;
            next = null;
        }
    }
} 