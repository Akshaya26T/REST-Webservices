package org.akshaya.jdo.messenger.testing;

import java.util.HashMap;
import java.util.Map;

import org.akshaya.jdo.messenger.database.DatabaseClass;
import org.akshaya.jdo.messenger.database.DatabaseClassImpl;
import org.akshaya.jdo.messenger.model.Message;
import org.akshaya.jdo.messenger.resources.MessageResource;
import org.akshaya.jdo.messenger.services.MessageServices;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageResourceTest {
  Map<Long, Message> messages = new HashMap<>();
  
  @Test
  public void getAllMessagesTest() {
	  MessageResource messageResource = new MessageResource();
	  Assert.assertNotNull(messageResource);
	  
	  Assert.assertEquals(messageResource.getMessages().get(0).getAuthor(), "Akshaya");
	  Assert.assertEquals(messageResource.getMessages().get(0).getMessage(),"Hello World");
	  
	  
  }
  
  @Test
  public void addMessageTest(){
	  MessageResource messageResource = new MessageResource();
	  
	  Message message = new Message();
	  message.setAuthor("baa");
	  message.setMessage("Courageous");
	  messageResource.addMessage(message);
	  
	  System.out.println("Added message: baa");
	  
	  Assert.assertEquals(message.getAuthor(), "baa");
	  
	  //case 2 -- shouldn't be replaced but existing Poo is getting replaced with laa
	  message.setAuthor("laa");
	  message.setId(3);
	  message.setMessage("Blaa");
	  
	  messageResource.addMessage(message);
	  System.out.println("Added message: laa");
	  Assert.assertEquals(message.getAuthor(), "laa");
	  
	  System.out.println(message.getAuthor());
	  
  }
  
  /*@Test
  public void updateMessageTest(){
	  Message message = new Message();
	  Assert.assertEquals(messages.get(3L).getAuthor(), "Poo");
	  
	  message.setAuthor("Poovi");
	  message.setId(3);
	  message.setMessage("Terrific");
	  messages.put(3L,message);
	  
	  Assert.assertEquals(messages.get(3L).getAuthor(), "Poovi"); 
  }*/
  
}
