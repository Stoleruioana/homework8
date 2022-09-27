public class Company {

    private FoodProvider foodProvider;
    private int numberEmployees;
    private String name;

    public Company (FoodProvider foodprovider, int numberEmployees) {
        this.foodProvider=foodprovider;
        this.numberEmployees = numberEmployees;
    }

    public void sendFoodToEmployees() {
        for (int i=0; i<numberEmployees; i++) {
            System.out.println(foodProvider.deliverFood() + "#" + foodProvider.getDeliveredFood());
        }
    }


}
