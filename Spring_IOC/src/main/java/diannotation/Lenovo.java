package diannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("laptop1")
public class Lenovo implements Laptop{

    @Autowired
    @Qualifier("storage1")

    private  Storage storage;

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void getType() {
        System.out.println("Lenovo Laptop");
    }

    @Override
    public void getStorage() {
       storage.getStorageType();
    }
}
