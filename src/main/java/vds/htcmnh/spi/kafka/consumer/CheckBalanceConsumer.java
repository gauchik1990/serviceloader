package vds.htcmnh.spi.kafka.consumer;

import org.springframework.stereotype.Component;
import vds.htcmnh.spi.BankServiceSPI;
import vds.htcmnh.spi.BankServiceSPIFactory;
import vds.htcmnh.spi.common.ClientRequest;

import javax.management.ServiceNotFoundException;
import java.util.Objects;

@Component
public class CheckBalanceConsumer {

    public void onReceived(ClientRequest request) throws ServiceNotFoundException {
        BankServiceSPI serviceInstance = BankServiceSPIFactory.getBankServiceInstance(request);
        if (Objects.isNull(serviceInstance)) {
            throw new ServiceNotFoundException();
        }
        int balance = serviceInstance.getBalance(request);
        //TODO: send balance back to job service
    }
}
