package main;

import java.util.logging.Logger;

import test.Trash;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    private Main() {
    }
    public static void main(String[] args) {
        new Trash().setName("vasya");
        LOG.info("Jenkins test number one ant two");
        real error;
    }
}
