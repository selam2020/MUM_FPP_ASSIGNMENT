package prog8prob4;

public class Marketing {
	String employeName;
	String productName;
	int saleAmount;
	
	Marketing(String employeName,String productName,int saleAmount){
		
	}
	public String getEmployeename() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public String getProductname() {
		return productName;
	}
	public void setProductname(String productName) {
		this.productName = productName;
	}
	public double getSalesamount() {
		return saleAmount;
	}
	public void getSalesamount(int  saleAmount) {
		this.saleAmount = saleAmount;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
