# 🎮 Game Character

## 📌 프로젝트 개요
이 프로젝트는 다양한 게임 캐릭터(Knight, Archer, Griffin, Shuttle)의 이동과 공격을 시뮬레이션하는 콘솔 기반 프로그램입니다.  
각 캐릭터는 전략 패턴(Strategy Pattern)을 활용하여 이동과 공격 방식을 유연하게 변경할 수 있습니다.

---

## 🏗️ 프로젝트 구조
src/main/java/game/
├── Main.java                # 프로그램 진입점
├── GameCharacter.java       # 모든 캐릭터의 공통 부모 클래스
├── Position.java            # 캐릭터의 좌표를 나타내는 클래스
├── action/                  # 캐릭터의 이동/공격 행동 클래스들
│   ├── MoveBehavior.java
│   ├── AttackBehavior.java
│   ├── WalkMove.java
│   ├── HorseMove.java
│   ├── FlyMove.java
│   ├── NoAttack.java
│   ├── SpearAttack.java
│   ├── ArrowAttack.java
│   ├── LightningAttack.java
└── character/               # 캐릭터 클래스들
    ├── Knight.java
    ├── Archer.java
    ├── Griffin.java
    └── Shuttle.java

---

## ⚙️ 실행 방법

### ✅ 1. Gradle 빌드
gradlew build

### ✅ 2. 프로그램 실행
gradlew run

> 💡 IntelliJ에서 실행 시  
> - 상단 메뉴 → Run → Edit Configurations  
> - VM 옵션에 아래 내용 추가:
>   -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8

---

## 📊 실행 예시
Knight1가 Shuttle1에 탑승합니다.  
Knight2가 Shuttle1에 탑승합니다.  
Shuttle1가 날아서 (10, 10)로 이동합니다.  
Griffin1가 날아서 (10, 10)로 이동합니다.  
Knight1가 Archer1을 창으로 찌릅니다.  
Archer1가 Griffin1를 화살로 공격합니다.  
Griffin1가 Shuttle1를 공격할 수 없습니다. (공중 유닛)

---

## 🧩 사용된 디자인 패턴
- 전략 패턴 (Strategy Pattern):  
  이동(이동 전략)과 공격(공격 전략)을 객체로 분리하여 런타임에 동작을 변경할 수 있게 설계했습니다.

---

## 🪄 제출 정보
- 리포지토리 이름: game-character  
- GitHub 주소: https://github.com/kodulgi/game-character.git  
- 제출 조건:  
  - Gradle 프로젝트 (gradlew build, gradlew run 가능 상태)  
  - README.md 포함 (실행 명령어 기재 완료)

---

## 👨‍💻 작성자
- 이름: 코둘기  
- 제출일: 2025.10.20
