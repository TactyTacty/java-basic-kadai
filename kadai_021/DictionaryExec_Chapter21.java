package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
        dictionary.naiyo();

        // 検索する単語の一覧
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("grape");
        fruitList.add("orage");
        

        // 繰り返し処理で検索
        dictionary.serchMultiple(fruitList);
	}
}
