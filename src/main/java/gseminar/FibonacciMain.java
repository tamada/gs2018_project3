package gseminar;

import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class FibonacciMain{
    private FibonacciSeries series = new FibonacciSeries();

    public void run(String[] args, PrintWriter out){
        if(args.length == 0){
            throw new RequiredValueMissingException("no args");
        }
        perform(Arrays.stream(args), out);
    }

    public void perform2(String[] args, PrintWriter out){
        for(int i = 0; i < args.length; i++){
            int index = new Integer(args[i]);
            int value = findIndex(index);
            println(out, index, value);
        }
    }

    private void println(PrintWriter out, int index, int value){
        out.printf("fibo(%d) = %s%n", index, value);
        out.flush();
    }

    public void perform(Stream<String> args, PrintWriter out) {
        args.map(Integer::new)
            .forEach(index -> println(out, index, findIndex(index)));
    }

    private int findIndex(int index) {
        if(index < 0)
            throw new NegativeValueException(index + ": negative value not allowed");
        return series.index(index);
    }

    public static void main(String[] args) throws IOException {
        FibonacciMain main = new FibonacciMain();
        main.run(args, new PrintWriter(new OutputStreamWriter(System.out, "utf-8")));
    }
}
