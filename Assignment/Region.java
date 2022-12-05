package assignment;

public class Region implements fun{
    // 5 : 다형성(인터페이스)
    public String name; // 지역이름

    @Override
    public void A() {
        System.out.println("한류인식입니다.");
    }

    @Override
    public void B() {
        System.out.println("한류소비입니다.");
    }

    @Override
    public void C() {
        System.out.println("한류파급효과입니다.");
    }
}
