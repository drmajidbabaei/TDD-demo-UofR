package sample.org;

import java.util.HashMap;
import java.util.Map;

public class OCSPResponder {

private static final Map<String, Boolean> certificateRevocationStatus = new HashMap<>();

	public String checkCertificateStatus (Certificate certificate) {
		String serialNumber = certificate.getSerialNumber();
		
		if (certificateRevocationStatus.containsKey(serialNumber)) {
		return certificateRevocationStatus.get(serialNumber) ? "revoked" : "good";
		} else {
		return "unknown";
	}
}

	public static void revokeCertificate(Certificate certificate) {
		certificateRevocationStatus.put(certificate.getSerialNumber (), true);
	}
	public static void unrevokeCertificate(Certificate certificate) {
		certificateRevocationStatus.put(certificate.getSerialNumber (), false);
	}
}


