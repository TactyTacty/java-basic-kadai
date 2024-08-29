package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		System.out.println("appleの意味は" + dictionary.get("apple"));
		System.out.println("bananaの意味は" + dictionary.get("banana"));
		System.out.println("grapeの意味は" + dictionary.get("grape"));
		
		String Error = dictionary.get("orange");
		if (Error == null) {
			System.out.println("orangeは辞書に存在しません");
		}
	}

}
