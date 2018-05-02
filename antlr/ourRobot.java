import robocode.*
public class ThisRobot extends AdvancedRobot{
    int target;
    Condition WhenEnergyIs40 = new Condition("Tank.Tank.getEnergy() == 40.0")
    {
        public boolean test() 
        {
            return (Tank.Tank.getEnergy() == 40.0);
        }
    }

    String strategy = "default";
    public void run() {
        Tank.Tank.setBodyColor(white);
        Tank.Gun.Tank.Gun.setColor(white);
        Tank.Radar.Tank.Radar.setColor(white);
        while(true) {
            Tank.Tank.ahead(123.0);
            Tank.Gun.Tank.Gun.turnLeft(123.0);
            if (Game.Game.getRoundNum() > 10){ 
                Tank.Tank.fire(2.0);
                Tank.Radar.Tank.Radar.turnRight(200.0);
            }
            else if(Game.getRoundNum() > 5){
                Tank.fire(1.0);
                Tank.Radar.turnRight(100.0);
            }
;
        }
    }
public int myAddFunction(int a, int b){
     int res;
    res++;
    return res;
 }
public void onCustomEvent(CustomEvent e){ 
if(e.getCondition() == WhenEnergyIs40){
if(strategy.equals("Default"({
    for(int i = 0; i <= 5; i++)
{
    Tank.Tank.fire(2.0);

}
;
};
};
};
public void onBulletHit(BulletHitEvent e){
if(strategy.equals("Default"({
    Tank.Tank.turnRight(Bullet.Bullet.getY());
};
public void onBulletHitBullet(BulletHitBulletEvent e){
public void onBulletMissed(BulletMissedEvent e){
public void onDeath(DeathEvent e){
public void onHitByBullet(HitByBulletEvent e){
public void onHitRobot(HitRobotEvent e){
public void onHitWall(HitWallEvent e){
public void onRobotDeath(RobotDeathEvent e){
public void onScannedRobot(OnScannedRobotEvent e){
if(strategy.equals("Default"({
    Tank.Tank.turnRight(Enemy.Enemy.getBearing());
};
public void onWin(WinEvent e){
public void onRoundEnded(RoundEndedEvent e){
public void onBattleEnded(BattleEndedEvent e){
public void onStatus(StatusEvent e){
public void OnDeath(DeathEvent e){
public void onSkippedTurn(SkippedTurnEvent e){
};