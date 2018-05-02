import robocode.*
int target;
Condition WhenEnergyIs40 = new Condition("Tank.Tank.getEnergy() == 40.0")
{
 public boolean test() 
{
 return (Tank.Tank.getEnergy() == 40.0);
};
};
String strategy = "Default"
public void run() {
Tank.Tank.setBodyColor(white);
Tank.Tank.setGunColor(white);
Tank.Tank.setRadarColor(white);
while(true) {
Block}
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
Tank.Tank.fire(i);

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
public void onKeyPressed(KeyEvent e){
public void OnKeyReleased(KeyEvent e){
public void onKeyTyped(KeyEvent e){
public void onMouseClicked(MouseEvent e){
public void onMouseEntered(MouseEvent e){
public void onMouseExited(MouseEvent e){
public void onMousePressed(MouseEvent e){
public void onMouseReleased(MouseEvent e){
public void onMouseMoved(MouseEvent e){
public void onMouseDragged(MouseEvent e){
public void onMouseWheelMoved(MouseWheelEvent e){
public void onStatus(StatusEvent e){
public void onCustomEvent(CustomEvent e){
public void OnDeath(DeathEvent e){
public void onSkippedTurn(SkippedTurnEvent e){
