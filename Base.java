package com.access.one;

public class Base {
    public void pub() {}
    protected void pro() {}
    void def() {}
    private void pri() {}
}
package com.access.two;
import com.access.one.Base;

public class Derived extends Base {
    public void test() {
        pub();     
        pro();     
      
    }
}
