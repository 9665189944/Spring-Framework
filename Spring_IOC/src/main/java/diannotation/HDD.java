package diannotation;

import org.springframework.stereotype.Component;

@Component("storage2")
public class HDD implements Storage {
    @Override
    public void getStorageType() {

        System.out.println("HDD is Permanent Storage");
    }
}
