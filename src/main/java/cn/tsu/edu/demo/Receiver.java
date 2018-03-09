package cn.tsu.edu.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 
 * @author song
 *
 */
@Component
public class Receiver {
	
	@RabbitListener(queues="hello-swf-queue")
	public void process(String msg)
	{
		System.out.println("receiver:"+msg);
	}

}
