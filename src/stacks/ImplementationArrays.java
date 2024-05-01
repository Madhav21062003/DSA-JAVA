package stacks;



public class ImplementationArrays {

    static public class Stack{
        int[] arr;
        int size;
        int top;

        // For handling negative number case
        boolean flag ;
        // Constructor
        public Stack(int size){
            this.size = size;
            top = -1;
            arr = new int[size];
            flag = true;  // Stack is Empty
        }

        // Push
        void push(int value){
            if (top == size-1){
                System.out.println("Stack Overflow");
                return;
            }
            else {
                top++;
                arr[top] = value;
                System.out.println("Value "+value+" pushed ino the stack");
                flag = false;  // Stack is not empty
            }
        }

        // POP
        void pop(){
            if (top == -1){
                System.out.println("Stack is Underflow");
            }
            else {
                System.out.println("Popped "+arr[top]+" from the stack");
                top--;
                if (top == -1){
                    flag = true; // Stack is Empty Now
                }
            }
        }

        // PEEK
        int peek(){
            if (top == -1){
                System.out.println("Stack is Empty");
                return -1;
            }
            else {
                return arr[top];
            }

        }

        // IsEmpty
        boolean isEmpty(){

            if (top == -1){
                return true;
            }
            return false;
        }

        // IsSize
        int isSize(){
            return top+1;
        }


    }
    public static void main(String[] args) {

        Stack st = new Stack(5);

        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);

        st.pop();
        st.pop();

        int peekElement = st.peek();
        System.out.println(peekElement);

        System.out.println(st.isEmpty());
        System.out.println(st.isSize());

        st.push(-10);
        int value = st.peek();
        if (st.flag == false){
            System.out.println(value);
        }

    }
}
