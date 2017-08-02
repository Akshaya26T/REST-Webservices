package org.akshaya.jdo.messenger.testing;

import java.util.HashMap;
import java.util.Map;

import org.akshaya.jdo.messenger.database.DatabaseClass;
import org.akshaya.jdo.messenger.database.DatabaseClassImpl;
import org.akshaya.jdo.messenger.model.Message;
import org.akshaya.jdo.messenger.resources.MessageResource;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageResourceTest {
	
  MessageResource messageResource = new MessageResource();
  Map<Long, Message> messages = new HashMap<>();
  Message message = new Message();
  @Test
  public void getAllMessagesTest() {
	  
	  
	  Assert.assertNotNull(messageResource);
	  
	  Assert.assertEquals(messageResource.getMessages().get(0).getAuthor(), "Akshaya");
	  Assert.assertEquals(messageResource.getMessages().get(0).getMessage(),"Hello World");
	  
  }
  
  @Test
  public void addMessageTest(){
	  Assert.assertNotNull(messageResource);  
	  
	  message.setAuthor("Poo");
	  message.setId(3);
	  message.setMessage("Courageous");
	  
	   
	  
	  messages.put(3L, message);
	  
	  Assert.assertEquals(messages.get(3L).getAuthor(), "Poo");
	  
  }
  
  @Test
  public void updateMessageTest(){
	  Assert.assertEquals(messages.get(3L).getAuthor(), "Poo");
	  
	  message.setAuthor("Poovi");
	  message.setId(3);
	  message.setMessage("Terrific");
	  messages.put(3L,message);
	  
	  Assert.assertEquals(messages.get(3L).getAuthor(), "Poovi");
  }
}
