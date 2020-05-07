package vds.htcmnh.spi.impl.techcombank;

import org.springframework.stereotype.Component;
import vds.htcmnh.spi.IBankServiceHelper;
import vds.htcmnh.spi.common.ClientRequest;
import vds.htcmnh.spi.common.ServiceType;

@Component
public class TechcombankServiceHelper implements IBankServiceHelper {

    @Override
    public void validate(ClientRequest clientRequest) {

    }

    @Override
    public ServiceType getServiceType(String processCode) {
        return null;
    }
}
