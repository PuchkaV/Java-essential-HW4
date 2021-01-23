package task2;

public class Main {

    public static void main(String[] args) {

        AbstractHandler xmlhandler = new XMLHandler();
        AbstractHandler txthendler = new TXTHandler();
        AbstractHandler dochendler = new DOCHandler();

        xmlhandler.save();
        xmlhandler.change();
        xmlhandler.create();
        xmlhandler.open();

        System.out.println("----------------");

        txthendler.save();
        txthendler.open();
        txthendler.create();
        txthendler.change();

        System.out.println("----------------");

        dochendler.change();
        dochendler.save();
        dochendler.create();
        dochendler.change();
    }
}
