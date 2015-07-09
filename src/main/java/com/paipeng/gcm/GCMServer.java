package com.paipeng.gcm;

import com.paipeng.gcm.model.PushMessage;
import com.paipeng.gcm.network.RestClient;

public class GCMServer {
	private static final String GOOGLE_GCM_URL = "https://gcm-http.googleapis.com/gcm/send";
	public GCMServer() {
		
	}
	
	public GCMResult sendMessage(PushMessage pushMessage) {
		RestClient restClient = new RestClient();
		GCMResult result = restClient.sendMessage(GOOGLE_GCM_URL, pushMessage);
		return result;
	}
}
