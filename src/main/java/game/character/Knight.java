package game.character;

import game.GameCharacter;
import game.action.HorseMove;
import game.action.SpearAttack;

/**
 * Knight 유닛
 * - 이동: 말 탑승
 * - 공격: 창 찌르기 (공중 유닛 공격 불가)
 */
public class Knight extends GameCharacter {
    public Knight(String name) {
        super(name, false);           // 지상 유닛
        this.moveBehavior = new HorseMove();
        this.attackBehavior = new SpearAttack();
    }
}
