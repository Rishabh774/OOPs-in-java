package Collection_Framework;

import java.util.Stack;

public class Reverse_Stack {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        Stack<Integer> gt =new Stack<>();
        Stack<Integer> qt =new Stack<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);
        System.out.print(st+" ");
        while (st.size()>0){
            gt.add(st.peek());
            st.pop();
        }
        while (gt.size()>0){
            qt.add(gt.peek());
            gt.pop();
        }
        while (qt.size()>0){
            st.add(qt.peek());
            qt.pop();
        }
        System.out.println();
        System.out.print(st+" ");
    }
}
