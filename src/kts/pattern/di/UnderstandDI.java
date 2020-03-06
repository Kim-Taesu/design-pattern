package kts.pattern.di;

import java.util.Date;

public class UnderstandDI {

    public static void main(String[] args) {
        // 날짜를 구하기 위해 Date 클래스에 의존
        Date date = new Date();
        System.out.println(date);
        getDate(date);

        memberUse1();
        memberUse2(new Member("kts", "laesu"));
    }


    // 약한 결합 : 생성된 것을 주입 받음 (의존 주입)
    public static void getDate(Date d) {
        Date date = d;
        System.out.println(date);
    }

    // 강한 결합
    public static void memberUse1() {
        Member m1 = new Member();
        m1.setName("kts");
        m1.setNickname("laesu");
        System.out.println(m1);
    }

    // 약한 결합 : 생성된 것을 주입 받음 (의존 주입)
    // 다른 클래스의 변화에 안전하게 대응 가능
    public static void memberUse2(Member member) {
        Member anotherMember = member;
        System.out.println(anotherMember);
    }
}

class Member {
    private String name;
    private String nickname;

    public Member() {
    }

    public Member(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}