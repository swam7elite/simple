package Catch;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Swam on 15.03.16.
 */
public class Reader {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int read() throws IOException {
        String x = reader.readLine();
        int z = Integer.parseInt(x);
        return z;
    }
}
