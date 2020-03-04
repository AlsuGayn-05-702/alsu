package feb_26;
//import feb_19_homeWork.ArrayHandler;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*int[] a = {-1, 5, 6, 2, -40, 53, -7, 15};
        ArrayHandler h = new ArrayHandler(a);
        double av = h.changeSign()
                .relu()
                .withoutNull()
                .changeSign()
                .mid();
        System.out.println(av);*/

//Char = caracter то один символ
        HashMap<Character, String> dict = new HashMap<Character, String>();
        dict.put('а', "a");
        dict.put('б', "b");
        dict.put('в', "v");
        dict.put('г', "g");
        dict.put('д', "d");
        dict.put('е', "e");
        dict.put('ё', "yo");
        dict.put('ж', "zh");
        dict.put('з', "z");
        dict.put('и', "i");
        dict.put('й', "i");
        dict.put('к', "k");
        dict.put('л', "l");
        dict.put('м', "m");
        dict.put('н', "n");
        dict.put('о', "o");
        dict.put('п', "p");
        dict.put('р', "r");
        dict.put('с', "s");
        dict.put('т', "t");
        dict.put('у', "u");
        dict.put('ф', "f");
        dict.put('х', "kh");
        dict.put('ц', "ts");
        dict.put('ш', "sh");
        dict.put('щ', "shch");
        dict.put('ъ', "");
        dict.put('ы', "y");
        dict.put('ь', "");
        dict.put('э', "e");
        dict.put('ю', "yu");
        dict.put('я', "ya");

        dict.put('А', "A");
        dict.put('Б', "B");
        dict.put('В', "V");
        dict.put('Г', "G");
        dict.put('Д', "D");
        dict.put('Е', "E");
        dict.put('Ё', "Yo");
        dict.put('Ж', "Zh");
        dict.put('З', "Z");
        dict.put('И', "I");
        dict.put('Й', "I");
        dict.put('К', "K");
        dict.put('Л', "L");
        dict.put('М', "M");
        dict.put('Н', "N");
        dict.put('О', "O");
        dict.put('П', "P");
        dict.put('Р', "R");
        dict.put('С', "S");
        dict.put('Т', "T");
        dict.put('У', "U");
        dict.put('Ф', "F");
        dict.put('Х', "Kh");
        dict.put('Ц', "Ts");
        dict.put('Ш', "Sh");
        dict.put('Щ', "Shch");
        dict.put('Ъ', "");
        dict.put('Ы', "Y");
        dict.put('Ь', "");
        dict.put('Э', "E");
        dict.put('Ю', "Yu");
        dict.put('Я', "Ya");

        System.out.println(dict.get('ж'));
        System.out.println(dict.get('ы'));
        System.out.println(dict.getOrDefault('ы', "такого элемента нет"));
        String s = "смо три сю да";

        char[] chars = s.toCharArray();
        String result = "";
        for (int i = 0; i <chars.length ; i++) {
            result += dict.getOrDefault(chars[i], chars[i] + "");
        }
        System.out.println("result: "+result);


        char[] chars1 = s.toCharArray();
        String result1 = "";
        for (int i = 0; i < chars1.length-1; i++) {

            if(chars1[i] == (char)32){
                result1 += dict.getOrDefault((char)(chars1[i+1]-32),chars1[i+1] + "");
            }else if(chars1[i] != (char)32){result1 += dict.getOrDefault(chars1[i+1],chars1[i+1] + "");}

        }
        String a = dict.getOrDefault((char)(chars1[0]-32),chars1[0] + "");
        System.out.println("result1: "+ a + result1);
        System.out.println("legth: " + result1.length());
        char c = 'a';
        System.out.println((char)(c-32));//смотри таблицу символов
        //дополнить словарь
        //StringHandler сделать
        //Методы: 1. транслитерация имеющая строки,
        // 2. метод который делает каждую первую букву заглавной,
        //Завершающие методы(не хендлер)
        // 1. возвращает количество символов в строке
        // 2.возвращает количество повторений какого то символа
    }
}