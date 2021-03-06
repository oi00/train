package trainPolymorphism;

public abstract class Worker {
	String name;

	Worker(String name) {
		this.name = name;
	}

	public void work() {
		System.out.print(name + "業務を開始します");
	}

	public void finish_working() {
		System.out.print(name + "業務を終了します");
	}

	abstract void working();
}
