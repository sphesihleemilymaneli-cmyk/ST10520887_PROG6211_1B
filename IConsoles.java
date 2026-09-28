
import java.util.Scanner;

public interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

package number1electronicsreport;

public abstract class Consoles implements IConsoles {
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
}

package number1electronicsreport; 
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the console device type (e.g., PlayStation 5, Xbox Series X): ");
            String consoleType = scanner.nextLine();
            
            System.out.print("Enter the store name: ");
            String storeName = scanner.nextLine();
            
            System.out.print("Enter the total amount of sales: ");
            int totalSales = scanner.nextInt();
            
            ConsoleSales saleReport = new ConsoleSales(consoleType, storeName, totalSales);
            
            System.out.println();
            saleReport.printReport();
        }
    }
}