package server_side;

public class StringReverser implements Solver<String,String> {

    @Override
    public String solve(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
