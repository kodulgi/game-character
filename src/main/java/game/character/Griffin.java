package game.character;

import game.GameCharacter;
import game.action.FlyMove;
import game.action.LightningAttack;

/**
 * Griffin 유닛
 * - 이동: 비행
 * - 공격: 번개 (공중 유닛 공격 불가)
 */
public class Griffin extends GameCharacter {
    public Griffin(String name) {
        super(name, true);            // 공중 유닛
        this.moveBehavior = new FlyMove();
        this.attackBehavior = new LightningAttack();
    }
}
