package com.micmiu.tutorial.webservice.xfire.server;

import com.micmiu.tutorial.webservice.xfire.services.HelloService;
import com.micmiu.tutorial.webservice.xfire.services.impl.HelloServiceImpl;
import org.codehaus.xfire.XFire;
import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.aegis.AegisBindingProvider;
import org.codehaus.xfire.aegis.type.Configuration;
import org.codehaus.xfire.aegis.type.DefaultTypeMappingRegistry;
import org.codehaus.xfire.server.http.XFireHttpServer;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import org.codehaus.xfire.service.invoker.ObjectInvoker;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 10:07
 */
public class EmbeddedServerStart {

	private static int PORT = 8084;

	XFireHttpServer server;


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" ----> Service  init ...... <---- ");
		try {
			EmbeddedServerStart service = new EmbeddedServerStart();
			service.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" ----> Service  start end. <---- ");
	}

	public void start() throws Exception {

		XFire xfire = XFireFactory.newInstance().getXFire();

		// Create an XFire Service
		ObjectServiceFactory serviceFactory = new ObjectServiceFactory(
				xfire.getTransportManager());


		Service service = serviceFactory.create(HelloService.class);
		service.setProperty(ObjectInvoker.SERVICE_IMPL_CLASS,
				HelloServiceImpl.class);

		// Register the service in the ServiceRegistry
		xfire.getServiceRegistry().register(service);

		// Start the HTTP server

		server = new XFireHttpServer();
		server.setPort(PORT);

		server.start();
		System.out.println(" ====> XFire embedded HTTP Server start  success ");
	}

	public void start4MyConf() throws Exception {

		XFire xfire = XFireFactory.newInstance().getXFire();

		// changer default configuration
		Configuration configuration = new Configuration();
		configuration.setDefaultMinOccurs(1);
		configuration.setDefaultNillable(false);
		DefaultTypeMappingRegistry tmr = new DefaultTypeMappingRegistry(null,
				true, configuration);
		AegisBindingProvider bind = new AegisBindingProvider(tmr);


		ObjectServiceFactory serviceFactory = new ObjectServiceFactory(
				xfire.getTransportManager(), bind);

		Service service = serviceFactory.create(HelloService.class,
				"HelloService", null, null);

		// service.setInvoker(new BeanInvoker(new HelloServiceImpl()));
		service.setProperty(ObjectInvoker.SERVICE_IMPL_CLASS,
				HelloServiceImpl.class);

		// Register the service in the ServiceRegistry
		xfire.getServiceRegistry().register(service);

		// Start the HTTP server
		server = new XFireHttpServer();
		server.setPort(PORT);
		server.start();
		System.out.println(" ====> XFire embedded HTTP Server start  success ");
	}


	public void stop() throws Exception {
		server.stop();
	}


}