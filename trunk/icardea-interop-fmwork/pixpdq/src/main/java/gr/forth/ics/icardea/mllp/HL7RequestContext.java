package gr.forth.ics.icardea.mllp;

public class HL7RequestContext {

	public static class HL7RequestContextInfo {
		String localAddress;
		String remoteAddress;
		HL7RequestContextInfo(String laddr, String raddr) {
			this.localAddress = laddr;
			this.remoteAddress = raddr;
		}
	}
	// Thread local variable containing HL7 request information
    private static final ThreadLocal<HL7RequestContextInfo> ctx_ =  new ThreadLocal<HL7RequestContextInfo>();

    public static void setAddresses(String laddr, String raddr) {
    	ctx_.set(new HL7RequestContextInfo(laddr, raddr));
    }
    public static String getLocalAddress() {
        return ctx_.get().localAddress;
    }
    public static String getRemoteAddress() {
        return ctx_.get().remoteAddress;
    }
}
