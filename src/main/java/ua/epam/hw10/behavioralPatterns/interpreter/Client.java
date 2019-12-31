package ua.epam.hw10.behavioralPatterns.interpreter;

public class Client {
    public static void main(String[] args) {
        String str = "Test";
        System.out.println(str);
        Context context = new Context();
        Expression loverExpression = new LowerExpression(str);
        str = loverExpression.interpret(context);
        System.out.println(str);
        Expression upperExpression = new UpperExpression(str);
        str = upperExpression.interpret(context);
        System.out.println(str);
    }
}
