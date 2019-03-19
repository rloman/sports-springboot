package nl.youngcolfield.sports.calc;

import java.util.List;

public class BasicCalculator {

    private List<Integer> numberList;

    public int add(int a, int b) {

        return a+b;
    }

    public int subtract(int i, int i1) {
        return i-i1;
    }

    public int foo() {
        return numberList.size()+1;
    }

    public int divide(int a, int b) throws UnableToDivideByZeroException {
        if(b == 0) {
            throw new UnableToDivideByZeroException();
        }
        return a/b;
    }
}
