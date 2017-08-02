package org.akshaya.jdo.messenger.database;


import java.util.Map;

import org.akshaya.jdo.messenger.model.Message;
import org.akshaya.jdo.messenger.model.Profile;

public interface DatabaseClass {
	Map<Long, Message> getMessages();
	Map<Long, Profile> getProfiles();
}