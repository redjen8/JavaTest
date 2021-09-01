import org.jivesoftware.smack.chat2.Chat;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jxmpp.jid.EntityBareJid;

public class SmackChat2 {

    private static XMPPTCPConnection connection;
    private static Chat chat;

    public void initConfig() {
        CharSequence username = "seokwoo";

        try {
            connection = new XMPPTCPConnection(username, "softcamp", "10.11.10.170");
            connection.connect().login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startChat() {
        ChatManager chatManager = ChatManager.getInstanceFor(connection);
        EntityBareJid entityBareJid = 
        
    }

}
