public class StackArray{
        int n;
        int arr[];
        int top;

        StackArray(int n){
                this.n = n;
                this.arr = new int[n];
                this.top = -1;
        }
        public boolean isFull(){
                return (n-1 == top);
        }
        public boolean IsEmpty(){
                return (top == -1);
        }
        public void push(int pushedElement){
                if(!isFull()){  // need to make isFull statement.
                        top++;
                        arr[top] = pushedElement;
                        System.out.println("pushed element " + pushedElement);
                }
                else{
                        System.out.println("Stack is full !");
                }
        }
        public int pop(){
                // need to make isEmpty statement
                if(!IsEmpty()){
                        int poppedElement = top;
                        top--;
                        System.out.println("Popped element "+ arr[poppedElement]);
                        return arr[poppedElement];
                }
                else{
                        System.out.println("Stack is empty!");
                        return -1;
                }
        }
        public int peek(){
                return arr[top];
        }
        public static void main(String[] args) {
                StackArray obj = new StackArray(5);
                obj.push(1);
                obj.push(2);
//              obj.push(3);
//              obj.push(4);
//              obj.push(5);
//              obj.pop();
                System.out.println(obj.peek());
        }
}