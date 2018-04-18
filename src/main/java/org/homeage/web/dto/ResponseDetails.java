package org.homeage.web.dto;

public final class ResponseDetails {
	public static ResponseDetails createFailedStatus(final StatusCode statusCode, final String message) {
		return new ResponseDetails(false, statusCode, message);
	}

	public static ResponseDetails createSuccessfulStatus() {
		return new ResponseDetails(true, StatusCode.PROCESSED_SUCCESSFULLY, "The request was successful.");
	}

	private boolean wasSuccessful;
	private StatusCode statusCode;
	private String message;

	public ResponseDetails() {
	}

	public ResponseDetails(final boolean wasSuccessful, final StatusCode statusCode, final String message) {
		this.wasSuccessful = wasSuccessful;
		this.statusCode = statusCode;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public StatusCode getStatusCode() {
		return statusCode;
	}

	public boolean getWasSuccessful() {
		return wasSuccessful;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	public void setStatusCode(final StatusCode statusCode) {
		this.statusCode = statusCode;
	}

	public void setWasSuccessful(final boolean wasSuccessful) {
		this.wasSuccessful = wasSuccessful;
	}
}