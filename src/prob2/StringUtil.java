package prob2;

public class StringUtil {

	public static String concatenate(String[] str) {
		// 문자열을 결합하여 리턴하는 메소드 구현
		String str2 = "";
		for (int i = 0; i < str.length; i++) {
			str2 += str[i];
		}
		return str2;
	}

	public static void main(String args[]) {
		String[] strArr = { "SuperMan", "BatMan", "SpiderMan" };
		String resultStr = concatenate(strArr);
		System.out.println("결과 문자열 : " + resultStr);
	}
}
