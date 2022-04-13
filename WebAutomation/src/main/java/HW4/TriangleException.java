package HW4;

public class TriangleException extends Exception {

    public String info( int a, int b, int c){
        return "There is no triangle with sides: " + a + ", " + b + ", " + c;
    }
}
