package prog5prob5;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;

	public Computer(String manufacturer, String processor,int ramSize ,double processorSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public int getRamSize() {
		return ramSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	double computePower() {
		return getRamSize() * getProcessorSpeed();
	}

	@Override
	public String toString() {
		return "Computer [ Manufacturer: " + getManufacturer() + ", Processor: " + getProcessor() + ", Ram-Size: "
				+ getRamSize() + ", Processor Speed: " + getProcessorSpeed() + " ]";
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (!this.getClass().getSimpleName().equals(object.getClass().getSimpleName())) {
			return false;
		}
		Computer computer = (Computer) object;
		if (this.getManufacturer() != computer.getManufacturer() || this.getProcessor() != computer.getProcessor()
				|| this.getRamSize() != computer.getRamSize()|| this.getProcessorSpeed() != computer.getProcessorSpeed()) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int prime = 43;
		int result = 1;
		result = prime*result + getManufacturer().length();
		result += getProcessor().length();
		result += getRamSize();
		Long temp = Double.doubleToLongBits(getProcessorSpeed());
		temp = (temp ^ (temp >>> 31));
		result += temp;
		return result;
	}
	
	
}

	


