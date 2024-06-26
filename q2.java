public class Solution{
    static class Stack {
        int[] stack;
        int top;
        Stack(int capacity) {
            // Write your code here.
            stack=new int[capacity];
            top=-1;
        }
        public void push(int num) {
            // Write your code here.
            if(top==stack.length-1){
                return;
            }
            top=top+1;
            stack[top]=num;
            return;
        }
        public int pop() {
            // Write your code here.
            if(top==-1){
                return -1;
            }
            int res=stack[top];
            top=top-1;
            return res;
        }
        public int top() {
            // Write your code here.
            if (top==-1){
                return -1;
            }
            else{
                return stack[top];
            }
        }
        public int isEmpty() {
            // Write your code here.
            if(top==-1){
                return 1;
            }
            else{
                return 0;
            }
            
        }
        public int isFull() {
            // Write your code here.
            if(top==stack.length-1){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}