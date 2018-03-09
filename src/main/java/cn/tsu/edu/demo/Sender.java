package cn.tsu.edu.demo;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author song
 *
 */
@Component
public class Sender {
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	public void send()
	{
		String msg="hello"+new Date();
		this.rabbitTemplate.convertAndSend("hello-swf-queue",msg);
	}

}
