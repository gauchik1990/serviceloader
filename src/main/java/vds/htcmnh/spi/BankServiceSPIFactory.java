package vds.htcmnh.spi;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.stereotype.Component;
import vds.htcmnh.spi.common.ClientRequest;

import java.util.List;

@Component
public class BankServiceSPIFactory {

    private BankServiceSPIFactory() {}

    public static BankServiceSPI getBankServiceInstance(ClientRequest request) {
        List<BankServiceSPI> serviceList = SpringFactoriesLoader.loadFactories(BankServiceSPI.class, null);
        for (BankServiceSPI serviceSPI : serviceList) {
            if (serviceSPI.isCompatibleWith(request)) {
                return serviceSPI.getInstance();
            }
        }
        return null;
    }
}
