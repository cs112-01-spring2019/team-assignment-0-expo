public class CoinDriver
{
	public static void main(String[] args)
	{
		Coin coin1, coin2;

		coin1 = new Coin();
		coin2 = new Coin();


		coin1.flip();
		coin2.flip();


		System.out.println("Coin 1:" + coin1 +", Coin 2:" + coin2);
	}
}