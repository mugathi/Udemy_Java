import java.util.*;
class Fighting
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
	}
}