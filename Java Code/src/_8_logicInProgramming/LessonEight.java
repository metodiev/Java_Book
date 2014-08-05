package _8_logicInProgramming;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;


public class LessonEight {

	public static void main (String[] args) {
		MonsterTwo.buildBattleBoard();
		
		char[][] tempBattlelBoard = new char[10][10];
		
		MonsterTwo[] Monsters = new MonsterTwo[4];
		
		//MonsterTwo(int newHealth, int newAttack, int newMovement, String name)
		
		Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
		Monsters[1] = new MonsterTwo(500, 40, 2, "Drac");
		Monsters[2] = new MonsterTwo(1000, 20, 1, "Paul");
		Monsters[3] = new MonsterTwo(1000, 20, 1, "George");
		
		MonsterTwo.redrawBoard();
		
		// lesson 10
		for (MonsterTwo m : Monsters) {
			if (m.getAlive())
			{
				int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
				m.moveMonster(Monsters, arrayItemIndex);
				
			}
		}
		MonsterTwo.redrawBoard();
	}
}
