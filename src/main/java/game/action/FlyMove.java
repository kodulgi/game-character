package game.action;

import game.GameCharacter;
import game.Position;

/** Griffin/ Shuttle 전용: 날아서 이동하는 구현 */
public class FlyMove implements MoveBehavior {
    @Override
    public void move(GameCharacter self, Position destination) {
        System.out.println(self.getName() + "가 날아서 " + destination + "로 이동합니다.");
    }
}
