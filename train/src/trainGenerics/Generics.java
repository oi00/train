package trainGenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * ジェネリクス学習用
 * 型をクラス、メソッドを呼ぶときに指定できる
 * ただしジェネリクス型で定義したList＜T＞にはAddできない
 * HashMapのように複数のジェネリクス型も定義できる
 */
public class Generics<T> {
	private T t;
	private List<T> list = new ArrayList<T>();

	public void set(T arg) {
		this.t = arg;
	}

	public T get() {
		return this.t;
	}

	public static <T> ArrayList<T> someMethod(T arg) {
		ArrayList<T> list = new ArrayList<T>();
		list.add(arg);
		return list;
	}

	public static <K, V> HashMap<K, V> newHasMap() {
		return new HashMap<K,V>();
	}
}
