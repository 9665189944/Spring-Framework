package diannotation;

import org.springframework.stereotype.Component;

@Component("storage1")
public class RAM implements Storage{
    @Override
    public void getStorageType() {

        System.out.println("Ram is Temporary Storage");
    }
}
