package WadickAbraham;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.util.*;

public class wadickabraham extends Robot{
    public void run(){

        //first write code that runs once
        //eg. set the color
        //get to a known position 



        while(true){
            //this repeasts forever until you die 
            ahead(Math.random() * 400);
            turnGunRight(90);

            turnGunRight(360);
        





        }



    }


    public void onScannedRobot(ScannedRobotEvent e){

            double absoluteBearing = getHeading() + e.getBearing();

            double gunTurn = absoluteBearing - getGunHeading();

            turnGunLeft(gunTurn);
        
    }





}
