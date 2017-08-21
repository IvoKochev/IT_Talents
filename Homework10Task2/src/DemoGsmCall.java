
public class DemoGsmCall {

	public static void main(String[] args) {
		GSM ivo = new GSM();
		GSM pesho = new GSM();
		ivo.hasSimCard = true;
		ivo.model = "Iphone 5s";
		ivo.simMobileNumber = "0883315776";
		ivo.outgoingCallsDuration = 34.5;
		pesho.hasSimCard = true;
		pesho.model = "Samsung";
		pesho.simMobileNumber = "0885416774";
		pesho.outgoingCallsDuration = 2.8;
		ivo.call(pesho, 5.4);
		//System.out.println(ivo.outgoingCallsDuration + " " + ivo.lastOutgoingCall.receiver.model);
		//System.out.println(pesho.lastIncomingCall.caller.simMobileNumber);
		ivo.removeSimCard();
		//System.out.println(ivo.lastIncomingCall);
		System.out.println(ivo.hasSimCard + " " + ivo.simMobileNumber );
		ivo.insertSimCard("0885315776");
		System.out.println(ivo.hasSimCard + " " + ivo.simMobileNumber);
		System.out.println(ivo.outgoingCallsDuration);
		
	}

}
