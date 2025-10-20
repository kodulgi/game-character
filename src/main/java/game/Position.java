package game;

/**
 * 2차원 좌표를 표현하는 값 객체(Value Object)
 * - 불변(immutable)로 설계
 */
public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /** 디버깅/로그 출력을 위한 좌표 문자열 */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
