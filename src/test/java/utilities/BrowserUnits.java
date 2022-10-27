package utilities;

public class BrowserUnits {
    //Method are static. becouse We do not want to create an object to call those mehtods
    //we just want call those methods with class name that is why they are static type
    public static void sleep(int seconds){
        try {


        Thread.sleep(seconds*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Exccption happened in sleep method");
        }
    }

}
