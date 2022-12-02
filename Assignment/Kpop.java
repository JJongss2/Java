package assignment;

import java.util.ArrayList;

public class Kpop {

    // ArrayList를 생성하고 Singer클래스를 기준으로 저장할 변수를 받음
    private ArrayList<Singer> arrayList;

    public Kpop(){
        arrayList = new ArrayList<Singer>();
    }

    // arrayList에 저장
    public void addSinger(Singer singer){
        arrayList.add(singer);
    }

    // arrayList 값을 꺼내 정보 출력
    public void showAllSinger(){
        for(Singer singer : arrayList){
            System.out.println(singer);
        }
        System.out.println();
    }

}
