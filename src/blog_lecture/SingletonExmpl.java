package blog_lecture;

public class SingletonExmpl {
    //////////////////////////////////////////////////////////////////
    // 1. 작은 규모 싱글톤 패턴
/*
	private static SingletonExmpl instance = new SingletonExmpl();

//	private SingletonExmpl() {}

	public static SingletonExmpl getInstance() {
		return instance;
	}
*/
    //////////////////////////////////////////////////////////////////
    // 2. static block
/*
	private static SingletonExmpl instance;

	private SingletonExmpl() {}

	static {      // 클래스 로딩시 한번만 실행
		try {
			instance = new SingletonExmpl();
		} catch (Exception e) {
			throw new RuntimeException("Create instance fail. error msg = " + e.getMessage());
		}
	}

	public static SingletonExmpl getInstance() {
		return instance;
	}
*/
    //////////////////////////////////////////////////////////////////
    // 3. lazy init
/*
	private static SingletonExmpl instance;

	private SingletonExmpl() {}

	public static SingletonExmpl getInstance() {
		// 클래스 로딩 시점이 아닌 인스턴스 요청시 생성 but, 멀티 쓰레드 환경에 취약
		if (instance == null) {
			instance = new SingletonExmpl();
		}
		return instance;
	}
*/
    //////////////////////////////////////////////////////////////////
    // 4. thread safe + lazy
    // 그러나 synchronized 키워드는 성능 저하를 발생시킨다.
/*
	private static SingletonExmpl instance;

	private SingletonExmpl() {}

	public static synchronized SingletonExmpl getInstance() {
		if (instance == null) {
			instance = new SingletonExmpl();
		}
		return instance;
	}
*/
    //////////////////////////////////////////////////////////////////
    // 5. holder
    // JVM의 클래스 로더 메커니즘과 클래스 로드 시점을 이용하여 내부 클래스를 통해 생성. 쓰레드 간의 동기화 문제 해결
    private SingletonExmpl() {}

    private static class InnerInstanceClazz {
        private static final SingletonExmpl instance = new SingletonExmpl();
    }

    public static SingletonExmpl getInstance() {
        return InnerInstanceClazz.instance;
    }
}
