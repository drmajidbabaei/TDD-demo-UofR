package sample.org;

public class Main {

	public static void main(String[] args) {
		OCSPResponder responder = new OCSPResponder(); 
		Certificate cert = new Certificate();
		System.out.println(responder.checkCertificateStatus(cert));

	}
}
