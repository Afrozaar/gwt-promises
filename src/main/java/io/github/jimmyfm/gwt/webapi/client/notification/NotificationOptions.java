package io.github.jimmyfm.gwt.webapi.client.notification;

import com.google.gwt.json.client.JSONObject;

import jsinterop.annotations.JsProperty;

public class NotificationOptions extends JSONObject {

	@JsProperty
	public native void setBody(String body);
}