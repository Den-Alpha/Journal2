package ru.mirea.journal
import static org.junit.Assert.*
import static ru.mirea.journal.ActionDoc.DOCUMENT_CREATED
import static ru.mirea.journal.ActionUser.USER_CREATED

class DoJournalTest {
    private Journal j = new DoJournal()
    /** @org.junit.Before
     public void setUp() throws Exception {
     super.setUp()
     }**/

    @org.junit.Test
    void TestAddUserAction() throws Exception {
        //Add user action
        ActionUser a = USER_CREATED;
        int u=55555;
        j.addUserAction(u,a);
    }

    @org.junit.Test
    void TestAddDocumentAction() throws Exception {
        //Add document action
        ActionDoc a = ActionDoc.DOCUMENT_CREATED;
        int u=55555;
        String s="00000";
        j.addDocumentAction(u,s,a);
    }

    @org.junit.Test
    void TestGetUserAction() throws Exception {
        int u = 55555;
        j.addUserAction(u,USER_CREATED);
        ActionUser[] text= j.getUserAction(u);
        // ActionUser[] test2 = new ActionUser[50];
        //test2=ActionUser.USER_CREATED;
        assertEquals(text[0],ActionUser.USER_CREATED);
    }

    @org.junit.Test
    void TestGetDocumentAction() throws Exception {
        String s1="00000"
        j.addDocumentAction(55555,s1,ActionDoc.DOCUMENT_CREATED);
        Information[] text1 = new Information[50];
        Information t = new Information();
        t.setAct(ActionDoc.DOCUMENT_CREATED);
        t.setUI("55555");
        text1=j.getDocumentAction(s1);
        assertEquals(text1[0],t); //equals переопределить в информатион
        /**String s1="00000"
         int user = 55555
         String U;
         ActionUser a;
         Information[] info = new Information[50];
         j.addDocumentAction(user,s1,ActionDoc.DOCUMENT_CREATED)
         for(int i=0;i<50;i++)
         {info[i] = new Information()}
         info[0].setUI(String.valueOf(user))
         info[0].setAct(ActionDoc.DOCUMENT_CREATED)
         Information[] t = new Information[50]
         t[0]=new Information()
         t=j.getDocumentAction(s1)
         U=t[0].getUI()
         a=t[0].getAct();
         assertEquals(a,ActionDoc.DOCUMENT_CREATED)
         //assertEquals(text1[0].getUI(),user);**/
    }
}
