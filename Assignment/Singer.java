package assignment;

public class Singer extends People{

    // People 클래스를 상속받아 이름과 연도를 사용하고 소속사 agency 변수는 따로 선언
    public String agency;
    public Singer(int year, String name, String agency){
        this.year = year; // 데뷔 연도
        this.name = name; // 이름(그룹)
        this.agency = agency; // 소속사
    }

    // toString을 재정의 하여 원하는 형태로 출력
    @Override
    public String toString(){
        return "이름(그룹명) : " + name + "  |  데뷔연도 : " + year + "년" + "  |  소속사 : " + agency;
    }




}
