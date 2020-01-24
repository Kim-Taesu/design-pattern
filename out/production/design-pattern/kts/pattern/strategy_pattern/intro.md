## 전략 패턴

#### 설명 
- 하나의 RouteStrategy 인터페이스를 만들고 작업에 따라 클래스(Strategy)를 다르게 생성한다.
- 사용자는 원하는 `Strategy`를 `Context`에 전달
  - `Context`는 strategy를 선택할 책임이 없다.


#### 그림 예시

![경로 계획 전략](https://refactoring.guru/images/patterns/diagrams/strategy/structure-indexed.png)
- `Context`에서만 `Strategy` 인터페이스를 통해 특정 작업에 대한 strategy에 대한 참조를 유지한다.
- `Strategy` 인터페이스는 `Context`가 특정 `Strategy`를 실행할 수 있게 `execute()` 메소드를 선언
- `ConcreteStrategies`는 특정 작업 상황의 알고리즘이다.
- `Context`는 특정 작업을 실행할 때마다 참조한 `Strategy` 의 `execute()`메소드를 실행한다.
  - `context'에서는 알고리즘이 어떻게 실행되고 있는지 모른다.
- `Client`는 특정 `Strategy` 구현체를 생성하고 `Context`에 전달한다.
  - `Context`는 `Client`가 runtime 시 `Context`와 연관된 `Strategy`를 대체할 수 있는 `Setter()`메소드 지원


#### 참조

- https://refactoring.guru/design-patterns/strategy