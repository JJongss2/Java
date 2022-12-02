package assignment;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import assignment.Beauty;

public class HallyuExample {
    public static void main(String[] args){
        // 전체적으로 while, switch 문을 사용해서 메뉴판 선택을 하는 것과 비슷하게
        // 숫자를 입력받고 그에 대한 정보를 출력할 수 있게끔 만들었다.

        // singer 클래스를 kpop에 속해있는 arrayList에 추가
        Kpop kpop = new Kpop();
        Singer singer1 = new Singer(2013,"방탄소년단","하이브" );
        Singer singer2 = new Singer(2016,"블랙핑크", "YG");
        Singer singer3 = new Singer(2008,"아이유", "이담엔터테인먼트");
        Singer singer4 = new Singer(2001,"싸이", "피네이션");
        kpop.addSinger(singer1);
        kpop.addSinger(singer2);
        kpop.addSinger(singer3);
        kpop.addSinger(singer4);

        // actor 클래스를 drama에 속해있는 arrayList에 추가, 배우는 영화와 드라마 둘 다 필요하므로 하나로 통합
        Drama drama = new Drama();
        Actor actor1 = new Actor("이민호", 1987);
        Actor actor2 = new Actor("현빈", 1982);
        Actor actor3 = new Actor("공유", 1979);
        Actor actor4 = new Actor("송혜교", 1981);
        Actor actor5 = new Actor("송중기", 1985);
        drama.addActor(actor1);
        drama.addActor(actor2);
        drama.addActor(actor3);
        drama.addActor(actor4);
        drama.addActor(actor5);

        // 리스트에 드라마와 영화 리스트 저장, 배열 참조 타입
        String[] dramaList = {"오징어게임", "사랑의 불시착", "빈센조", "펜트하우스", "태양의 후예"};
        String[] movieList = {"기생충", "부산행", "서복","미드나이트", "싱크홀"};

        // hashmap을 사용하여 화장품 재료와 재료의 효과 저장, 컬렉션 프레임 워크 사용
        Map<String, String> map = new HashMap<String, String>();
        map.put("유자", "기미, 색소침착");
        map.put("센델라", "피부진정");
        // map.put("쑥", "진정과 항염효과");
        // map.put("프로바이오틱스", "건조, 염증완화");

        Beauty material = null; // 열거타입 변수 선언

        // 프로그램 설명 : 숫자를 입력 받고 입력받은 숫자값에 따라 한류의 각 분야로 넘어가서 원하는 분야를 볼 수 있게끔 구현함 //
        // 편의성을 위하여 나가기를 선택해도 초기 화면으로 초기화 하지 않고 이전 단계로만 돌아가서 처음부터 다시 선택하는 불편함을 제거함 //

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1.한류 정의");
            System.out.println("2.한류 종류");
            System.out.println("3.지역별 한류 인식");
            System.out.println("4.종료");
            System.out.print(">>> ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("한류(韓流) : 한국의 대중문화 요소가 아시아를 중심으로 해외로 전파되어 인기리에 소비되는 문화현상.");
                    System.out.println();
                    break;
                case 2:
                    while(true) {
                        System.out.println("1.K-POP | 2.드라마 | 3.영화 | 4.음식 | 5.뷰티 | 6.나가기");
                        System.out.print(">>> ");
                        switch (sc.nextInt()) {
                            case 1:
                                kpop.showAllSinger();
                                continue;
                            case 2:
                                int i = 1;
                                for (String lang : dramaList) {
                                    System.out.println(i + "위 : " + lang);
                                    i++;
                                }
                                System.out.println("-----------------------------------");
                                System.out.println("<대표 배우>");
                                drama.showAllActor();
                                continue;
                            case 3:
                                int j = 1;
                                for (String lang : movieList) {
                                    System.out.println(j + "위 : " + lang);
                                    j++;
                                }
                                System.out.println("-----------------------------------");
                                System.out.println("<대표 배우>");
                                drama.showAllActor(); // 드라마, 영화 배우 공통
                                continue;

                            case 4:
                                try ( //요기서 객체를 생성하면 try종료 후 자동으로 close처리됨
                                      //true : 기존 파일에 이어서 작성 (default는 false임)
                                      FileWriter fw = new FileWriter("C:\\Users\\JJong__ss\\Desktop\\study_java\\src\\main\\java\\assignment\\food.txt", true);
                                      BufferedWriter bw = new BufferedWriter(fw);
                                ) {
                                    System.out.println("좋아하는 한식 1가지를 입력하세요 : ");
                                    String a = sc.next();
                                    bw.write(a); //버퍼에 데이터 입력
                                    bw.newLine(); //버퍼에 개행 삽입
                                    bw.flush(); //버퍼의 내용을 파일에 쓰기
                                } catch (IOException e) {
                                    System.out.println(e);
                                }

                                File f = new File("C:\\Users\\JJong__ss\\Desktop\\study_java\\src\\main\\java\\assignment\\food.txt");
                                // 파일 존재 여부 판단
                                if (f.isFile()) {
                                }

                                try (
                                        FileReader rw = new FileReader("C:\\Users\\JJong__ss\\Desktop\\study_java\\src\\main\\java\\assignment\\food.txt");
                                        BufferedReader br = new BufferedReader(rw);
                                ) {

                                    //읽을 라인이 없을 경우 br은 null을 리턴한다.
                                    String readLine = null;
                                    while ((readLine = br.readLine()) != null) {
                                        System.out.println(readLine);
                                    }
                                } catch (IOException e) {
                                    System.out.println(e);
                                }
                                System.out.println();

                                continue;

                            case 5:
                                System.out.println("화장품, 헤어, 네일, 바디케어");
                                System.out.println("-----------------------------------");
                                for(String str : map.keySet()){ //저장된 key값 확인
                                    System.out.println(str + " : " + map.get(str));
                                }
                                System.out.println();
                                System.out.println("추가 성분의 효능을 보고 싶으면 번호를 입력하세요");
                                while(true) {
                                    System.out.println("1.쑥 | 2.프로바이오틱스 | 3.나가기");
                                    System.out.print(">>> ");
                                    switch (sc.nextInt()) {
                                        // 열거 타입 사용
                                        case 1:
                                            material = Beauty.쑥;
                                            System.out.println(material + " : 진정과 항염효과");
                                            System.out.println();
                                            continue;
                                        case 2:
                                            material = Beauty.프로바이오틱스;
                                            System.out.println(material + " : 건조, 염증완화");
                                            System.out.println();
                                            continue;
                                        default:
                                    }
                                    break;
                                }
                                continue;
                            default:
                                System.out.println("이전으로 돌아갑니다.");
                                System.out.println();
                        }
                        break;
                    }
                    continue;

                case 3:
                    System.out.println("1.아프리카 | 2.미주 | 3.아시아 | 4.유럽 | 5.나가기");
                    System.out.print(">>> ");
                    switch (sc.nextInt()) {
                        case 1:
                            Africa africa = new Africa();
                            while(true) {
                                System.out.println(africa.name);
                                System.out.println("1.한류 인식 | 2.한류 소비 | 3.한류 파급효과 | 4.나가기");
                                System.out.print(">>> ");
                                switch (sc.nextInt()) {
                                    case 1:
                                        System.out.println("<한류 인식>");
                                        africa.A();
                                        System.out.println();
                                        continue;
                                    case 2:
                                        System.out.println("<한류 소비>");
                                        africa.B();
                                        System.out.println();
                                        continue;
                                    case 3:
                                        System.out.println("<한류 파급효과>");
                                        africa.C();
                                        System.out.println();
                                        continue;
                                    default:
                                }
                                break;
                            }
                            continue;

                        case 2:
                            Americas americas = new Americas();
                            while(true) {
                                System.out.println(americas.name);
                                System.out.println("1.한류 인식 | 2.한류 소비 | 3.한류 파급효과 | 4.나가기");
                                System.out.print(">>> ");
                                switch (sc.nextInt()) {
                                    case 1:
                                        System.out.println("<한류 인식>");
                                        americas.A();
                                        System.out.println();
                                        continue;
                                    case 2:
                                        System.out.println("<한류 소비>");
                                        americas.B();
                                        System.out.println();
                                        continue;
                                    case 3:
                                        System.out.println("<한류 파급효과>");
                                        americas.C();
                                        System.out.println();
                                        continue;
                                    default:
                                }
                                break;
                            }
                            continue;

                        case 3:
                            Asia asia = new Asia();
                            while(true) {
                                System.out.println(asia.name);
                                System.out.println("1.한류 인식 | 2.한류 소비 | 3.한류 파급효과 | 4.나가기");
                                System.out.print(">>> ");
                                switch (sc.nextInt()) {
                                    case 1:
                                        System.out.println("<한류 인식>");
                                        asia.A();
                                        System.out.println();
                                        continue;
                                    case 2:
                                        System.out.println("<한류 소비>");
                                        asia.B();
                                        System.out.println();
                                        continue;
                                    case 3:
                                        System.out.println("<한류 파급효과>");
                                        asia.C();
                                        System.out.println();
                                        continue;
                                    default:
                                }
                                break;
                            }
                            continue;

                        case 4:
                            Europe europe = new Europe();
                            while(true) {
                                System.out.println(europe.name);
                                System.out.println("1.한류 인식 | 2.한류 소비 | 3.한류 파급효과 | 4.나가기");
                                System.out.print(">>> ");
                                switch (sc.nextInt()) {
                                    case 1:
                                        System.out.println("<한류 인식>");
                                        europe.A();
                                        System.out.println();
                                        continue;
                                    case 2:
                                        System.out.println("<한류 소비>");
                                        europe.B();
                                        System.out.println();
                                        continue;
                                    case 3:
                                        System.out.println("<한류 파급효과>");
                                        europe.C();
                                        System.out.println();
                                        continue;
                                    default:
                                }
                                break;
                            }
                            continue;

                        default:
                            System.out.println("이전으로 돌아갑니다.");
                            continue;
                    }
                case 4:
                    System.out.println("프로그램 종료!");
                    String path = "C:\\Users\\JJong__ss\\Desktop\\study_java\\src\\main\\java\\assignment\\food.txt";

                    // food.txt 내용 초기화
                    try (RandomAccessFile raf = new RandomAccessFile(path, "rw")) {
                        raf.setLength(0);
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.exit(0); // 프로그램 종료시 food.txt 파일에 저장된 내용을 초기화함
                    break;
            }
        }
    }
}
