import robocode.*;
import java.awt.*;
public class ThisRobot extends AdvancedRobot{
    String CurrentStrategy = "Default";
    public void run() {
        setBodyColor(Color.pink);
        setGunColor(Color.pink);
        setRadarColor(Color.pink);
        while(true) {
            turnGunRight(10.0);
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
    if(strategy.equals("mainStrategy")){
        double absoluteBearing = getHeading() + e.getBearing();
        double bearingFromGun = normalRelativeAngleDegrees(absoluteBearing - getGunHeading());
        if (absoluteValue(bearingFromGun) <= 3.0){ 
            turnGunRight(bearingFromGun);
            if (getGunHeat() == 0.0){ 
                fire(minimumValue(3.0 - absoluteValue(bearingFromGun),getEnergy() - 0.1));
            }

        }

        if (bearingFromGun == 0.0){ 
            scan();
        }

    }
}
public void onWin(WinEvent e){
    if(strategy.equals("mainStrategy")){
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