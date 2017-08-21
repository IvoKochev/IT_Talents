
public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	public void insertSimCard(String newSimMobileNumber) {
		boolean isNumber = true;
		for (int i = 0; i < newSimMobileNumber.length()-1; i++) {
			if (newSimMobileNumber.charAt(i) < '0' || newSimMobileNumber.charAt(i) > '9') {
				isNumber = false;
				System.out.println("Wrong number!");
				break;
			}
		}
		if (isNumber && newSimMobileNumber.length() == 10 && newSimMobileNumber.substring(0, 2).equals("08")) {
			hasSimCard = true;
			simMobileNumber = newSimMobileNumber;
		} else {
			System.out.println("Invalid length of the number or invalid number!");
		}
	}

	public void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = null;
		outgoingCallsDuration = 0;
		lastIncomingCall = null;
		lastOutgoingCall = null;
	}
	
	public void call(GSM receiver, double callDuration) {
		if(callDuration <= 0) {
			System.out.println("Invalid length of the conversation!");
			return;
		}
		if(receiver.simMobileNumber.equals(simMobileNumber)) {
			System.out.println("It is the same GSM!");
			return;
		}
		if(!receiver.hasSimCard || !hasSimCard) {
			System.out.println("The GSM's don't have sim cards!");
			return;
		}
		Call conversation = new Call();
		conversation.caller = this;
		conversation.duration = callDuration;
		conversation.receiver = receiver;
		lastOutgoingCall = conversation;
		receiver.lastIncomingCall = conversation;
		
		
	}

	public double getSumForCall() {
		return Call.priceForAMinute*Math.ceil(outgoingCallsDuration);
	}

	public void printInfoForTheLastOutgoingCall() {
		if(lastOutgoingCall != null) {
			System.out.println("Duration: " + lastOutgoingCall.duration + " caller: " 
		+ lastOutgoingCall.caller.simMobileNumber);
		} else {
			System.out.println("There is no last outgoing call!");
		}
	}
	
	public void prinfInfoForTheLastIncomingCall() {
		if(lastIncomingCall != null) {
			System.out.println("Duration: " + lastIncomingCall.duration + " caller: " 
					+ lastIncomingCall.caller.simMobileNumber);
		} else {
			System.out.println("There is no last incoming call!");
		}
		
	}
}
