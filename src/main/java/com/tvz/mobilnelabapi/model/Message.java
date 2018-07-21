package com.tvz.mobilnelabapi.model;

public class Message {
	private static final long serialVersionUID = 7313096346900626034L;
	private String title;
	private String text;
	private String messageType;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

}
