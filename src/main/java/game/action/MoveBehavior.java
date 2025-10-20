package game.action;

import game.GameCharacter;
import game.Position;

/**
 * 이동 전략 인터페이스 (Strategy)
 * - 캐릭터 유형마다 다른 이동 방식을 구현체로 교체 가능
 */
public interface MoveBehavior {
    void move(GameCharacter self, Position destination);
}
