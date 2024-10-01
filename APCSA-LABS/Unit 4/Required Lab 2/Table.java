public class Table {
    private Customer[] customers;
    final private int maxOccupancy;

    public Table() {
        customers = new Customer[0];
        maxOccupancy = (int) (Math.random() * 9) + 2;
        System.out.println(maxOccupancy);
    }

    public void clear() {
        customers = new Customer[0];
    }

    public void seat(int size) {
        if(size <= maxOccupancy) {
            if(customers.length == 0) {
                customers = new Customer[size];
                for(int i = 0; i < size; i++) {
                    customers[i] = new Customer();
                    System.out.println(customers[i]);
                }
            }else {
                System.out.println("There are people already at this table.");
            }
        }else {
            System.out.println("This table does not have enough space.");
        }
    }

    @Override
    public String toString() {
        String output = "Table has " + customers.length + " customers and a max capacity of " + maxOccupancy + ".\n";
        for(Customer customer : customers) {
            output += customer + "\n";
        }
        return output;
    }
}
