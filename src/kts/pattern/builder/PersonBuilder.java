package kts.pattern.builder;

public class PersonBuilder {
    private String name;
    private Integer age;
    private String address;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person();
        person.setAge(this.age);
        person.setName(this.name);
        person.setAddress(this.address);
        return person;
    }
}
