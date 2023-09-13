import java.security.*;
import java.util.*;

public class A30 {
    // Java program to demonstrate
// getInfo() method


public class GFG1 {
	public static void main(String[] argv) throws Exception
	{

		try {
			// creating the object of KeyPairGenerator
			KeyPairGenerator sr = KeyPairGenerator.getInstance("DSA", "SUN");

			// getting the Provider of the KeyPairGenerator sr
			// by using method getProvider()
			Provider provider = sr.getProvider();

			// getting the info
			String info = provider.getInfo();

			// printing the string info
			System.out.println("info : " + info);
		}

		catch (NoSuchAlgorithmException e) {

			System.out.println("Exception thrown : " + e);
		}
	}
}

}
