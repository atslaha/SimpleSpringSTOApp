package il.co.ssstoapp.classes;


import il.co.ssstoapp.interfaces.ServiceStation;

public class WestCoastSustomsService implements ServiceStation {

    @Override
    public void takeAnOrder() {
        System.out.println("Explane us what was happened!)");
        
    }

    @Override
    public void chooseServise() {
        System.out.println("You have to choose service that you want!"); 
        
    }

    @Override
    public void giveABill() {
        System.out.println("Give me my money!!!");
        
    }

    @Override
    public void acceptPayment() {
        System.out.println("Thanks!)");
        
    }

}
