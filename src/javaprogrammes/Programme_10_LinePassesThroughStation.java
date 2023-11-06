package javaprogrammes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */
public class Programme_10_LinePassesThroughStation {

    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter tube station name of zone 1: ");
        String stationName = scanner.nextLine();
        // Object creation to call Instance method to main method
        Programme_10_LinePassesThroughStation obj = new Programme_10_LinePassesThroughStation();
        obj.stationList(stationName);
        //Closing the scanner object
        scanner.close();
    }

    public void stationList(String stationName) {
        ArrayList<String> stationList = new ArrayList<>();
        stationList.add("Green Park");
        stationList.add("Bond Street");
        stationList.add("Baker Street");
        stationList.add("London Bridge");
        stationList.add("West minister");
        stationList.add("Oxford circus");
        stationList.add("South kensington");
        stationList.add("Embankment");
        stationList.add("Holborn");
        stationList.add("Victoria");
        // Add more station if needed

        // Hashmap creation to map station lines to lines
        Map<String, String> tubeLine = new HashMap<>();
        tubeLine.put("Green Park", "Jubilee, Victoria, Piccadilly");
        tubeLine.put("Bond Street", "Jubilee, Central");
        tubeLine.put("Baker Street", "Jubilee, Circle, Metropolitan, Hammersmith & city");
        tubeLine.put("London Bridge", "Jubilee, Northern");
        tubeLine.put("West minister", "Jubilee, District, Circle");
        tubeLine.put("Oxford circus", "Bakerloo, Victoria, Central");
        tubeLine.put("South kensington", "Piccadilly, District, Circle");
        tubeLine.put("Embankment", "Bakerloo, Northern, District, Circle");
        tubeLine.put("Holborn", "Central, Piccadilly");
        tubeLine.put("Victoria", "District, Victoria, Circle");

        // If-else statement to find lines for particular station
        if (stationList.contains(stationName)) {
            String lines = tubeLine.get(stationName);
            System.out.println("Lines passing through " + stationName + " : " + lines);
        } else {
            System.out.println(stationName + "  station is not in a zone 1.");
        }
    }


}
