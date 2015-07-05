public class Player {
    private static Player instance = null;

    public float life = 100.0f;
    private float power = 20.0f;

    public static Player getPlayer() {
        if (instance == null)
            synchronized (Player.class) {
                if (instance == null)
                    instance = new Player();
            }

        return instance;
    }

    public void damage(float damage) {
        life -= damage;
        System.out.println("****************************************");
        System.out.printf("Player got damage, life left: %.1f", life);
        System.out.println();

        if (life <= 0)
            System.out.println("Whoops! Game over");

        System.out.println("****************************************");
    }

    public void attack(Enemy enemy) {
        System.out.println("****************************************");
        System.out.println("!!Players turn!!");
        enemy.damage(this.power);
        System.out.println("****************************************");
    }
}
