package pl.sternik.mm.robocode;

import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class Muffin extends Robot {
    public void run(){
        setBodyColor(Color.PINK);
        setGunColor(Color.WHITE);
        setRadarColor(Color.RED);

        setScanColor(Color.YELLOW);
        setBulletColor(Color.ORANGE);

        while(true){
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e){
        fire(1);
    }
}
