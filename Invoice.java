import java.util.*;
import java.util.stream.*;

class Invoice {
    int id;

    Invoice(int i) {
        id = i;
    }
}

public class CreateInvoice {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(1, 2, 3);

        List<Invoice> list = ids.stream()
                                .map(Invoice::new)
                                .toList();

        System.out.println(list.size());
    }
}