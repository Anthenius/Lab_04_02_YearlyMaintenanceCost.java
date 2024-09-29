public class Main {
    public static void main(String[] args) {
        // Maintenance costs for each season
        double springCost = 150.75;
        double summerCost = 200.50;
        double fallCost = 175.25;
        double winterCost = 225.00;

        // Total yearly maintenance cost
        double totalCost = springCost + summerCost + fallCost + winterCost;

        // Output the seasonal costs and total yearly cost
        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + totalCost);
    }
}
