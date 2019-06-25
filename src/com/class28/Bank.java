package com.class28;

public interface Bank {
void hasChecking();
void hasSaving();
void hasCreditCard();

}
class BOA implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("BOA HAS BLA BLA");	
		
	}

	@Override
	public void hasSaving() {
		System.out.println("BOA HAS BLA BLA");
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA HAS BLA BLA");
	}
	
}
class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("PNC HAS BLA BLA");
		
	}

	@Override
	public void hasSaving() {
		System.out.println("PNC HAS BLA BLA");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC HAS BLA BLA");
		
	}
	
}