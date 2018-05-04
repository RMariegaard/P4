import robocode.*;
import java.awt.*;
public class ThisRobot extends AdvancedRobot{
    int target = 40;
    Condition WhenEnergyIs40 = new Condition("WhenEnergyIs40")
    {
        public boolean test() 
        {
            return (getEnergy() == 40.0);
        }
    };
    String CurrentStrategy = "Default";
    public void run() {
        addCustomEvent(WhenEnergyIs40);
        setBodyColor(Color.white);
        setGunColor(Color.white);
        setRadarColor(Color.white);
        myAddFunction(5,5);
        while(true) {
            CurrentStrategy = Default;
            ahead(123.0);
            turnGunLeft(123.0);
            CurrentStrategy = Offensive;
            if (getNumRounds() > 10){ 
                fire(2.0);
                turnRadarRight(200.0);
            }
            else if(getRoundNum() > 5){
                fire(1.0);
                turnRight(100.0);
            }

        }
    }
    public int myAddFunction(int a, int b){
        int res = a + b;
        res++;
        return res;
    }

    public void onCustomEvent(CustomEvent e){ 
        if(e.getCondition() == WhenEnergyIs40){
            if(strategy.equals("Default")){
                for (int i = 0; i <= 5; i += 2) {
                    fire(2.0);
                }
            }
        }
    }
    public void onBulletHit(BulletHitEvent e){
        if(strategy.equals("Default")){
            turnRight(e.getBullet().getY());
        }
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
        if(strategy.equals("Default")){
            turnRight(e.getBearing());
        }
        if(strategy.equals("Offensive")){
            fire(5.0);
        }
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