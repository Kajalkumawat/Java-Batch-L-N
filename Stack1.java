import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(89);
        st.push(34);
        st.push(12);
        // want tot print topmost element in the stack
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        // when remove element into the empty stack then it give empty stack exception
        // in java

    }
}
