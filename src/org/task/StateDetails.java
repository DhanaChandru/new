package org.task;

public class StateDetails {
	// Create an object for LanguageInfo and StateDetails  inside the StateDetails class 
	// and call both classes methods also follow the all coding standards.
	// southIndia(),northIndia()
	public void southIndia() {
		System.out.println("South India");
	}
	public void northIndia() {
		System.out.println("North India");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		StateDetails s = new StateDetails();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		s.southIndia();
		s.northIndia();
	}
}
