package ibm.gse.orderms.domain.events.order;

public class OrderSpoiltPayload {

	 private String orderID;
	 private String containerID;
	 
	 public OrderSpoiltPayload(String oid, String cid) {
		 this.orderID = oid;
		 this.containerID = cid;
	 }

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getContainerID() {
		return containerID;
	}

	public void setContainerID(String containerID) {
		this.containerID = containerID;
	}

}
