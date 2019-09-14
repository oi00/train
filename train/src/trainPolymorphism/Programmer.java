package trainPolymorphism;

public class Programmer extends Worker {
	Programmer(String name) {
		super(name);
	}

	@Override
	void working() {
		System.out.print("業務内容：プログラミング");
	}
}
