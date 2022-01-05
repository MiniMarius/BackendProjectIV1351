package se.kth.iv1351;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CliAppMain {
    public static void main(String[] args) {
        try {
            new BlockingInterpreter(new Controller()).handleCmds();
        } catch(BankDBException bdbe) {
            System.out.println("Could not connect to Bank db.");
            bdbe.printStackTrace();
        }
    }
}
