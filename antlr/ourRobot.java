import robocode.*;
import java.awt.*;
import static robocode.util.Utils.*;
public class ThisRobot extends AdvancedRobot{
    double trigger;
    Condition triggerhit = new Condition("triggerhit")
    {
        public boolean test() 
        {
            return (getEnergy() <= trigger);
        }
    };
    String CurrentStrategy = "mainStrategy";
    public void run() {
        addCustomEvent(triggerhit);
        setBodyColor(Color.white);
        setGunColor(Color.white);
        setRadarColor(Color.white);
        trigger = 80.0;
    }

    public void onCustomEvent(CustomEvent e){ 
        if(e.getCondition() == triggerhit){
            if(CurrentStrategy.equals("mainStrategy")){
                trigger = trigger - 20.0;
                turnLeft(65.0);
                ahead(100.0);
            }
        }
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
        }
        public void onWin(WinEvent e){
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