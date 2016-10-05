package test;
import mis.bean.*;

public class OtherTest {
	public static void main(String[] args){
		CustomerBean cb  = new CustomerBean();
		cb.setCarNumber("");
		if(!cb.getCarNumber().equals(""))
		System.out.println(cb.getCarNumber()+"dsdf");
	}
}
