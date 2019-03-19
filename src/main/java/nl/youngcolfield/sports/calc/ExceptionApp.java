package nl.youngcolfield.sports.calc;

import java.lang.reflect.Array;

public class ExceptionApp {

    public static void main(String[] args) throws UnableToDivideByZeroException {

        BasicCalculator basicCalculator = new BasicCalculator();

        try {
            System.out.println(basicCalculator.divide(3,2));
        }
        catch(UnableToDivideByZeroException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Dat ging niet helemaal goed!!!");

            throw e;
        }

        catch(RuntimeException rte) {

            return;

        }
        catch(Exception e) {
            //altijd iets doen
            System.err.println("DAt ging vout!");
            e.printStackTrace();

            return;
        }
        finally {
            System.out.println("Closing the file since we always have to close the file here (demo)");
        }



        System.out.println(basicCalculator.divide(3,0));

    }
}
