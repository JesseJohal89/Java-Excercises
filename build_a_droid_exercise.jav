/*
Java Exercise
Build A Droid
*/

public class Droid {
  
  int batteryLevel;
  String name;

  //to string method for print result
  public String toString() {
    return "Hello, I’m the droid: " + name + ". How can i be of service...?";
  }

  public Droid(String droidName){
    batteryLevel = 100;
    name = droidName;
  }

  // method to get droid to perform task then takeawy -10 battery life
  public void performTask(String task) {
    batteryLevel = batteryLevel - 10;
    System.out.println(name + " is performing task: " + task);
  }

  public void energyRecharge() {
    int newBattery = 100;
    this.batteryLevel = newBattery;
    System.out.println(name + "'s battery has now been replaced");
  }

  //prints droid current energy level
  public void energyReport(){
    System.out.println(name + "'s battery level is now: " + batteryLevel);
  }

  //MAIN
  public static void main (String[] args){
    Droid droid1 = new Droid("Codey");

    //print droid name
    System.out.println(droid1);

    //print droid startingbattery level
    System.out.println(droid1.batteryLevel);
    
    //print droid tasks
    droid1.performTask("dancing");
    //System.out.println(droid1.batteryLevel);
    droid1.performTask("romancing");
    //System.out.println(droid1.batteryLevel);
    droid1.performTask("KILL ALL HUMANS!");
    //System.out.println(droid1.batteryLevel);

    droid1.energyReport();

    droid1.energyRecharge();

    droid1.energyReport();


/*
Create new instances and play around with methods. Here are some ideas to get you started:

Create a energyReport() method that prints the instance’s batteryLevel.

Create another instance.

Create a method energyTransfer() that exchanges batteryLevel between instances.
*/
  
  }


}
