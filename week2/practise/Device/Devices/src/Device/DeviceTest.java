package Device;

public class DeviceTest {


    public static void main(String[] args){
        Phone myphone = new Phone();
        System.out.println("the phone charger is  : " + myphone.getBattery());
        myphone.playGame();
        System.out.println("the phone charger after playing is : " + myphone.getBattery());
        myphone.playGame();
        System.out.println("the phone charger after second playing  :" + myphone.getBattery());
        myphone.charge();
        myphone.playGame();
        myphone.playGame();
        myphone.playGame();
        myphone.playGame();
        myphone.playGame();
        System.out.println("the phone charger :" + myphone.getBattery());
        if(myphone.getBattery()<=10){
            System.out.println("Battery Critical");
        }
    }
}
