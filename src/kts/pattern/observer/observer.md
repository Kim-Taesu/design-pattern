# 옵저버 패턴

#### 정의
  -  한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식
  - 일대다 의존성을 정의
  
#### 과정
  - Subject 객체의 `addObserver()` 메소드를 호출해 옵저버로 등록
  - 옵저버들은 check 변수(Subject 객체에서 관리하는 변수)의 값이 변경되는지 감시
  - Subject 객체에서 check 변수의 값이 바뀌면 옵저버들에게 변경을 알린다.
    - `update()` 메소드에서 Subject의 값이 변경된 것 감지

#### 특징
  - `java.util.Observer` 인터페이스와 `java.util.Observable` 클래스를 사용할 수 있다.
  -  `java.util.Observer` 인터페이스를 구현하고 `java.util.Observable` 객체의 `addObserver()` 메소드를 호출하면 옵저버 목록에 추가되고 `deleteObserver()`를 호출하면 옵저버 목록에서 제거된다.
  - 연락을 돌리는 방법은 `java.util.Observable`를 상속받는 주제 클래스에서 `setChanged()` 메소드를 호출해서 객체의 상태가 바뀌었다는 것을 알린 후 `notifyObservers()` 또는  `notifyObserver(Object arg)` 메소드를 호출하면 된다.
  - 옵저버 객체가 연락을 받는 방ㅂ버은 `update(Observable o, Object arg)` 메소드를 구현하기만 하면 된다.
    - `Observable o`에는 연락을 보내는 주제 객체가 인자로 전달
    - `Object arg`에는 `notifyObservers(Object arg)` 메소드에서 인자로 전달된 데이터 객체가 넘어온다.
    
#### 자바 내장 옵저버 패턴의 단점과 한계
  1. `Observable`은 클래스이다.
     - `Observable`가 클래스기 때문에 서브클래스를 만들어야 한다.
     - 다른 슈퍼클래스를 확장하고 있는 클래스에 `Observable`의 기능을 추가할 수 없다.
     - **재사용성에 한계**
  2. `Observable` 클래스의 핵심 메소드를 외부에서 호출할 수 없다.
     - `Observalbe`의 `setChanged()` 메소드는 protected로 선언되어 있다.
     - `Pbservable`의 서브 클래스에서만 `setChanged()`를 호출할 수 있다.
     - `Observalbe`의 서브클래스를 인스턴스 변수로 사용하는 방법은 쓸 수 없다.
     
 #### 사용 사례
   - 버튼클릭 후 실행되는 이벤트