package org.akshaya.jdo.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.akshaya.jdo.messenger.model.Message;
import org.akshaya.jdo.messenger.model.Profile;

public class DatabaseClassImpl implements DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public DatabaseClassImpl() {
		messages.put(1L, new Message(1, "Hello World", "Akshaya"));
		messages.put(2L, new Message(2, "Hello Jersey", "Ganga"));
	}

	
	public Map<Long, Message> getMessages() {
		return messages;
	}
	
	public Map<Long, Profile> getProfiles() {
		return profiles;
	}
	
}

