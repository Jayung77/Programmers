import java.util.ArrayList;
class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
       char[] cod = code.toCharArray(); 
        
        StringBuilder ret = new StringBuilder(); 
        
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
        return ret.length() == 0 ? "EMPTY" : ret.toString(); 
    }
}