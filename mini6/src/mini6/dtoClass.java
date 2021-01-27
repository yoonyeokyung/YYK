package mini6;

public class dtoClass {
	
	private int price;
	private String style;
	
	
	public dtoClass() {
		
	}
	
	public dtoClass(int price, String style) {
		super();
		this.price = price;
		this.style = style;

	}

	@Override
	public String toString() {
		return "dtoClass [price=" + price + ", style=" + style + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int dtoClass) {
		this.price = dtoClass;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}


	

	

	
	
	
}
