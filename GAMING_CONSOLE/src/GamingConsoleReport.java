/**
 * @author akani sothole
 * 
 * Number 1 Electronics – Gaming Console Sales Report
 */
public class GamingConsoleReport {
    public static void main(String[] args) {
        // --- Single‑dimensional array for city names ---
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // --- Two‑dimensional array for console sales ---
        // Columns: [PS5, XBOX, SWITCH]
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // --- Single‑dimensional array for totals per city ---
        int[] cityTotals = new int[cities.length];

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "City", "PS5", "XBOX", "SWITCH");

        // Calculate totals and print table
        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            cityTotals[i] = total;
            System.out.printf("%-15s %-10d %-10d %-10d%n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("\nCONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-10d%n", cities[i], cityTotals[i]);
        }

        // --- Determine city with highest total ---
        int highest = cityTotals[0];
        String topCity = cities[0];
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > highest) {
                highest = cityTotals[i];
                topCity = cities[i];
            }
        }

        System.out.println("\nCITY WITH THE MOST SALES: " + topCity);
        System.out.println("TOTAL SALES: " + highest);
    }
}
