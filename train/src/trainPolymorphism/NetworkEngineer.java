package trainPolymorphism;

public class NetworkEngineer extends Worker {
	NetworkEngineer(String name) {
		super(name);
	}

	@Override
	void working() {
		System.out.print("業務内容：休日出勤");
	}
}