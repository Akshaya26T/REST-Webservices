package org.akshaya.jdo.messenger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.akshaya.jdo.messenger.database.DatabaseClass;
import org.akshaya.jdo.messenger.database.DatabaseClassImpl;
import org.akshaya.jdo.messenger.model.Message;

public class MessageServices {

	private Map<Long, Message> messages;
	
	public MessageServices(DatabaseClass db) {
		messages = db.getMessages();

		//return messages
	}
	
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public void removeMessage(long id) {
		 messages.remove(id);
	}

}

