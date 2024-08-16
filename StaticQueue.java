
public class StaticQueue <T> {
    int top ;
    int base = 0;
    private T [] data;

    public StaticQueue(int size) {
        data = (T[]) new Object[size];
        top = 0;
    }
    public void add (T item){
      if(isFull()){
          throw new IllegalStateException("Queue is full");
      }
       data[top++] = item;
    }
    public T remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        T item = data[base];
        base++;
        return item;

    }
    public boolean isEmpty(){
        if(top == base){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (top == data.length) {
            return true;
        }
        return false;
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack: [");
        for (int i = 0; i < top; i++) {
            System.out.print(data[i]);
            if (i < top - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        StaticQueue<Integer> queue = new StaticQueue<>(10);

        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }



         System.out.println(queue.remove());
         System.out.println(queue.remove());
    }
}