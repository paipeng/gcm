package com.paipeng.gcm.model;

import com.paipeng.gcm.GCMessage;

public class PushMessage {
	private String appKey;
	private GCMessage gcmMessage;
	
	public PushMessage() {
		
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public GCMessage getGcmMessage() {
		return gcmMessage;
	}

	public void setGcmMessage(GCMessage gcmMessage) {
		this.gcmMessage = gcmMessage;
	}
	
}
