
public class Experiment {

	public static void main(String[] args) {
		boolean recalled;
		String modelName = "Extravagant";
		int modelYear = 2000;
		boolean test;
		recalled =  (modelName.equals("Extravagant") & ((1999 <= modelYear) & (modelYear <= 2002))) || (modelName.equals("Guzzler") & ((2004 <= modelYear) & (modelYear <= 2007)));
		System.out.print(recalled);

}
}
