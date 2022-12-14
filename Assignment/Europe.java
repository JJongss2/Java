package assignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Europe extends Region implements fun{
    // 2, 5 : 다형성과 클래스 상속
    // name에는 국가 명칭 저장
    // 각 나라별 한류인식, 소비, 파급효과 설명 파일을 txt파일에 저장시켜서 파일을 불러와서 출력하게끔 함수를 구현했다.

    public Europe(){
        name = "유럽";
    }

    // 4 : 예외처리 사용
    // A()는 한류 소비
    @Override
    public void A() {
        try{
            //파일 객체 생성
            File file = new File("C:\\Users\\JJong__ss\\Desktop\\study_java\\src\\main\\java\\assignment\\europe_A.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }
            //.readLine()은 끝에 개행문자를 읽지 않는다.
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
    }

    // B()는 한류 소비
    @Override
    public void B() {
        try{
            //파일 객체 생성
            File file = new File("C:\\Users\\JJong__ss\\Desktop\\study_java\\src\\main\\java\\assignment\\europe_B.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }
            //.readLine()은 끝에 개행문자를 읽지 않는다.
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }

    }

    // C()는 한류 소비
    @Override
    public void C() {
        try{
            //파일 객체 생성
            File file = new File("C:\\Users\\JJong__ss\\Desktop\\study_java\\src\\main\\java\\assignment\\europe_C.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }
            //.readLine()은 끝에 개행문자를 읽지 않는다.
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }

    }
}
