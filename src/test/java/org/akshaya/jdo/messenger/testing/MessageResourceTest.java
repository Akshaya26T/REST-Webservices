package org.akshaya.jdo.messenger.testing;

import org.akshaya.jdo.messenger.database.DatabaseClass;
import org.akshaya.jdo.messenger.database.DatabaseClassImpl;
import org.akshaya.jdo.messenger.resources.MessageResource;
import org.akshaya.jdo.messenger.services.MessageServices;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageResourceTest {
  @Test
  public void getMessagesTest() {
	  
	  String a = "Hello World";
	  Assert.assertEquals(a, "Hello World");
	  
	  DatabaseClass db = new DatabaseClassImpl();
	  
	  MessageResource messageResource = new MessageResource();
	  Assert.assertNotNull(messageResource);
	  
	  Assert.assertEquals(messageResource.getMessages().get(0).getAuthor(), "Akshaya");
  }
}
