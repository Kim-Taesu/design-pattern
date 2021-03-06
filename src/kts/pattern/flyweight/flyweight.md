# 플라이웨이트 패턴

#### 배경
- 비용이 큰 자원을 공통으로 사용할 수 있도록 만드는 패턴
  1. 중복 생성될 가능성이 높은 경우
     - 동일한 자원이 자주 사용될 가능성이 매우 높다는 것을 의미한다.
     - 이런 자원은 공통 자원 형태로 관리해 주는 편이 좋다.
  2. 자원 생성 비용은 큰데 사용 빈도가 낮은 경우
     - 요청이 있을 때에 생성해서 제공


#### 정의
  - 자원 생성과 제공을 책임진다.
  - 자원의 생성을 담당하는 Factory 역할과 관리 역할을 분리하는 것이 좋을 수 있으나, 일반적으로는 두 역할의 크기가 그리 크지 않아 하나의 클래스가 담당하도록 구현

#### 장점
  1. 많은 객체를 만들 때 성능을 향상시킬 수 있다.
  2. 많은 객체를 만들 때 메모리를 줄일 수 있다.
  3. state pattern과 쉽게 결합도리 수 있다.

#### 단점
  1. 특정 인스턴스의 공유 컴포넌트를 다르게 행동하기 하는 것이 불가능하다.
     - 개별 설정 불가능