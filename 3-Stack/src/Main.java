public class Main {

    public static void main(String[] args) {
        String str = "horse";
        StringReverse reverse = new StringReverse();
        var result = reverse.reverse(str);
        System.out.println(result);

        String exp = "(1+2 - {3+4}})";
        Expression ex = new Expression();
        var res = ex.isBalanced(exp);
        System.out.println(res);

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }

}
