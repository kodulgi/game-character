package game.action;

import game.GameCharacter;

/**
 * Griffin 전용 공격: 번개 내리치기
 * - 공중 유닛은 공격 불가
 */
public class LightningAttack implements AttackBehavior {
    @Override
    public void attack(GameCharacter self, GameCharacter target) {
        if (target.isFlying()) {
            System.out.println(self.getName() + "가 " + target.getName() + "를 공격할 수 없습니다. (공중 유닛)");
            return;
        }
        System.out.println(self.getName() + "가 " + target.getName() + "에게 번개를 내리칩니다.");
    }
}
