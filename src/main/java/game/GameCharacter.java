package game;

import game.action.AttackBehavior;
import game.action.MoveBehavior;

/**
 * 모든 캐릭터의 공통 기반 클래스
 * - 이름, 현재 위치, 비행 여부를 보관
 * - 이동/공격은 전략(Strategy) 인터페이스로 분리하여 다형성 제공
 */
public abstract class GameCharacter {
    protected final String name;          // 유닛 이름 (예: Knight1)
    protected Position position = new Position(0, 0); // 현재 좌표
    protected MoveBehavior moveBehavior;  // 이동 전략
    protected AttackBehavior attackBehavior; // 공격 전략
    protected final boolean flying;       // 공중 유닛 여부

    /**
     * @param name   유닛 이름
     * @param flying true면 공중 유닛, false면 지상 유닛
     */
    protected GameCharacter(String name, boolean flying) {
        this.name = name;
        this.flying = flying;
    }

    /** 현재 유닛이 공중 유닛인지 여부 */
    public boolean isFlying() { return flying; }

    /** 유닛 이름 반환 (로그 출력용) */
    public String getName() { return name; }

    /** 지정 좌표로 이동(전략 객체에 실제 동작 위임) */
    public void moveTo(Position destination) {
        moveBehavior.move(this, destination);
        position = destination;
    }

    /** 대상 유닛 공격(전략 객체에 실제 동작 위임, 불가 시 메시지) */
    public void attack(GameCharacter target) {
        if (attackBehavior == null) {
            System.out.println(name + "는(은) 공격할 수 없습니다.");
            return;
        }
        attackBehavior.attack(this, target);
    }
}
