public class SloanesViperFish implements Enemy {

    /*private final sprite EnemyTextureImage;*/
    private AttackStrategy attackStrategy;
    private float life = 57.0f;
    private final float power = 18.0f;

    public SloanesViperFish(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    @Override
    public void attack() {
        /* implement some complex game logic with conditions  */
        /* e.x timing between attacks */
        attackStrategy.attack(power);
    }

    @Override
    public void die() {
        System.out.println("****************************************");
        System.out.println("SloanesViperFish died!");
        System.out.println("****************************************");
        /* game logic for fish disappearing from screen  and reinitializing*/

        this.life = 100;
        /* change fish location to the starting position */
    }

    @Override
    public void damage(float damage) {
        this.life -= damage;

        System.out.println("****************************************");
        System.out.printf("SloanesViperFish got damage, life left: %.1f", this.life);
        System.out.println();
        System.out.println("****************************************");

        if (this.life <= 0)
            this.die();
        else {
            /* execute game login: e.x: disable fish attacking power for 10 seconds */
        }
    }

    @Override
    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }
}
