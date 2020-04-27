package GirlApp;

import java.util.Scanner;

public class girl {
private String name;
private int eyes;
private int smile;
private int upperBody;
private int lowerBody;
private int legs;
private int smarts;
private int hair;
private int athletic;
private int lds;
private int funny;
private Scanner in;
public girl() {
	System.out.print("Enter girl's name: ");
	in = new Scanner(System.in);
	name = in.nextLine();
	if(name.equals("grace") || name.equals("voe")) {
		eyes= 100;
		smile= 100;
		lowerBody= 100;
		smarts= 100;
		hair= 100;
		athletic= 100;
		upperBody = 100;
		legs = 100;
		lds = 100;
		funny = 100;
	}
	else if(name.length() <= 5) {
		eyes= 5;
		lowerBody= 0;
		upperBody = 0;
		legs = 6;
		smile =5;
		smarts=5;
		hair=6;
		athletic=7;
		lds = 8;
		funny = 4;
	}
	else {
		eyes=6;
		smile=4;
		lowerBody=0;
		upperBody = 0;
		legs = 6;
		smarts=5;
		hair=3;
		athletic=8;
		lds = 0;
		funny = 5;
	}
}

public void isCute() {
	int a = (eyes + hair + smile)/3;
	System.out.println(
			"Cuteness level: " + a + "/10" +
			"\n smile: " + smile + "/10" +
			"\n eyes: " + eyes + "/10" +
			"\n hair: " + hair + "/10"
			);
	
}

public void isSexy() { 
	int a = (lowerBody + legs + upperBody)/3;
		System.out.println(
				"sexiness level: " + a + "/10" +
						"\n upper body: " + upperBody + "/10" +
						"\n lower body: " + lowerBody + "/10" +
						"\n legs: " + legs + "/10"
				);
	
}
public void everythingElse() {
	int a = (lds + smarts + athletic+ funny)/4;
	System.out.println(
			"Everything Else: " + a + "/10" +
			"\n lds: " + lds + "/10" +
			"\n athletic: " + athletic + "/10" +
			"\n smarts: " + smarts + "/10" + 
			"\n funny: " + funny + "/10"
			);
}

public void isPerfect() {
	if(name.equals("grace") || name.equals("voe"))
		System.out.println("Perfect: yes");
	else
		System.out.println("Perfect: no");
	
}
public void average() {
	int a = (eyes + upperBody + smarts + hair + athletic+ smile + lowerBody + legs + lds + funny)/10;
	System.out.println("Overall: " + a + "/10");
}


}
