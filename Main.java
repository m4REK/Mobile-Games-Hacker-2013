package Hausaufgaben;

public class Main {

	public static void main(String[] args) {
		Teilnehmer teilnehmer = new Teilnehmer("Marko Vukadinovic",
				"vukadinovic.m@live.com", "Student");
		System.out.println(teilnehmer.toString());
		Workshops wShops = new Workshops("Workshop New-Ideas", "22.03.2014");
		wShops.addTeilnehmer(teilnehmer);
		wShops.addTeilnehmer(new Teilnehmer("Giulia De Bilio",
				"giuliett@gmx.de", "Privatperson"));
		System.out.println(wShops.toString());
		Referenten referent = new Referenten("Andreas Plass",
				"andreas.plass@haw-hamburg.de", "HAW-HAMBURG", new Workshops(
						"Mobile Games", "13.11.2014"));
		System.out.println(referent.toString());

	}
}
