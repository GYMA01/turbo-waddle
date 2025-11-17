package lab2;

import ru.ifmo.se.pokemon.*;
import pokemon.*;
import move.*;
// https://pokemondb.net/pokedex/chatot

public class Main {
	
	
	public static void main(String[] args) {
		
		Battle b = new Battle();
		Pokemon p1 = new Chatot("Mr Pokemon",1);
		Pokemon p2 = new Baltoy("Monstrik",5);
		Pokemon p3 = new Claydol("Clay",1);
		Pokemon p4 = new Budew("Bubble",1);
		Pokemon p5 = new Roselia("Rose",17);
		Pokemon p6 = new Roserade("Mister Rosa",18);

		b.addAlly(p1);
		b.addFoe(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addAlly(p5);
		b.addFoe(p6);
		
		
		b.go();
		
		
	}
	
}