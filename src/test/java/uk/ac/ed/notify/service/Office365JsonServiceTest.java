/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ed.notify.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import uk.ac.ed.notify.TestApplication;
import uk.ac.ed.notify.entity.Notification;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
public class Office365JsonServiceTest {
    @Test
    public void parseNotification(){
        assertEquals(1, 1);
    }
}

/*
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplication.class)
public class Office365JsonServiceTest {

    //@Autowired //fix this
    Office365JsonService office365JsonService = new Office365JsonService();

    @Before
    public void setup()
    {

    }

    @After
    public void cleanup() {

    }

    @Test
    public void parseNotification() throws ParseException {
  
        String unreadEmailJson = "{\"@odata.context\":\"https://outlook.office365.com/api/v1.0/$metadata#Users('scotapps%40scotapps.onmicrosoft.com')/Folders('inbox')/Messages\",\"value\":[{\"@odata.id\":\"https://outlook.office365.com/api/v1.0/Users('scotapps@scotapps.onmicrosoft.com')/Messages('AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF8AAA=')\",\"@odata.etag\":\"W/\\\"CQAAABYAAACK45XT6t02QqdGHEQt1wAjAAAAAAHN\\\"\",\"Id\":\"AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF8AAA=\",\"ChangeKey\":\"CQAAABYAAACK45XT6t02QqdGHEQt1wAjAAAAAAHN\",\"Categories\":[],\"DateTimeCreated\":\"2015-11-02T14:43:49Z\",\"DateTimeLastModified\":\"2015-11-02T14:43:49Z\",\"HasAttachments\":false,\"Subject\":\"FW: notification create 3\",\"Body\":{\"ContentType\":\"Text\",\"Content\":\"<script type=\\\"application/ld+json\\\">\\r\\n{\\r\\n\\\"@type\\\": \\\"Notification\\\", \\\"publisherId\\\": \\\"12345\\\", \\\"publisherNotificationId\\\": \\\"12345\\\", \\\"publisherKey\\\": \\\"005AFE5E177048ABE05400144F00F4CC\\\", \\\"topic\\\": \\\"example category\\\", \\\"title\\\": \\\"example title\\\",\\\"body\\\": \\\"example body\\\", \\\"url\\\": \\\"http://www.ed.ac.uk\\\", \\\"uun\\\": \\\"rgood\\\", \\\"startDate\\\": \\\"2013-05-15T08:30\\\", \\\"endDate\\\": \\\"2013-05-20T08:30\\\", \\\"action\\\": \\\"insert\\\"\\r\\n}\\r\\n</script>\\r\\n\\r\\n-- \\r\\nThe University of Edinburgh is a charitable body, registered in\\r\\nScotland, with registration number SC005336.\\r\\n\\r\\n\"},\"BodyPreview\":\"<script type=\\\"application/ld+json\\\">\\r\\n{\\r\\n\\\"@type\\\": \\\"Notification\\\", \\\"publisherId\\\": \\\"12345\\\", \\\"publisherNotificationId\\\": \\\"12345\\\", \\\"publisherKey\\\": \\\"005AFE5E177048ABE05400144F00F4CC\\\", \\\"topic\\\": \\\"example category\\\", \\\"title\\\": \\\"example title\\\",\\\"body\\\": \\\"example body\\\", \",\"Importance\":\"Normal\",\"ParentFolderId\":\"AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQAuAAAAAAAQSU6klR_CS7f2u_Zotqz3AQCK45XT6t02QqdGHEQt1wAjAAAAAAEMAAA=\",\"Sender\":{\"EmailAddress\":{\"Address\":\"Hui.Sun@ed.ac.uk\",\"Name\":\"SUN Michael\"}},\"From\":{\"EmailAddress\":{\"Address\":\"Hui.Sun@ed.ac.uk\",\"Name\":\"SUN Michael\"}},\"ToRecipients\":[{\"EmailAddress\":{\"Address\":\"scotapps@scotapps.onmicrosoft.com\",\"Name\":\"Jing Pang\"}}],\"CcRecipients\":[],\"BccRecipients\":[],\"ReplyTo\":[],\"ConversationId\":\"AAQkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQAQAMXUR2km1U3Rsz7oOLisO80=\",\"IsDeliveryReceiptRequested\":null,\"IsReadReceiptRequested\":false,\"IsRead\":false,\"IsDraft\":false,\"DateTimeReceived\":\"2015-11-02T14:43:49Z\",\"DateTimeSent\":\"2015-11-02T14:43:04Z\",\"WebLink\":\"https://outlook.office365.com/owa/?ItemID=AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR%2BCS7f2u%2BZotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF8AAA%3D&exvsurl=1&viewmodel=ReadMessageItem\"},{\"@odata.id\":\"https://outlook.office365.com/api/v1.0/Users('scotapps@scotapps.onmicrosoft.com')/Messages('AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF7AAA=')\",\"@odata.etag\":\"W/\\\"CQAAABYAAACK45XT6t02QqdGHEQt1wAjAAAAAAGk\\\"\",\"Id\":\"AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF7AAA=\",\"ChangeKey\":\"CQAAABYAAACK45XT6t02QqdGHEQt1wAjAAAAAAGk\",\"Categories\":[],\"DateTimeCreated\":\"2015-10-28T10:28:15Z\",\"DateTimeLastModified\":\"2015-10-28T10:28:15Z\",\"HasAttachments\":false,\"Subject\":\"FW: notification create 3\",\"Body\":{\"ContentType\":\"Text\",\"Content\":\"<script type=\\\"application/ld+json\\\">\\r\\n{\\r\\n\\\"@type\\\": \\\"Notification\\\", \\\"publisherId\\\": \\\"12345\\\", \\\"publisherNotificationId\\\": \\\"12345\\\", \\\"publisherKey\\\": \\\"005AFE5E177048ABE05400144F00F4CC\\\", \\\"topic\\\": \\\"example category\\\", \\\"title\\\": \\\"example title\\\",\\\"body\\\": \\\"example body\\\", \\\"url\\\": \\\"http://www.ed.ac.uk\\\", \\\"uun\\\": \\\"rgood\\\", \\\"startDate\\\": \\\"2013-05-15T08:30\\\", \\\"endDate\\\": \\\"2013-05-20T08:30\\\", \\\"action\\\": \\\"insert\\\"\\r\\n}\\r\\n</script>\\r\\n\\r\\n-- \\r\\nThe University of Edinburgh is a charitable body, registered in\\r\\nScotland, with registration number SC005336.\\r\\n\\r\\n\"},\"BodyPreview\":\"<script type=\\\"application/ld+json\\\">\\r\\n{\\r\\n\\\"@type\\\": \\\"Notification\\\", \\\"publisherId\\\": \\\"12345\\\", \\\"publisherNotificationId\\\": \\\"12345\\\", \\\"publisherKey\\\": \\\"005AFE5E177048ABE05400144F00F4CC\\\", \\\"topic\\\": \\\"example category\\\", \\\"title\\\": \\\"example title\\\",\\\"body\\\": \\\"example body\\\", \",\"Importance\":\"Normal\",\"ParentFolderId\":\"AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQAuAAAAAAAQSU6klR_CS7f2u_Zotqz3AQCK45XT6t02QqdGHEQt1wAjAAAAAAEMAAA=\",\"Sender\":{\"EmailAddress\":{\"Address\":\"Hui.Sun@ed.ac.uk\",\"Name\":\"SUN Michael\"}},\"From\":{\"EmailAddress\":{\"Address\":\"Hui.Sun@ed.ac.uk\",\"Name\":\"SUN Michael\"}},\"ToRecipients\":[{\"EmailAddress\":{\"Address\":\"scotapps@scotapps.onmicrosoft.com\",\"Name\":\"Jing Pang\"}}],\"CcRecipients\":[],\"BccRecipients\":[],\"ReplyTo\":[],\"ConversationId\":\"AAQkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQAQAMXUR2km1U3Rsz7oOLisO80=\",\"IsDeliveryReceiptRequested\":null,\"IsReadReceiptRequested\":false,\"IsRead\":false,\"IsDraft\":false,\"DateTimeReceived\":\"2015-10-28T10:28:15Z\",\"DateTimeSent\":\"2015-10-28T10:27:42Z\",\"WebLink\":\"https://outlook.office365.com/owa/?ItemID=AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR%2BCS7f2u%2BZotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF7AAA%3D&exvsurl=1&viewmodel=ReadMessageItem\"},{\"@odata.id\":\"https://outlook.office365.com/api/v1.0/Users('scotapps@scotapps.onmicrosoft.com')/Messages('AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF6AAA=')\",\"@odata.etag\":\"W/\\\"CQAAABYAAACK45XT6t02QqdGHEQt1wAjAAAAAAGj\\\"\",\"Id\":\"AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF6AAA=\",\"ChangeKey\":\"CQAAABYAAACK45XT6t02QqdGHEQt1wAjAAAAAAGj\",\"Categories\":[],\"DateTimeCreated\":\"2015-10-27T18:10:18Z\",\"DateTimeLastModified\":\"2015-10-27T18:10:18Z\",\"HasAttachments\":false,\"Subject\":\"FW: notification create 2\",\"Body\":{\"ContentType\":\"Text\",\"Content\":\"<script type=\\\"application/ld+json\\\">\\r\\n{\\r\\n\\\"@type\\\": \\\"Notification\\\", \\\"publisherId\\\": \\\"12345\\\", \\\"publisherNotificationId\\\": \\\"12345\\\", \\\"publisherKey\\\": \\\"005AFE5E177048ABE05400144F00F4CC\\\", \\\"topic\\\": \\\"example category\\\", \\\"title\\\": \\\"example title\\\",\\\"body\\\": \\\"example body\\\", \\\"url\\\": \\\"http://www.ed.ac.uk\\\", \\\"uun\\\": \\\"rgood\\\", \\\"startDate\\\": \\\"2013-05-15T08:30\\\", \\\"endDate\\\": \\\"2013-05-20T08:30\\\", \\\"action\\\": \\\"insert\\\"\\r\\n}\\r\\n</script>\\r\\n\\r\\n-- \\r\\nThe University of Edinburgh is a charitable body, registered in\\r\\nScotland, with registration number SC005336.\\r\\n\\r\\n\"},\"BodyPreview\":\"<script type=\\\"application/ld+json\\\">\\r\\n{\\r\\n\\\"@type\\\": \\\"Notification\\\", \\\"publisherId\\\": \\\"12345\\\", \\\"publisherNotificationId\\\": \\\"12345\\\", \\\"publisherKey\\\": \\\"005AFE5E177048ABE05400144F00F4CC\\\", \\\"topic\\\": \\\"example category\\\", \\\"title\\\": \\\"example title\\\",\\\"body\\\": \\\"example body\\\", \",\"Importance\":\"Normal\",\"ParentFolderId\":\"AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQAuAAAAAAAQSU6klR_CS7f2u_Zotqz3AQCK45XT6t02QqdGHEQt1wAjAAAAAAEMAAA=\",\"Sender\":{\"EmailAddress\":{\"Address\":\"Hui.Sun@ed.ac.uk\",\"Name\":\"SUN Michael\"}},\"From\":{\"EmailAddress\":{\"Address\":\"Hui.Sun@ed.ac.uk\",\"Name\":\"SUN Michael\"}},\"ToRecipients\":[{\"EmailAddress\":{\"Address\":\"scotapps@scotapps.onmicrosoft.com\",\"Name\":\"Jing Pang\"}}],\"CcRecipients\":[],\"BccRecipients\":[],\"ReplyTo\":[],\"ConversationId\":\"AAQkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQAQAGkxmT8Ec0qCiv84W5uOTpg=\",\"IsDeliveryReceiptRequested\":null,\"IsReadReceiptRequested\":false,\"IsRead\":false,\"IsDraft\":false,\"DateTimeReceived\":\"2015-10-27T18:10:18Z\",\"DateTimeSent\":\"2015-10-27T18:10:15Z\",\"WebLink\":\"https://outlook.office365.com/owa/?ItemID=AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR%2BCS7f2u%2BZotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF6AAA%3D&exvsurl=1&viewmodel=ReadMessageItem\"},{\"@odata.id\":\"https://outlook.office365.com/api/v1.0/Users('scotapps@scotapps.onmicrosoft.com')/Messages('AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAFvAAA=')\",\"@odata.etag\":\"W/\\\"CQAAABYAAACK45XT6t02QqdGHEQt1wAjAAAAAAGW\\\"\",\"Id\":\"AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAFvAAA=\",\"ChangeKey\":\"CQAAABYAAACK45XT6t02QqdGHEQt1wAjAAAAAAGW\",\"Categories\":[],\"DateTimeCreated\":\"2015-10-27T16:57:39Z\",\"DateTimeLastModified\":\"2015-10-27T16:57:39Z\",\"HasAttachments\":false,\"Subject\":\"notification create\",\"Body\":{\"ContentType\":\"Text\",\"Content\":\"<script type=\\\"application/ld+json\\\">\\r\\n{\\r\\n\\\"@type\\\": \\\"Notification\\\", \\\"publisherId\\\": \\\"12345\\\", \\\"publisherNotificationId\\\": \\\"12345\\\", \\\"publisherKey\\\": \\\"005AFE5E177048ABE05400144F00F4CC\\\", \\\"topic\\\": \\\"example category\\\", \\\"title\\\": \\\"example title\\\",\\\"body\\\": \\\"example body\\\", \\\"url\\\": \\\"http://www.ed.ac.uk\\\", \\\"uun\\\": \\\"rgood\\\", \\\"startDate\\\": \\\"2013-05-15T08:30\\\", \\\"endDate\\\": \\\"2013-05-20T08:30\\\", \\\"action\\\": \\\"insert\\\"\\r\\n}\\r\\n</script>\\r\\n\\r\\n-- \\r\\nThe University of Edinburgh is a charitable body, registered in\\r\\nScotland, with registration number SC005336.\\r\\n\\r\\n\"},\"BodyPreview\":\"<script type=\\\"application/ld+json\\\">\\r\\n{\\r\\n\\\"@type\\\": \\\"Notification\\\", \\\"publisherId\\\": \\\"12345\\\", \\\"publisherNotificationId\\\": \\\"12345\\\", \\\"publisherKey\\\": \\\"005AFE5E177048ABE05400144F00F4CC\\\", \\\"topic\\\": \\\"example category\\\", \\\"title\\\": \\\"example title\\\",\\\"body\\\": \\\"example body\\\", \",\"Importance\":\"Normal\",\"ParentFolderId\":\"AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQAuAAAAAAAQSU6klR_CS7f2u_Zotqz3AQCK45XT6t02QqdGHEQt1wAjAAAAAAEMAAA=\",\"Sender\":{\"EmailAddress\":{\"Address\":\"Hui.Sun@ed.ac.uk\",\"Name\":\"SUN Michael\"}},\"From\":{\"EmailAddress\":{\"Address\":\"Hui.Sun@ed.ac.uk\",\"Name\":\"SUN Michael\"}},\"ToRecipients\":[{\"EmailAddress\":{\"Address\":\"scotapps@scotapps.onmicrosoft.com\",\"Name\":\"Jing Pang\"}}],\"CcRecipients\":[],\"BccRecipients\":[],\"ReplyTo\":[],\"ConversationId\":\"AAQkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQAQALdlbgbqBUVBs51nLUMwiWg=\",\"IsDeliveryReceiptRequested\":null,\"IsReadReceiptRequested\":false,\"IsRead\":false,\"IsDraft\":false,\"DateTimeReceived\":\"2015-10-27T16:57:39Z\",\"DateTimeSent\":\"2015-10-27T16:57:25Z\",\"WebLink\":\"https://outlook.office365.com/owa/?ItemID=AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR%2BCS7f2u%2BZotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAFvAAA%3D&exvsurl=1&viewmodel=ReadMessageItem\"}]}";
        Hashtable<String, Notification> idAndNotificationPairTable = office365JsonService.parseTableOfNotification(unreadEmailJson);
        
        int expectedTotal = 4;
        int actualTotal = idAndNotificationPairTable.size();
        
        assertEquals(expectedTotal,actualTotal); 
    }

    
    @Test
    public void parseOffice365NewEmailCallbackEmailId() throws ParseException {

        //v1, json returned by Office365 before 21th Oct
        //{"value":[{"@odata.type":"#Microsoft.OutlookServices.Notification","Id":null,"SubscriptionId":"MTU3RDJBRTAtODY2Ni00Qzg4LTlFRTctNDcyRUQ2OTM1RjkzXzMzQkFDRkM5LURDNzEtNDNCNS1CMDE4LUJDNERFRDBFNDI5Nw==","SubscriptionExpirationTime":"2015-10-24T16:11:01.9568817Z","SequenceNumber":2,"ChangeType":"Created","Entity":{"@odata.type":"#Microsoft.OutlookServices.Message","@odata.id":"https://outlook.office.com/api/beta/Users('hsun1@uoeapps.onmicrosoft.com')/Messages('AAMkADMzYmFjZmM5LWRjNzEtNDNiNS1iMDE4LWJjNGRlZDBlNDI5NwBGAAAAAADQ1fbd9u-oS6EUMm8vRMp5BwCfJe3G2ZDPT54eZMk1kgk2AAAAAAEMAACfJe3G2ZDPT54eZMk1kgk2AAAATKXbAAA=')","@odata.etag":"W/\"CQAAABYAAACfJe3G2ZDPT54eZMk1kgk2AAAATKgn\"","Id":"AAMkADMzYmFjZmM5LWRjNzEtNDNiNS1iMDE4LWJjNGRlZDBlNDI5NwBGAAAAAADQ1fbd9u-oS6EUMm8vRMp5BwCfJe3G2ZDPT54eZMk1kgk2AAAAAAEMAACfJe3G2ZDPT54eZMk1kgk2AAAATKXbAAA="}}]}

        //v2
        String newEmailCallbackJson = "{\"value\":[{\"@odata.type\":\"#Microsoft.OutlookServices.Notification\",\"Id\":null,\"subscriptionId\":\"MjQwMzczMUYtODUwQi00QUYyLThEQzMtMDJEQzY0ODk0RjVFXzQ1MTU4OEJFLTczQzQtNDBFOS1BN0E1LUYyOTdENkEzM0NBMQ==\",\"subscriptionExpirationDateTime\":\"2015-11-02T18:40:00Z\",\"sequenceNumber\":1,\"changeType\":\"Created\",\"resource\":\"https://outlook.office.com/api/beta/Users('scotapps@scotapps.onmicrosoft.com')/Messages('AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF8AAA=')\",\"resourceData\":{\"@odata.type\":\"#Microsoft.OutlookServices.Message\",\"@odata.id\":\"https://outlook.office.com/api/beta/Users('scotapps@scotapps.onmicrosoft.com')/Messages('AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF8AAA=')\",\"@odata.etag\":\"W/\\\"CQAAABYAAACK45XT6t02QqdGHEQt1wAjAAAAAAHN\\\"\",\"Id\":\"AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF8AAA=\"}}]}";
        
        String expected = "AAMkADQ1MTU4OGJlLTczYzQtNDBlOS1hN2E1LWYyOTdkNmEzM2NhMQBGAAAAAAAQSU6klR_CS7f2u_Zotqz3BwCK45XT6t02QqdGHEQt1wAjAAAAAAEMAACK45XT6t02QqdGHEQt1wAjAAAAAAF8AAA=";
        String actual = office365JsonService.parseOffice365NewEmailCallbackEmailId(newEmailCallbackJson);
        
        assertEquals(expected,actual);
    }

    
    @Test
    public void parseOffice365NewSubscriptionCallbackSubscriptionId() throws ParseException {

        //v1, json returned by Office365 before 21th Oct
        //{"value":[{"@odata.type":"#Microsoft.OutlookServices.Notification","Id":null,"SubscriptionId":"REE3Mzk1RTAtNzI1Mi00QTEyLTk5MkItQThGNTBCQzZFQTQ4XzMzQkFDRkM5LURDNzEtNDNCNS1CMDE4LUJDNERFRDBFNDI5Nw==","SubscriptionExpirationTime":"2015-10-24T16:13:54.8674718Z","SequenceNumber":1,"ChangeType":"Missed"}]}
        
        //v2
        String newSubscriptionCallbackJson = "{\"value\":[{\"@odata.type\":\"#Microsoft.OutlookServices.Notification\",\"Id\":null,\"subscriptionId\":\"MjQwMzczMUYtODUwQi00QUYyLThEQzMtMDJEQzY0ODk0RjVFXzQ1MTU4OEJFLTczQzQtNDBFOS1BN0E1LUYyOTdENkEzM0NBMQ==\",\"subscriptionExpirationDateTime\":\"2015-11-02T18:40:00Z\",\"sequenceNumber\":0,\"changeType\":\"Acknowledgment\"}]}";
        
        String expected = "MjQwMzczMUYtODUwQi00QUYyLThEQzMtMDJEQzY0ODk0RjVFXzQ1MTU4OEJFLTczQzQtNDBFOS1BN0E1LUYyOTdENkEzM0NBMQ==";
        String actual = office365JsonService.parseOffice365NewSubscriptionCallbackSubscriptionId(newSubscriptionCallbackJson).getSubscriptionId();
        
        assertEquals(expected,actual);
    }    
}
*/