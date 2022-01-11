package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane p = new Plane(10);
        p.onboard("Ray");
        p.onboard("Sia");
        p.onboard("Kat");
        System.out.println("Plane took of at: "+p.takeOff());
        System.out.println("List of onboarded passengers:"+p.getPassengers());
        Thread.sleep(5000);
        p.land();
        System.out.println("Plane landed at: "+p.getLastTimeLanded());
    }

}


class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers){
      this.maxPassengers=maxPassengers;
      this.passengers = new ArrayList<>();
    }

    public void onboard(String name){
        passengers.add(name);
    }

    public Date takeOff(){
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }

    public List<String> getPassengers(){
        return passengers;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
}