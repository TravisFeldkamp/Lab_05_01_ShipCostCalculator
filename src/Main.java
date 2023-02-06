public class Main {
    public static void main(String[] args) {
        double shippingPercent = .02;// declare variable for shipping percent
        double priceOfItem = 256.00;// declared variable for the price of users item
        double totalCost ;// declare variable for totalcost
        double shippingCost;// declare variable for the shipping cost
        if (priceOfItem >= 100)// if statement saying if the item price isn't equal to or greater than 100 then do not execute
        {
            System.out.println("Your shipping cost is $0.00, the cost of your item is $" + priceOfItem );//outputs to user the price of their shipping and total cost




    }
        else { // tells the code to run this block if the conditions are not met above
            shippingCost = priceOfItem * shippingPercent;// setting variable shippingCost = to the output of the item price * .02
            totalCost = shippingCost + priceOfItem;// setting variable total cost to the output of shipping cost + priceOfItem
            System.out.println("Your shipping cost is $" + shippingCost + " your total cost is $" + totalCost );// output to user telling them their cost for shipping and total cost

        }
    }
}