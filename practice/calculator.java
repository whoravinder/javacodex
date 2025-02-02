package practice;
public class calculator{
    public static void main(String[] args) {
        add adder = new add();
        subtract subtracter = new subtract();
        division divider = new division();
        adder.plus(5, 3);
        subtracter.minus(5, 3);
        divider.divide(10,5);
    
    }
}
