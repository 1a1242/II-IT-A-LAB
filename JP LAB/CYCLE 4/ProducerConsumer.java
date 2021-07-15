class queue
{
    int n;
    boolean value = false;
    synchronized int getItem()
    {
         while(!value)
	{
	    try
	    {
		wait();
	    }
	    catch(InterruptedException e)
	    {
		System.out.println("InterruptedException Caught");
	    }
	}
	System.out.println("Consumed:" +n);
        value = false;
	try 
	{
	    Thread.sleep(1000);
	} 
	catch (InterruptedException e)
	{
	    System.out.println("InterruptedException Caught");
	}
	notify();
	return n;
    }
    synchronized void putItem(int n) 
    {
	while (value)
	    try 
	    {
		wait();
	    }
	    catch (InterruptedException e)
	    {
		System.out.println("InterruptedException Caught");
	    }
	this.n = n;
	value = true;
	System.out.println("Produced: " +n);
	try 
	{
	    Thread.sleep(1000);
	}
	catch (InterruptedException e)
	{
	    System.out.println("InterruptedException Caught");
	}
	notify();
    }
}
class Producer implements Runnable
{
    queue q;
    Producer(queue q)
    {
	this.q = q;
	new Thread(this, "Producer").start();
    }
    public void run() 
    {
	int i = 0;
	while(true) 
	{
	    q.putItem(i++);
	}
    }
}
class Consumer implements Runnable
{
    queue q;
    Consumer(queue q)
    {
        this.q = q;
	new Thread(this, "Consumer").start();
    }
    public void run() 
    {
	while(true) 
	{
	    q.getItem();
	}
    }
}
class ProducerConsumer
{
    public static void main(String args[])
    {
	queue q = new queue();
	new Producer(q);
	new Consumer(q);
    }
}
