import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(lexicalOrder(13));
    }

    public static List<Integer> lexicalOrder(int n) {
        List<Integer> list;
        list = new ArrayList<>((IntStream.rangeClosed(1, n)
                .boxed()
                .toList()));

//        Collections.sort(list);

        return list;
    }

    private static void solve(int x, int n){
        if (x > n) return;

        for (int i = 0; i <= 9; i++) {
            solve(x*10, i);
        }
    }
}