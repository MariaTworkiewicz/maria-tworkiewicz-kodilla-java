package com.interviews.sabre.july23_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {

    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            //System.out.println(line);
            String[] numbersInArray = line.split(",");
            //String numbers = numbersInArray[0];

            Integer[] givenArray = new Integer[numbersInArray.length];
            for (int i = 0; i < numbersInArray.length; i++) {
                givenArray[i] = Integer.parseInt(numbersInArray[i]);
            }


            List<Integer> arrayList = Arrays.asList(givenArray);
            arrayList.stream()
                    .filter(i -> Collections.frequency(arrayList, i) > 1)
                    .collect(Collectors.toSet())
                    .forEach(System.out::println);
        }
    }
}


//challenge z google
/*Credits: This challenge has appeared in a past google competition

        You are writing out a list of numbers.Your list contains all numbers with exactly Di digits in its decimal representation which are equal to i, for each i between 1 and 9, inclusive. You are writing them out in ascending order. For example, you might be writing every number with two '1's and one '5'. Your list would begin 115, 151, 511, 1015, 1051. Given N, the last number you wrote, compute what the next number in the list will be. The number of 1s, 2s, ..., 9s is fixed but the number of 0s is arbitrary.
        */

 /*       import java.io.*;
        import java.util.Arrays;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            char[] c = line.toCharArray();
            Arrays.sort(c);
            for (int i = Integer.parseInt(line)+1; ; i++) {
                String s = String.valueOf(i);
                char[] d = s.toCharArray();
                Arrays.sort(d);
                char[] e = new char[c.length];
                e = Arrays.copyOfRange(d, d.length-c.length, d.length);
                if (Arrays.equals(c, e)) {
                    char[] t = Arrays.copyOf(d, d.length);
                    Arrays.sort(t);
                    char[] f = Arrays.copyOf(e, d.length);
                    Arrays.sort(f);
                    Arrays.fill(f, 0, d.length-e.length, '0');
                    if (Arrays.equals(f, t)) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
        br.close();
    }
}*/


/*//calendar
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.nio.charset.StandardCharsets;
        import java.util.Calendar;

public class Calendar {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            String[] enteredDate = line.split(" ");
            int month = Integer.parseInt(enteredDate[0]);
            int day = Integer.parseInt(enteredDate[1]);
            int year = Integer.parseInt(enteredDate[2]);

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month-1, day);

            if(year>2000 && year <3000){
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                switch(dayOfWeek){
                    case 1: System.out.println("SUNDAY");
                        break;
                    case 2: System.out.println("MONDAY");
                        break;
                    case 3: System.out.println("TUESDAY");
                        break;
                    case 4: System.out.println("WEDNESDAY");
                        break;
                    case 5: System.out.println("THURSDAY");
                        break;
                    case 6: System.out.println("fRIDAY");
                        break;
                    case 7: System.out.println("SATURDAY");
                        break;
                }
            }

        }
    }
}*/

//foodFactory
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Zarcie {

    /**
     * Iterate through each line of input.
     */
/*public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
        System.out.println(line);
        String orderedFood = line;
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.getFood(orderedFood).getType();

    }
}
}


interface Food{
    void getType();
}

class Pizza implements Food{

    public void getType(){
        System.out.println("Someone ordered Fast Food");
    }
}

class Cake implements Food{
    public void getType(){
        System.out.println("Someone ordered a Dessert");
    }
}

class FoodFactory {


    public Food getFood(String order) {
        if ("Cake".equalsIgnoreCase(order)) {
            return new Cake();
        }
        if ("Pizza".equalsIgnoreCase(order)) {
            return new Pizza();

        }

        return null;



    }
}

 */

//numberPairs
/*import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.nio.charset.StandardCharsets;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.HashSet;

class IntPair{
    int i;
    int j;

    public IntPair(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntPair)) return false;

        IntPair intPair = (IntPair) o;

        if (i != intPair.i) return false;
        return j == intPair.j;
    }

    @Override
    public String toString() {
        return "IntPair{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + j;
        return result;
    }
}

public class NumberPairs {
    public static void main(String[] args) throws IOException {
        int tempSum;
        HashSet<IntPair> set = new HashSet<>();

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            String[] enteredNumbers = line.split(";");
            String numbers = enteredNumbers[0];
            String result = enteredNumbers[1];
            int sum = Integer.parseInt(result);
            String[] numbersToSum = numbers.split(",");
            int[] givenArray = new int[numbersToSum.length];
            for (int i = 0; i < numbersToSum.length; i++) {
                givenArray[i] = Integer.parseInt(numbersToSum[i]);
            }


            Arrays.sort(givenArray);

            for (int i = 0; i < givenArray.length; i++) {
                for (int j = i + 1; j < givenArray.length; j++) {
                    tempSum = givenArray[i] + givenArray[j];
                    if (tempSum == sum) {
                        set.add(new IntPair(givenArray[i], givenArray[j]));
                    }
                }
            }

            for (IntPair pair : set) {
                System.out.println(pair);
            }
        }
    }
}
*/


