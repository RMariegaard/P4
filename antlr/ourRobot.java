import robocode.*;
import java.awt.*;
import static robocode.util.Utils.*;
public class ThisRobot extends AdvancedRobot{
    String CurrentStrategy = "Default";
    public void run() {
        setBodyColor(Color.pink);
        setGunColor(Color.pink);
        setRadarColor(Color.pink);
        CurrentStrategy = "mainStrategy";
        while(true) {
            turnGunRight(10.0);
            if (getEnergy() < 30.0){ 
                CurrentStrategy = "BeMoreDefensive";
            }

        }
    }
    public double absoluteValue(double number){
        if (number < 0.0){ 
            number = number * (1.0 - 2.0);
        }

        return number;
    }
    public double minimumValue(double num1, double num2){
        if (num1 < num2){ 
            return num1;
        }
        else{
            return num2;
        }

    }

    public void onCustomEvent(CustomEvent e){ 
}
public void onBulletHit(BulletHitEvent e){
}
public void onBulletHitBullet(BulletHitBulletEvent e){
}
public void onBulletMissed(BulletMissedEvent e){
}
public void onDeath(DeathEvent e){
}
public void onHitByBullet(HitByBulletEvent e){
}
public void onHitRobot(HitRobotEvent e){
}
public void onHitWall(HitWallEvent e){
}
public void onRobotDeath(RobotDeathEvent e){
}
public void onScannedRobot(ScannedRobotEvent e){
    if(CurrentStrategy.equals("mainStrategy")){
        double absoluteBearing = getHeading() + e.getBearing();
        double bearingFromGun = normalRelativeAngleDegrees(absoluteBearing - getGunHeading());
        if (absoluteValue(bearingFromGun) <= 3.0){ 
            turnGunRight(bearingFromGun);
            if (getGunHeat() == 0.0){ 
                fire(minimumValue(3.0 - absoluteValue(bearingFromGun),getEnergy() - 0.1));
            }

        }
        else{
            turnRight(bearingFromGun);
        }

        if (bearingFromGun == 0.0){ 
            scan();
        }

    }
    if(CurrentStrategy.equals("BeMoreDefensive")){
        double absoluteBearing2 = getHeading() + e.getBearing();
        double bearingFromGun2 = normalRelativeAngleDegrees(absoluteBearing2 - getGunHeading());
        if (absoluteValue(bearingFromGun2) <= 3.0){ 
            turnGunRight(bearingFromGun2);
            if (getGunHeat() == 0.0){ 
                fire(minimumValue(3.0 - absoluteValue(bearingFromGun2),getEnergy() - 0.1));
            }

        }
        else{
            turnRight(bearingFromGun2);
        }

        if (bearingFromGun2 == 0.0){ 
            scan();
        }

    }
}
public void onWin(WinEvent e){
    if(CurrentStrategy.equals("mainStrategy")){
        turnRight(36000.0);
    }
    if(CurrentStrategy.equals("BeMoreDefensive")){
        turnRight(36000.0);
    }
}
public void onRoundEnded(RoundEndedEvent e){
}
public void onBattleEnded(BattleEndedEvent e){
}
public void onStatus(StatusEvent e){
    if(CurrentStrategy.equals("BeMoreDefensive")){
        ahead(50.0);
        back(50.0);
    }
}
public void OnDeath(DeathEvent e){
}
public void onSkippedTurn(SkippedTurnEvent e){
}
}