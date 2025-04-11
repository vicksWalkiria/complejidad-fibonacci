import java.util.ArrayList;

/**
 *
 * @author vicks
 */

public class Fibonacci {
    public static ArrayList<Integer> fibs = new ArrayList<Integer>();

    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 35, 40, 45, 50};
        
        System.out.println("n | Recursivo (ms) | Dinámico (ms) | Iterativo (ms)");
        System.out.println("---------------------------------------------------");
        
        for (int x : valores) {
            fibs.clear();
            fibs.add(0);
            fibs.add(1);
            
            long startRec = System.nanoTime();
            int resRec = fibonacci(x);
            long endRec = System.nanoTime();
            double timeRec = (endRec - startRec) / 1e6;
            
            long startDyn = System.nanoTime();
            int resDyn = fibonacciDinamico(x);
            long endDyn = System.nanoTime();
            double timeDyn = (endDyn - startDyn) / 1e6;
            
            long startIter = System.nanoTime();
            int resIter = fibonacciIterativo(x);
            long endIter = System.nanoTime();
            double timeIter = (endIter - startIter) / 1e6;
            
            System.out.printf("%d | %.3f ms | %.3f ms | %.3f ms\n", x, timeRec, timeDyn, timeIter);
        }
    }
    
    public static int fibonacci(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static int fibonacciDinamico(int x) {
        if (fibs.size() > x) {
            return fibs.get(x);
        } else {
            int newFibs = fibonacciDinamico(x - 1) + fibonacciDinamico(x - 2);
            fibs.add(newFibs);
            return newFibs;
        }
    }
    
    public static int fibonacciIterativo(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;

        int a = 0, b = 1, c;
        for (int i = 2; i <= x; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
