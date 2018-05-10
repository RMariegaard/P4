import robocode.*;
import java.awt.*;
import static robocode.util.Utils.*;
public class ThisRobot extends AdvancedRobot{
    int[] array = new int[3];
    String CurrentStrategy = "mainStrategy";
    public void run() {
        setBodyColor(Color.pink);
        setGunColor(Color.pink);
        setRadarColor(Color.pink);
        CurrentStrategy = "mainStrategy";
        int[] array = new int[4];
        while(true) {
            if (CurrentStrategy.equals("mainStrategy")){ 
                turnGunRight(10.0);
            }

            if (CurrentStrategy.equals("BeMoreDefensive")){ 
                ahead(100.0);
                turnGunRight(360.0);
                back(100.0);
                turnGunRight(360.0);
            }

        }
    }
    public double absoluteValue(double number){
        if (number < 0.0){ 
            number = number * -1.0;
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

        if (getEnergy() < 60.0){ 
            CurrentStrategy = "BeMoreDefensive";
        }

    }
    if(CurrentStrategy.equals("BeMoreDefensive")){
        fire(3.0);
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
}
public void OnDeath(DeathEvent e){
}
public void onSkippedTurn(SkippedTurnEvent e){
}
}