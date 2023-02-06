public class Main {
    public static void main(String[] args) {
        double shippingPercent = .02;
        double priceOfItem = 256.00;
        double totalCost ;
        double shippingCost;
        if (priceOfItem >= 100)
        {
            System.out.println("Your shipping cost is $0.00, the cost of your item is $" + priceOfItem );




    }
        else {
            shippingCost = priceOfItem * shippingPercent;
            totalCost = shippingCost + priceOfItem;
            System.out.println("Your shipping cost is $" + shippingCost + " your total cost is $" + totalCost );

        }
    }
}