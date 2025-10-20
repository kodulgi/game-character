package game.action;

import game.GameCharacter;

/**
 * Knight 전용 공격: 창으로 찌르기
 * - 공중 유닛은 공격 불가
 */
public class SpearAttack implements AttackBehavior {
    @Override
    public void attack(GameCharacter self, GameCharacter target) {
        if (target.isFlying()) {
            System.out.println(self.getName() + "가 " + target.getName() + "를 공격할 수 없습니다. (공중 유닛)");
            return;
        }
        System.out.println(self.getName() + "가 " + target.getName() + "를 창으로 찌릅니다.");
    }
}
