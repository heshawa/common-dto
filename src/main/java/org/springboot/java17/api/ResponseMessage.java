package org.springboot.java17.api;

import java.util.ArrayList;
import java.util.List;

public class ResponseMessage<T> {
	private String message;
	private boolean success = true;

	private List<T> data;

	public ResponseMessage() {
		// Needed for Jackson deserialization
	}

	public ResponseMessage(String message) {
		this.message = message;
	}

	public ResponseMessage(boolean success, String message,List<T> data){
		this.success = success;
		this.message = message;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<T> getData() {
		if(data == null){
			data = new ArrayList();
		}
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
