public class PriceIncrease {
    public static void main(String[] args) {
        double[] prices ={23.0, 22.11, 2134.12, 5, 62.1};

        System.out.println("----------- przed podwyżką ------------");
        //przed podwyżką:
        for(double price : prices){
            System.out.println(price);
        }

        System.out.println("----------- po podwyżce ------------");
        //po podwyżce:
        for(double price : prices){
            System.out.println(price*1.1);
        }
    }
}
