package diannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("laptop2")
public class Dell implements Laptop{
    @Autowired
    @Qualifier("storage2")

    private Storage storage;

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void getType() {
        System.out.println("Dell Laptop");
    }

    @Override
    public void getStorage() {
             storage.getStorageType();
    }
}
