package game.action;

import game.GameCharacter;

/**
 * Archer 전용 공격: 화살
 * - 지상/공중 모두 공격 가능
 */
public class ArrowAttack implements AttackBehavior {
    @Override
    public void attack(GameCharacter self, GameCharacter target) {
        System.out.println(self.getName() + "가 " + target.getName() + "를 화살로 공격합니다.");
    }
}
