package application;

import java.util.Locale;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		BusinessAccount account = new BusinessAccount(13456, "Joao Silva", 100.0, 1000.0);
		
		System.out.println(account);
		

	}

}
