package kts.pattern.builder;

public class TestPattern1 {
    public static void main(String[] args) {
        Person person = createPerson();
        System.out.println(person);

        Person person2 = Person.builder()
                .name("kts")
                .age(26)
                .address("Seoul")
                .build();

        System.out.println(person2);
    }


    // 멤버 변수가 많으면 값 셋팅이 어려워 진다.
    public static Person createPerson() {
        Person person = new Person();
        person.setName("kts");
        person.setAddress("Seoul");
        person.setAge(26);
        return person;
    }
}
