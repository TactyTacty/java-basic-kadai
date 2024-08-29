package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	// 英単語の辞書として機能するクラス変数
		protected static HashMap<String, String> dictionary = new HashMap<>();
		
		static {
			// dictionaryの初期化
			dictionary.put("apple", "りんご");
			dictionary.put("peach", "桃");
			dictionary.put("banana", "バナナ");
			dictionary.put("lemon", "レモン");
			dictionary.put("pear", "梨");
			dictionary.put("kiwi", "キウイ");
			dictionary.put("strawberry", "いちご");
			dictionary.put("grape", "ぶどう");
			dictionary.put("muscat", "マスカット");
			dictionary.put("cherry", "さくらんぼ");
		}

		public static void main(String[] args) {
			// メインメソッドは特に何も行動しない場合は空でもよい
		}
}
