package game.character;

import game.GameCharacter;
import game.action.WalkMove;
import game.action.ArrowAttack;

/**
 * Archer 유닛
 * - 이동: 도보
 * - 공격: 화살 (공중 포함 전 범위)
 */
public class Archer extends GameCharacter {
    public Archer(String name) {
        super(name, false);           // 지상 유닛
        this.moveBehavior = new WalkMove();
        this.attackBehavior = new ArrowAttack();
    }
}
