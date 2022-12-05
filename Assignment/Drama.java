package assignment;

import java.util.ArrayList;

public class Drama {
    // 7 : ArrayList를 생성하고 Actor클래스를 기준으로 저장할 변수를 받음
    private ArrayList<Actor> arrayList;

    public Drama(){
        arrayList = new ArrayList<Actor>();
    }

    // arrayList에 저장
    public void addActor(Actor actor){
        arrayList.add(actor);
    }

    // arrayList 값을 꺼내 정보 출력
    public void showAllActor(){
        for(Actor actor : arrayList){
            System.out.println(actor);
        }
        System.out.println();
    }
}
