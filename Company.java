package org.datatype;

public class Company {
	private void companyDetails(String name) {
		System.out.println("company name is"+ name);

	}
	private void companyDetails(int id) {
		System.out.println("company id is"+ id);

	}
	private void companyDetails(long mobileno) {
	System.out.println("company mobileno is"+ mobileno);

	}
	public static void main(String[] args) {
		Company a=new Company();
		a.companyDetails("infosys");
		a.companyDetails("3386036");
		a.companyDetails("9987654987");
	}

}