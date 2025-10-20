package game.action;

import game.GameCharacter;
import game.Position;

/** Knight 전용: 말을 타고 이동하는 구현 */
public class HorseMove implements MoveBehavior {
    @Override
    public void move(GameCharacter self, Position destination) {
        System.out.println(self.getName() + "가 말을 타고 " + destination + "로 이동합니다.");
    }
}
