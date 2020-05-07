package vds.htcmnh.spi.impl.techcombank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vds.htcmnh.spi.BankServiceSPI;
import vds.htcmnh.spi.common.ClientRequest;
import vds.htcmnh.spi.common.ServiceType;
import vds.htcmnh.spi.dao.TransactionRepository;

@Service
public class TechcombankServiceImpl implements BankServiceSPI {

    @Autowired
    private TechcombankServiceHelper techcombankServiceHelper;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public BankServiceSPI getInstance() {
        return this;
    }

    @Override
    public boolean isCompatibleWith(ClientRequest request) {
        //TODO:
        return false;
    }

    @Override
    public void register(ClientRequest clientRequest) {
        techcombankServiceHelper.validate(clientRequest);
        //TODO: save to DB
    }

    @Override
    public void send(ClientRequest clientRequest) {
        ServiceType serviceType = techcombankServiceHelper.getServiceType(clientRequest.getProcessCode());
        switch (serviceType) {
            case card_number: {
                sendByCardNumber(clientRequest);
                break;
            }
            case phone_number: {
                sendByPhoneNumber(clientRequest);
                break;
            }
            case account_number: {
                sendByAccountNumber(clientRequest);
                break;
            }
        }

    }

    private void sendByAccountNumber(ClientRequest clientRequest) {
    }

    private void sendByPhoneNumber(ClientRequest clientRequest) {
    }

    private void sendByCardNumber(ClientRequest clientRequest) {
    }

    @Override
    public int getBalance(ClientRequest clientRequest) {
        //TODO:
        return 0;
    }
}
