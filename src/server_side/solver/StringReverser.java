package server_side.solver;

public class StringReverser implements Solver<String,String> {

    @Override
    public String solve(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
