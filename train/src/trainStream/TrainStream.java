package trainStream;

import java.util.Arrays;
import java.util.List;

public class TrainStream {

	//ラムダ式の基本文法
	//(引数) -> { 処理; }
	// (1) 引数と戻り値がある場合
	//(Integer number) -> {
	//    return Math.abs(number) >= 5;
	//}
	// (2) 戻り値がない場合
	//(Integer number) -> {
	//    System.out.println(number);
	//}
	// (3) 引数も戻り値もない場合
	//() -> {
	//    System.out.println("Hello!");
	//}

	public static void testStream() {
		// CollectionからStreamを生成するパターン
		// fillterメソッドは、条件に合致したもののみを抽出する
		List<Integer> numbers = List.of(3, 1, -4, 1, -5, 9, -2, 6, 5, 3, 5);
		numbers.stream().filter(number -> Math.abs(number) >= 3).forEach(System.out::println);
		// 配列からStreamを生成するパターン
		// mapメソッドは、元の値を別の値に変換する
		int[] array = {3, 1, -4, 1, -5, 9, -2, 6, 5, 3, 5};
		Arrays.stream(array).map(number -> number * 3).forEach(System.out::println);

		//parallelメソッドは、Streamの処理をマルチスレッドで実施する。
		numbers.stream().parallel().filter(number -> Math.abs(number) >= 3).forEach(System.out::println);
	}

}
