package com.kie_pract.fooaddition;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Foo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Float num1;
	private java.lang.Float num2;
	private java.lang.Float sum;

	public Foo() {
	}

	public java.lang.Float getNum1() {
		return this.num1;
	}

	public void setNum1(java.lang.Float num1) {
		this.num1 = num1;
	}

	public java.lang.Float getNum2() {
		return this.num2;
	}

	public void setNum2(java.lang.Float num2) {
		this.num2 = num2;
	}

	public java.lang.Float getSum() {
		return this.sum;
	}

	public void setSum(java.lang.Float sum) {
		this.sum = sum;
	}

	public Foo(java.lang.Float num1, java.lang.Float num2, java.lang.Float sum) {
		this.num1 = num1;
		this.num2 = num2;
		this.sum = sum;
	}

}