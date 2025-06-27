package WithoutFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GpayClass extends Gpay {
	double initalBalance;
	String FileName = "GapyTranscations.txt";

	public GpayClass(double initalBalance) {
		this.initalBalance = initalBalance;
	}

	@Override
	double checkBalance() {
		return initalBalance;

	}

	@Override
	void withdraw(double amount) {

		try {
			File file = new File(FileName);
			System.out.println(file.getAbsolutePath());
			if (file.createNewFile()) {
				System.out.println("created");
			} else {
				System.out.println("Already Existed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}   
		initalBalance -= amount;

		try {
			FileWriter writer = new FileWriter(FileName);
			writer.write("This amount " + amount + " as withdraw successfully");
			System.out.println("Content added");
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(FileName))) {
			BufferedReader line = reader;
			System.out.println("Reading from file:");
			System.out.println(line.readLine());
			line.close();
		} catch (Exception e) {

		}

	}

	@Override
	void deposit(double amount) {
		initalBalance += amount;
		System.out.println("This amount " + amount + " as deposit successfully");
	}

}
