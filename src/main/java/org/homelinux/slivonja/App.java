package org.homelinux.slivonja;

/**
 * Hello world!
 *
 */
public class App {

	private HelloService helloService;
	private String name;

	public App(String arg){
		this.name = arg;
		this.helloService = new HelloServiceImpl();
	}

	public void run(){
		System.out.println(helloService.sayHello(name));
	}

	public static void main(String[] args) {
		String arg = null;

		if(args.length > 0){
			arg = args[0];
		}
		App app = new App(arg);

		app.run();
	}
}
