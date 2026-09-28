import java.util.Scanner;

// ===== Interface =====
interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// ===== Abstract Class =====
abstract class Consoles implements IConsoles {
    protected String consoleType;
    protected String store;
    protected int totalSales;

    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() { return consoleType; }

    @Override
    public String getStore() { return store; }

    @Override
    public int getTotalSales() { return totalSales; }

    // Abstract method to be implemented by subclass
    public abstract void printReport();
}

// ===== Subclass =====
class ConsoleSales extends Consoles {
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}

// ===== Main Class =====
public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        String consoleType = switch (choice) {
            case 1 -> "PS5";
            case 2 -> "XBOX";
            case 3 -> "SWITCH";
            default -> "Unknown";
        };

        System.out.print("Enter the store name: ");
        String store = sc.nextLine();

        System.out.print("Enter total sales of " + consoleType + " consoles for " + store + ": ");
        int totalSales = sc.nextInt();

        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);
        report.printReport();
    }
}
