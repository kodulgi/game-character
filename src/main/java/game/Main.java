package game;

import game.character.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 메인 실행 클래스
 * - 유닛 생성 → 셔틀 탑승 → 이동 → 하차 → 공격 시나리오를 순서대로 실행한다.
 * - 콘솔에 한국어로 진행 상황을 출력한다.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // 유닛 리스트 준비
        List<Knight> knights = new ArrayList<>();
        List<Archer> archers = new ArrayList<>();
        List<Shuttle> shuttles = new ArrayList<>();
        List<Griffin> griffins = new ArrayList<>();

        // Knight 16기
        for (int i = 1; i <= 16; i++) knights.add(new Knight("Knight" + i));
        // Archer 16기
        for (int i = 1; i <= 16; i++) archers.add(new Archer("Archer" + i));
        // Shuttle 4대
        for (int i = 1; i <= 4; i++) shuttles.add(new Shuttle("Shuttle" + i));
        // Griffin 5기
        for (int i = 1; i <= 5; i++) griffins.add(new Griffin("Griffin" + i));

        // 셔틀 탑승: 셔틀 1~4에 순서대로 8명씩 배분 (총 32명)
        int idx = 0;
        for (Knight k : knights) { shuttles.get(idx / 8).board(k); idx++; }
        for (Archer a : archers) { shuttles.get(idx / 8).board(a); idx++; }

        // 목적지 좌표 (예시: (10, 10)) 로 이동
        Position dest = new Position(10, 10);
        for (Shuttle s : shuttles) s.moveTo(dest);
        for (Griffin g : griffins) g.moveTo(dest);

        // 목적지 도착 후 셔틀 전원 하차
        for (Shuttle s : shuttles) s.unloadAll();

        // 공격 시나리오: 요구사항대로 특정 유닛들끼리 공격/불가 출력 확인
        Knight k1 = knights.get(0);
        Knight k2 = knights.get(1);
        Archer a1 = archers.get(0);
        Griffin g1 = griffins.get(0);
        Shuttle sh1 = shuttles.get(0);

        // Knight1 → Knight2, Archer1, Griffin1(불가: 공중), Shuttle1(불가: 공중)
        k1.attack(k2);
        k1.attack(a1);
        k1.attack(g1);
        k1.attack(sh1);

        // Archer1 → Knight1, Archer2, Griffin1, Shuttle1 (모두 가능)
        a1.attack(k1);
        a1.attack(archers.get(1));
        a1.attack(g1);
        a1.attack(sh1);

        // Griffin1 → Knight1, Archer1 (가능), Griffin2/ Shuttle1 (공중 유닛 불가)
        g1.attack(k1);
        g1.attack(a1);
        g1.attack(griffins.get(1));
        g1.attack(sh1);
    }
}
