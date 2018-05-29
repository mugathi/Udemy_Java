import java.util.*;
class FightingTillDie
{
	public static void main(String[] args) {
		Random generator=new Random();
		Scanner in=new Scanner(System.in);
		System.out.println("Your Attack Points");
		int yourAttack=in.nextInt();
		System.out.println("Your Defense Points");
		int yourDefense=in.nextInt();
		System.out.println("Your Damage");
		int yourDamage=in.nextInt();
		System.out.println("Your LifePoints");
		int yourPoints=in.nextInt();
		System.out.println("monster Attack Points");
		int monsterAttack=in.nextInt();
		System.out.println("monster Defense Points");
		int monsterDefense=in.nextInt();
		System.out.println("monster Damage");
		int monsterDamage=in.nextInt();
		System.out.println("monster LifePoints");
		int monsterPoints=in.nextInt();
		boolean runaway;
		do{
		System.out.println("Attack starts");
		boolean attack=generator.nextBoolean();
		int die;
		
		if(attack)
		{
			int attackValue;
			System.out.println("Your Attack");
			die=generator.nextInt(7)+generator.nextInt(7);
			attackValue=die+yourAttack;
			System.out.println("dice Value "+die+"attack points"+attackValue);
			if(attackValue>monsterDefense)
			{
				System.out.println("Your attak was Successful");
				monsterPoints=monsterPoints-yourDamage;
				System.out.println("monster points"+monsterPoints);
			}
			else
			{
			System.out.println("Your attak was not Successful");	
			}
		}
		else 
		{
			int attackValue;
			System.out.println("monster Attack");
			die=generator.nextInt(7)+generator.nextInt(7);
			attackValue=die+monsterAttack;
			System.out.println("dice Value "+die+"attack points"+attackValue);
			if(attackValue>yourDefense)
			{
				System.out.println("Monster attak was Successful");
				yourPoints=yourPoints-monsterDamage;
				System.out.println("your points"+yourPoints);
			}
			else
			{
			System.out.println("Monster attak was not Successful");	
			}
			 System.out.println("Please press ENTER! (Or type in 'run' to run away)");
            String command = sc.nextLine();
            switch (command) {
                case "run":
                    System.out.println("You ran away. You coward! -4 Life Points!");
                    yourPoints -= 4;
                    runaway = true;
                    break;
                default:
            }
		}while(yourPoints>0&&monsterPoints>0&&!runaway);
		if(yourPoints<=0)
			System.out.println("your are dead");
		else if(monsterPoints<=0)
			System.out.printn("monster in dead");
		}
	}
}