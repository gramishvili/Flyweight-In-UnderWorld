public class AttackStrategyWithBite implements AttackStrategy{

    @Override
    public void attack(float power) {
        System.out.println("****************************************");
        System.out.println("!!!Enemies turn!!!");
        System.out.printf("Biting player with power: %.3f", power);
        System.out.println();
        System.out.println("****************************************");
        Player.getPlayer().damage(power);
    }
}
