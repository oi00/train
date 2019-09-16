package trainOptional;

import java.util.Optional;


/**
 * Optional学習用
 * Optionalは値がNullかを判定できる。
 * 関数の戻り値を返す際に、戻り値の型をOptionalにすることで
 * 戻り値がNullの可能性があることを明示できる。
 */
public class TrainOptional {

	public static void main(String arg) {
		Optional<String> hogeOpt = Optional.ofNullable(getHoge()); // 値をラップする
		hogeOpt.ifPresent(hoge -> System.out.println(hoge.length())); // 値が存在する場合のみ実行
	}

	private static String getHoge() {
		return "";
	}
}
