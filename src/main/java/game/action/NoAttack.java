package game.action;

import game.GameCharacter;

/** 셔틀 등 공격 불가 유닛에 사용하는 더미 공격 전략 */
public class NoAttack implements AttackBehavior {
    @Override
    public void attack(GameCharacter self, GameCharacter target) {
        System.out.println(self.getName() + "는(은) 공격 기능이 없습니다.");
    }
}
