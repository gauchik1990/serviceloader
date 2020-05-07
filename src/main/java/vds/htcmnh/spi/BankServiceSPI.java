package vds.htcmnh.spi;

import vds.htcmnh.spi.common.ClientRequest;

public interface BankServiceSPI {
    BankServiceSPI getInstance();
    boolean isCompatibleWith(ClientRequest clientRequest);
    void register(ClientRequest clientRequest);
    void send(ClientRequest clientRequest);
    int getBalance(ClientRequest clientRequest);
}
