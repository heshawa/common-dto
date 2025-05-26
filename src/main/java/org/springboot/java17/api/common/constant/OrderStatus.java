package org.springboot.java17.api.common.constant;

public enum OrderStatus{
	NEW("New"),
	PAID("Paid"),
	PROCESSING("Processing"),
	COMPLETED("Completed"),
	CANCELLED("Cancelled");

	private String status;

	OrderStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
