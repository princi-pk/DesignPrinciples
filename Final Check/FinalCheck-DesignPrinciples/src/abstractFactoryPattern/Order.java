package abstractFactoryPattern;

public abstract class Order {

	public abstract Product processOrder(Channel channel, ProductType productType);
}
