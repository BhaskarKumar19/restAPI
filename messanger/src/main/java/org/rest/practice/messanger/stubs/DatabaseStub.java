package org.rest.practice.messanger.stubs;

import java.util.HashMap;
import java.util.Map;

import org.rest.practice.messanger.modals.Message;

public class DatabaseStub {

	private static Map<Long, Message> messages = new HashMap<>();

	public static Map<Long, Message> getAllMessages() {
		return messages;
	}

}
