import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Gennadiy on 10.06.2014.
 */
public class SUM2 {
    private int lowerBound;
    private int upperBound;
    private String source;
    private Set<Long> sourceSet = new HashSet<Long>();
    private Set<Integer> valueT = new HashSet<Integer>();

    public SUM2(int lowerBound, int upperBound, String source) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.source = source;
    }

    public void init() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(source));
            String nextLine;
            while (!((nextLine = reader.readLine()) == null)) {
                long nextElement = Long.parseLong(nextLine);

                sourceSet.add(nextElement);

            }



        } catch (IOException e) {
            System.out.println("File not found");
        }
        System.out.println("Reading completed");



    }

    public int findNumberOfT() {
        Iterator<Long> iterator;
        long x;
        long y;
        for (int i = lowerBound; i <= upperBound; i++) {
            
            iterator = sourceSet.iterator();
            while (iterator.hasNext()) {
                x = iterator.next();
                y = i - x;

                if (sourceSet.contains(y) && (y != x)) {
                    valueT.add(i);
                }

            }



        }

        return valueT.size();
    }


}
