package cn.heweiming.ws.client.hello;

import org.junit.Test;

public class HelloWebServiceTest {

	@Test
	public void test() {
		HelloWorldService ws = new HelloWorldService();
		HelloWorld helloWorld = ws.getHelloWorldPort();
		String sayHello = helloWorld.sayHello("Jack");
		System.out.println(sayHello);
	}
}
