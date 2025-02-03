public class SalesTaxCalculator {

    /**
     * Main method to process command-line arguments and calculate sales tax.
     * @param args Command-line arguments: args[0] should be the state name, args[1] should be the sale amount.
     */
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two arguments - state name and sale amount.");
            return;
        }

        // Extract state and sale amount from the arguments
        String stateName = args[0];
        String saleAmountStr = args[1];

        double saleAmount;
        try {
            // Convert the sale amount to a double
            saleAmount = Double.parseDouble(saleAmountStr);
        } catch (NumberFormatException e) {
            System.out.println("Error: Sale amount must be a valid number.");
            return;
        }

        // Initialize state object
        State state;
        switch (stateName) {
            case "Indiana":
                state = new Indiana();
                break;
            case "Alaska":
                state = new Alaska();
                break;
            default:
                System.out.println("Error: Unsupported state. Please use 'Indiana' or 'Alaska'.");
                return;
        }

        // Display the tax for the given state and sale amount
        state.showTax(saleAmount);
    }
}