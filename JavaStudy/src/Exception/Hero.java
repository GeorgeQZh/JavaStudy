package Exception;

/**
 * 参见自定义异常EnemyHeroIsDeadException
 * @author zgq
 *
 */

public class Hero {
	
	public String name;
	protected float hp;
	
	public void attackHero(Hero h) throws EnemyHeroIsDeadException{
		if(h.hp == 0) {
			throw new EnemyHeroIsDeadException(h.name + "已经阵亡了，不需要施放技能");
		}
	}

//	public String toString() {
//		return name;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616;
		
		Hero teemo = new Hero();
				
		teemo.name = "提莫";
		teemo.hp = 0;
		
		try {
			garen.attackHero(teemo);
		}catch(EnemyHeroIsDeadException e) {
			System.out.println("异常的原因："+ e.getMessage());
			e.printStackTrace();
		}

	}

}
