import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.ChatMessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.RosterEntry;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;

public class XMPPClient extends ChatMessageListener {

	AbstractXMPPConnection connection;

	public void login(String userName, String password) throws Exception {

		XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration.builder()
				.setUsernameAndPassword(userName, password).setServiceName("localhost").setHost("localhost")
				.setPort(5222).setSecurityMode(SecurityMode.disabled) // Do not disable TLS except for test purposes!
				.setDebuggerEnabled(true).build();

		connection = new XMPPTCPConnection(config);
		connection.connect().login();
	}

	/**
	 * Sends the specified text as a message to the other chat participant.
	 * 
	 * @param message
	 * @param to
	 * @throws XMPPException
	 * @throws NotConnectedException
	 */
	public void sendMessage(String message, String to) throws XMPPException, NotConnectedException {
		ChatManager chatManager = ChatManager.getInstanceFor(connection);
		Chat chat = chatManager.createChat(to, this); // pass XmppClient instance as listener for received messages.
		chat.sendMessage(message);
	}

	/**
	 * Displays received messages
	 */
	public void processMessage(Chat chat, Message message) {
		if (message.getType() == Message.Type.chat) {
			System.out.println(chat.getParticipant() + " says: " + message.getBody());
		}
	}

	/**
	 * Displays users (entries) in the roster
	 */
	public void displayBuddyList() {
		Roster roster = Roster.getInstanceFor(connection);
		Collection<RosterEntry> entries = roster.getEntries();

		System.out.println("\n\n" + entries.size() + " buddy(ies):");
		for (RosterEntry r : entries) {
			String user = r.getUser();
			Type presenceType = roster.getPresence(user).getType();
			System.out.println(user + ":" + presenceType);
		}
	}

	public void disconnect() {
		connection.disconnect();
	}

	// public static void main(String args[]) throws Exception {

	// XmppClient c = new XmppClient();
	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// String msg;

	// // Enter your login information here
	// c.login("user1", "s0meP@ssW0rD");

	// // Display online users
	// c.displayBuddyList();

	// System.out.println("Who do you want to talk to? - Type contacts full email
	// address:");
	// String talkTo = br.readLine();

	// System.out.println("All messages will be sent to " + talkTo);
	// System.out.println("Enter your message in the console:");
	// System.out.println("-----\n");

	// while (!(msg = br.readLine()).equals("bye")) {
	// c.sendMessage(msg, talkTo);
	// }

	// c.disconnect();
	// System.exit(0);
	// }

}