package game.action;

import game.GameCharacter;

/**
 * 공격 전략 인터페이스 (Strategy)
 * - 캐릭터 유형마다 다른 공격 방식을 구현체로 교체 가능
 */
public interface AttackBehavior {
    void attack(GameCharacter self, GameCharacter target);
}
