package Design_Pattern.chapter1;

public class AObject {
	
	Ainterface ainterface;
	
	public AObject() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
//		System.out.println("AAA");
//		System.out.println("AAA");
		ainterface.funcA();
		ainterface.funcA();
		
		
		// ~����� �ʿ��մϴ�. �������ּ��� ��� ����
	}
}
