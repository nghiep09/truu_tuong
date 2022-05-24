package Stack_LinkedList;

public class GenericStackClient {
    private static void stackOfIString(){
        MyGenericStack<String>stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println(" 1.1 Size of stack after push operation " +stack.size());
        System.out.println(" 1.2 Pop element from stack");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("\n 1.3 Size of stack after pop operation " +stack.size());
    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer>stack= new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(" 2.1 Size of stack after push operation "+ stack.size());
        System.out.println(" 2.2 Pop element from stack");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("\n 2.3 Size of stack pop operation "+stack.size());

    }
    public static void main(String[] args) {
        System.out.println("1 Stack of int");
        stackOfIString();
        System.out.println("2 stack of string");
        stackOfIntegers();
    }
}
