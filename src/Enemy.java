public interface Enemy {

    public void attack();

    public void die();

    public void damage(float damage);

    public void setAttackStrategy(AttackStrategy strategy);
}
