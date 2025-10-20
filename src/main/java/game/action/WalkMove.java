package game.action;

import game.GameCharacter;
import game.Position;

/** Archer 전용: 걸어서 이동하는 구현 */
public class WalkMove implements MoveBehavior {
    @Override
    public void move(GameCharacter self, Position destination) {
        System.out.println(self.getName() + "가 걸어서 " + destination + "로 이동합니다.");
    }
}
