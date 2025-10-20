package game.character;

import game.GameCharacter;
import game.action.FlyMove;
import game.action.NoAttack;
import java.util.ArrayList;
import java.util.List;

/**
 * Shuttle 유닛 (수송선)
 * - 이동: 비행
 * - 공격: 불가
 * - 기능: 최대 8명 탑승/하차 관리
 */
public class Shuttle extends GameCharacter {
    private static final int CAPACITY = 8;            // 최대 탑승 인원
    private final List<GameCharacter> passengers = new ArrayList<>(); // 탑승자 목록

    public Shuttle(String name) {
        super(name, true);          // 공중 유닛
        this.moveBehavior = new FlyMove();
        this.attackBehavior = new NoAttack(); // 공격 불가 전략
    }

    /** 유닛 탑승 (정원 초과 시 실패 메시지) */
    public boolean board(GameCharacter unit) {
        if (passengers.size() >= CAPACITY) {
            System.out.println(unit.getName() + "가 " + getName() + "에 탑승하지 못했습니다. (정원 초과)");
            return false;
        }
        passengers.add(unit);
        System.out.println(unit.getName() + "가 " + getName() + "에 탑승합니다.");
        return true;
    }

    /** 전원 하차(요구사항 스타일의 로그 출력 포함) */
    public void unloadAll() {
        System.out.println(getName() + "에서 모든 승객을 내립니다;");
        for (GameCharacter u : passengers) {
            System.out.println(u.getName() + "가 내립니다.");
        }
        passengers.clear();
    }

    /** 현재 탑승자 목록 조회 */
    public List<GameCharacter> getPassengers() {
        return passengers;
    }
}
