package model;

public class Payment {
	double montant;
	String mode_payment;
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getMode_payment() {
		return mode_payment;
	}
	public void setMode_payment(String mode_payment) {
		this.mode_payment = mode_payment;
	}
	public Payment(double montant, String mode_payment) {
		super();
		this.montant = montant;
		this.mode_payment = mode_payment;
	}
	public Payment() {
		super();
	}
	
	
}
