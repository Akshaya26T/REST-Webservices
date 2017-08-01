package org.akshaya.jdo.messenger.testing;

import org.akshaya.jdo.messenger.database.DatabaseClass;
import org.akshaya.jdo.messenger.database.DatabaseClassImpl;
import org.akshaya.jdo.messenger.services.MessageServices;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageResourceTest {
  @Test
  public void getMessagesTest() {
	  
	  String a = "Hello World";
	  Assert.assertEquals(a, "Hello World");
	  
	  DatabaseClass db = new DatabaseClassImpl();
	  
	  MessageServices messageService = new MessageServices(db);
	  Assert.assertNotNull(messageService);
	  
	  Assert.assertEquals(messageService.getMessage(1).getAuthor(), "Akshaya");
  }
}
