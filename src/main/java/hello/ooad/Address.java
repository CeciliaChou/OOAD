package hello.ooad;

import javax.persistence.Embeddable;

@Embeddable
public class Address{
    private String postCode;
    private String addrInfo;
	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @return the addrInfo
	 */
	public String getAddrInfo() {
		return addrInfo;
	}
	/**
	 * @param addrInfo the addrInfo to set
	 */
	public void setAddrInfo(String addrInfo) {
		this.addrInfo = addrInfo;
	}
}