# 전략 패턴

#### 정의
  - 여러 알고리즘을 하나의 추상적인 접근점(인터페이스)을 만들어 접근점에서 알고리즘이 서로 교환 가능하도록 하는 패턴
     - 동일 목적 알고리즘의 선택 적용 문제
  - 인터페이스
     - 기능에 대한 선언 (구현과의 분리)
     - 여러가지 기능을 사용하기 위한 단일 통로

#### 사용 사례
  1. 워드 문서에서 프린터, 폰트 사용
  2. 정수 배열에 대해 사용하는 정렬 알고리즘
  3. 게임 캐릭터의 무기 (교체 후) 사용