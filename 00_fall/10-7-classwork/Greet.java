Greet {
	main( String[] args ) {
	String greeting;
	BigSib richard = new BigSib("Word up");
	BigSib grizz = new BigSib("Hey ya");
	BigSib dotCom = new BigSIb("Sup");
	BigSib tracy =  new  BigSib("Salutations");
	greeting = richard.greet("freshman");
	System.out.println(greeting);
	greeting = tracy.greet("Dr. Spaceman");
	System.out.println(greeting);
	greeting = grizz.greet("Kong Fooey");
	System.out.println(greeting);
	greeting = dotCom.greet("mom");
	System.out.println(greeting);
	}
}
