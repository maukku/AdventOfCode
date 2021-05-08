import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day1 {


    int[] myArray;

    public void puzzle() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("C:\\Users\\mauro\\OneDrive\\Escritorio\\Adventofcode\\input.txt"));
        ArrayList<Integer> input = new ArrayList<>();

        while (scanner.hasNext()) {
            input.add(scanner.nextInt());


        }
        myArray = new int[input.size()];
        for (int i = 0; i < input.size(); i++) {
            myArray[i] = input.get(i);

        }

        for (int p : myArray
        ) {
            System.out.println(p);

        }


        int result = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {


                if (myArray[i] + myArray[j] == 2020) {

                    result = myArray[i] * myArray[j];
                }
            }


        }
        System.out.println(result);
}




    public static void main(String[] args) throws FileNotFoundException {
        day1 x = new day1();
        x.puzzle();


}
}