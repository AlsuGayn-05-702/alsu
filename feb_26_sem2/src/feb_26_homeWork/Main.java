//дополнить словарь
//StringHandler сделать
//Методы: 1. транслитерация имеющая строки,
// 2. метод который делает каждую первую букву заглавной,
//Завершающие методы(не хендлер)
// 1. возвращает количество символов в строке
// 2.возвращает количество повторений какого то символа

package feb_26_homeWork;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
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

        String s = "утки летят на пляж";
        DictHandler handler = new DictHandler(s);
        System.out.println(handler);
        //handler = handler.caps();
        System.out.println(handler.length());
    }
}
