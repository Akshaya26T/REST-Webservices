package org.akshaya.jdo.messenger.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.akshaya.jdo.messenger.database.DatabaseClass;
import org.akshaya.jdo.messenger.database.DatabaseClassImpl;
import org.akshaya.jdo.messenger.services.MessageServices;

//Message Service Class Test

public class MessageServiceTest {
  @Test
  public void getMessageTest() {
	  
	  String a = "Hello World";
	  Assert.assertEquals(a, "Hello World");
	  DatabaseClass db = new DatabaseClassImpl();
	  MessageServices messageservice = new MessageServices(db);
	  Assert.assertNotNull(messageservice);
	  
	  Assert.assertEquals(messageservice.getMessage(1).getAuthor(), "Akshaya");
	  Assert.assertEquals(messageservice.getMessage(1).getId(), 1);
	  Assert.assertEquals(messageservice.getMessage(1).getMessage(), "Hello World");
	  
	  //Object actualOutput = messageservice.getMessage(1);
	//Object expectedOutput

  }
}



 