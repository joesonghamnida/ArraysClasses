public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //this is the arrays and classes assignment

        Thermos safeway = new Thermos();
        safeway.brand="Safeway";
        safeway.thermosType="Useable";
        safeway.contents="Cheap coffee";
        safeway.contentsTemp=65;
        safeway.price=0.0;
        safeway.age=8;
        safeway.colorsAvailable=new String[5];
        //assigning colors to array
        safeway.colorsAvailable[0]="Green";
        safeway.colorsAvailable[1]="Blue";
        safeway.colorsAvailable[2]="Hot Pink";
        safeway.colorsAvailable[3]="Grey";
        safeway.colorsAvailable[4]="White";

        Student ironyardIntake = new Student();
        ironyardIntake.firstName="Joe";
        ironyardIntake.lastName="Morris";
        ironyardIntake.gender='M';
        ironyardIntake.age=27;
        ironyardIntake.grade='A';

        Oven mayflower = new Oven();
        mayflower.brand="Mayflower";
        mayflower.numOfRacks=23;
        mayflower.currTemp=75;
        mayflower.on=false;
        mayflower.underWarranty=true;
        mayflower.recallIssued=false;

        /* Microwave is practice in inheritance. Inherits from Oven class*/
        Microwave trinity = new Microwave();
        trinity.brand="Los Alamos";
        trinity.currTemp=5000;
        trinity.setTimerSeconds=180;
        trinity.cookSettings=new String[3];
        trinity.cookSettings[0]="nuke";
        trinity.cookSettings[1]="charbroil";
        trinity.cookSettings[2]="freeze";


        Elevator towerOfTerror = new Elevator();
        towerOfTerror.inService=true;
        towerOfTerror.weightLimit=2500;
        towerOfTerror.doorsOpeningMelody="Screams of the Damned";
        towerOfTerror.dateLastInspected="NEVER";

        Table thingInGrandmasKitchen = new Table();
        thingInGrandmasKitchen.numOfLegs=3;
        thingInGrandmasKitchen.numOfCorners=7;
        thingInGrandmasKitchen.surfaceType="Linoleum";
        thingInGrandmasKitchen.whereFound="Dumpster";
        thingInGrandmasKitchen.price=0.0f;
        thingInGrandmasKitchen.canGetRefund='N';






    }
}
