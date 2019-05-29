package day_51_inheritance04;

public class AtTheGym {
	public static void main(String[] args) {
		Exercise e =  new Exercise();
		Running r = new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		JuiJitsu j = new JuiJitsu();
		Sprinting sp = new Sprinting();
		
		System.out.println(e.perform(24));
		System.out.println(r.perform(34));
		System.out.println(s.perform(56));
		System.out.println(y.perform(77));
		System.out.println(j.perform(478));
		
		Exercise e2 =  new Exercise();
		System.out.println(e2.perform(33));
		
		System.out.println("===================");
		Snowboarding sn = new Snowboarding();
		System.out.println(sn.perform(100));

	}
}
