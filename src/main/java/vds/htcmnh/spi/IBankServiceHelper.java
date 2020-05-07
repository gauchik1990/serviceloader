package vds.htcmnh.spi;

import vds.htcmnh.spi.common.ClientRequest;
import vds.htcmnh.spi.common.ServiceType;

public interface IBankServiceHelper {
    void validate(ClientRequest clientRequest);
    ServiceType getServiceType(String processCode);
}
