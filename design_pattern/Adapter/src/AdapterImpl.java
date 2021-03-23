
public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
		//return (float)Math.twoTime(f.doubleValue());
		//구현 클래스에서 Adapter, Main 클래스를 건드리지 않고 알고리즘 변경을 할 수 있다.
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("절반 함수 호출 시작");
		return (float)Math.half(f.doubleValue());
	}

}
