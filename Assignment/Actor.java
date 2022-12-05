package assignment;

public class Actor extends People{
    // 2 : people 클래스를 상속 받아 배우의 이름과 출생연도를 저장

    public Actor(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString(){
        return "이름 : " + name + " | 출생연도 : " + year + "년";
    }
}
