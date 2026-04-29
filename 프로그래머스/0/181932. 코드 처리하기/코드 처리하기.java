import java.util.ArrayList;
class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
       char[] cod = code.toCharArray(); // String(문자열)을 한 글자씩 쪼개서 char 배열(문자 배열)로 변환하는 함수, cod[i]처럼 인덱스로 접근가능
        StringBuilder ret = new StringBuilder(); //글자들을 이어 붙여서 하나의 완성된 문자열을 만들기 위한 '가변 문자열 저장소' 생성  
        for(int i=0; i<code.length(); i++){
            if(mode==0){
                if (cod[i] == '1'){
                    mode = 1;
                } else{
                    if (i % 2 == 0){
                        ret.append(cod[i]);
                    }
                }
            } else {
                if(cod[i] == '1'){
                    mode = 0;
                } else {
                    if(i % 2 == 1){
                        ret.append(cod[i]);
                    }
                }
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString(); // 빌더 형태여서 문자열 형태로 바꿔서 반환
    }
}
