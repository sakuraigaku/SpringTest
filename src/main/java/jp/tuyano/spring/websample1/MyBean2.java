package jp.tuyano.spring.websample1;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class MyBean2 {
	@Autowired
	private MyBean bean;
	private Date date;

	public MyBean2() {
		super();
		date=Calendar.getInstance().getTime();
	}

	@Bean
	public MyBeanEventListener mybeanEventListener() {
		return new MyBeanEventListener();
	}
	@Bean
	public MyBeanEventService mybeanService() {
		return new MyBeanEventService();
	}

	public MyBean getBean() {
		return bean;
	}

	public void setBean(MyBean bean) {
		this.bean = bean;
	}

	public Date getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "MyBean2 ("+date+");\n"+bean+"\n--end.";
	}
}
