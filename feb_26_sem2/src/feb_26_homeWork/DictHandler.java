package feb_26_homeWork;

import java.util.Arrays;
import java.util.HashMap;

public class DictHandler {
    public HashMap<Character, String> dict;
    //public DictHandler (HashMap<Character, String> dict){this.dict = dict;};
    private String s;
    public DictHandler(String s) {
        this.s = s;
    }

    public DictHandler trans() {
        char[] chars = s.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
        result += dict.getOrDefault(chars[i], chars[i] + "");
       }
        s = result;
        return this;
    }

    public DictHandler caps() {
        char[] chars = s.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length-1; i++) {

            if(chars[i] == (char)32){
                result += dict.getOrDefault((char)(chars[i+1]-32),chars[i+1] + "");
            }else if(chars[i] != (char)32){result += dict.getOrDefault(chars[i+1],chars[i+1] + "");}

        }
        String a = dict.getOrDefault((char)(chars[0]-32),chars[0] + "");
        s =  a + result;
        return this;
    }

    public int length(){
        return s.length();
    }

    public int
    @Override
    public String toString() {
        return "s = " + s;
    }
}
