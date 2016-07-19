
public class GeneralTestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*Boolean boo;
		boo=Boolean.parseBoolean();
		System.out.println(boo);
		int i=Integer.parseInt();
		System.out.println(i);*/

		final long DAT_LONGNIL = ((long) 0x80000000);
		System.out.println("longNIL : "+DAT_LONGNIL);
		String str="123   ";
		System.out.println(str);

		int i;
		i=Integer.parseInt(str.toString().trim());
		System.out.println(i);
		GeneralTestClass class1=new GeneralTestClass();
		Class<? extends GeneralTestClass> clas=class1.getClass();
	}

}
