package trainPolymorphism;

/**
 * ポリモーフィズム学習用コード
 * ポリモーフィズムはベースクラスでメソッドを定義して、継承先でそのメソッドの動きを定義する。
 * これにより、呼び出し方は同じでも、クラスごとに振る舞いを変えることができる。
 * ファクトリクラスでどのクラスのインスタンスを生成するかさえ決めてしまえば
 * あとの処理は共通で呼び出せる、ような使い方ができる。
 */
public class Polymorphism {
	public static void main(String[] args) {
		Worker pg = new Programmer("pg:");
		Worker ne = new NetworkEngineer("ne:");
		pg.work();
		ne.work();
		pg.working();
		ne.working();
		pg.finish_working();
		ne.finish_working();
	}
}
