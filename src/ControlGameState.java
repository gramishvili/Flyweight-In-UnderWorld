/*
 * This class controls flow of the gameplay
 * it handles level loading, enemy spawning and level difficulty
 * in real scenario you could read level setting from json or xml and customize levels.
 */
public class ControlGameState {
    public void play(int level){
        if(level==1) {

            System.out.println("Starting game ... ");

            Player player = Player.getPlayer();

            Enemy humpBackFish = EnemyFactory.Create("humpbackfish");

            humpBackFish.attack();

            player.attack(humpBackFish);
            player.attack(humpBackFish);

            System.out.println("****************************************");
            System.out.println("Enemy gets closer to the player, so change attack strategy to close battle");
            System.out.println("****************************************");

            humpBackFish.setAttackStrategy(new AttackStrategyWithBite());

            humpBackFish.attack();

            System.out.println("****************************************");
            System.out.println("player got Booster");
            System.out.println("attacking with epic power");
            player.attack(humpBackFish);
            player.attack(humpBackFish);
            player.attack(humpBackFish);

            System.out.println("****************************************");
            System.out.println("More enemies are coming, be careful!");
            System.out.println("****************************************");
        }
    }
}
