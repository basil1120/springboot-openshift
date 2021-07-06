package com.sprintel.main.entities;

public class Status {
	
	private String statusCode;
	private String statusDescription;
	private String statusDateTime;
	private String statusVersion;
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public String getStatusDateTime() {
		return statusDateTime;
	}
	public void setStatusDateTime(String statusDateTime) {
		this.statusDateTime = statusDateTime;
	}
	public String getStatusVersion() {
		return statusVersion;
	}
	public void setStatusVersion(String statusVersion) {
		this.statusVersion = statusVersion;
	}
}
