public class Main {

    public static void main(String[] args) {

//        StringReverse reverse = new StringReverse();
//        var result = reverse.reverse("suman");
//        System.out.println(result);

//        String str = "(1 + 2)";
//        Expression exp = new Expression();
//        var result = exp.isBalanced(str);
//        System.out.println(result);

        MyStack myStack = new MyStack();
        myStack.push(3);
        myStack.push(5);
        myStack.push(7);
        System.out.println(myStack.peek());

    }

}
