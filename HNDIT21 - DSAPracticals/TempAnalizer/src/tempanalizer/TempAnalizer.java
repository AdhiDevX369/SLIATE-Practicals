/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempanalizer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class TempAnalizer {

    public static void main(String[] args) {
 int numCities = 20;
        int numDays = 365;
        double[][] temperatures = new double[numCities][numDays];
        DecimalFormat df = new DecimalFormat("0.00");

        // Generate random temperatures in Celsius for each city over 365 days
        for (int city = 0; city < numCities; city++) {
            for (int day = 0; day < numDays; day++) {
                double temperature = -10 + Math.random() * (40 - (-10)); // Random temperature between -10 and 40
                temperatures[city][day] = temperature;
            }
        }

        System.out.println("Yearly Temperatures for 20 Cities:");

        for (int city = 0; city < numCities; city++) {
            System.out.println("City " + (city + 1) + ":");

            for (int day = 0; day < numDays; day++) {
                System.out.print("Day " + (day + 1) + ": " + df.format(temperatures[city][day]) + "°C  ");
                if ((day + 1) % 10 == 0) {
                    System.out.println();
                }
            }

            double average = calculateAverage(temperatures[city]);
            System.out.println("\nAverage Temperature (°C): " + df.format(average) + "\n");
        }
    }

    // Helper method to calculate the average temperature for a city
    private static double calculateAverage(double[] temperatures) {
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.length;
    }
}