public class AttackStrategyWithElectricity implements AttackStrategy {

    @Override
    public void attack(float power) {
        System.out.println("****************************************");
        System.out.println("!!!Enemies turn!!!");
        System.out.printf("Attacking with electricity. Voltage: %.3f", power);
        System.out.println();
        System.out.println("****************************************");
        Player.getPlayer().damage(power);
    }
}
