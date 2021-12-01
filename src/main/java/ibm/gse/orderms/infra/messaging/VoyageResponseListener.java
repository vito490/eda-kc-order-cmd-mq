package ibm.gse.orderms.infra.messaging;

import ibm.gse.orderms.domain.service.ShippingOrderService;
import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class VoyageResponseListener {

    static final Logger logger = LoggerFactory.getLogger(VoyageResponseListener.class);

    @Incoming("voyage-responses")
    @Blocking
    public void process(String response) throws InterruptedException {
        logger.info("Received voyage response " + response);
    }
}
