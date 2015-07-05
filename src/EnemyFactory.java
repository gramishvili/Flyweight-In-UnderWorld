import java.util.HashMap;

public class EnemyFactory {
    private static HashMap<String, Enemy> fishPool = new HashMap<String, Enemy>();

    public static Enemy Create(String key){

        if(!fishPool.containsKey(key)) {
            Enemy enemy = null;

            if(key.equals("humpbackfish"))
                enemy = new HumpbackFish(new AttackStrategyWithElectricity());
            else if(key.equals("sloanesviperfish"))
                enemy = new SloanesViperFish(new AttackStrategyWithElectricity());
            else if(key.equals("telescopefish"))
                enemy = new TelescopeFish(new AttackStrategyWithBite());

            fishPool.put(key, enemy);
            return enemy;
        }
        return fishPool.get(key);
    }
}
