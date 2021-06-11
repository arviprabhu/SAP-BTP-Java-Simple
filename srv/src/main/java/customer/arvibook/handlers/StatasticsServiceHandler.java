package customer.arvibook.handlers;

import java.util.stream.Stream;

import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;

import org.springframework.stereotype.Component;

import cds.gen.statservice.StatService_;
import cds.gen.statservice.Orders;

@Component
@ServiceName(StatService_.CDS_NAME)
public class StatasticsServiceHandler implements EventHandler {

    @After(event = CqnService.EVENT_READ)
	public void orderChange(Stream<Orders> orders) {

	orders.filter(order -> order.getModifiedBy() != null)
		 .forEach(order -> order.setModifiedBy("MR."+ order.getModifiedBy()));
	
	}

    
}
