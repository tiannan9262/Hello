package com.example.test;

import java.lang.reflect.Proxy;

public class proxytest {
    public static void main(String[] args) {
        javadevelop zack = new javadevelop("zack");
        develop zackproxy = (develop) Proxy.newProxyInstance(zack.getClass().getClassLoader(),zack.getClass().getInterfaces(),
                ((proxy, method, args1) ->
                {
                    if (method.getName().equals("code"))
                    {
                        System.out.println("zack is coding");
                        return method.invoke(zack, (Object) args);
                    }
                    if (method.getName().equals("debug"))
                    {
                        System.out.println("zack has no bug");
                        return null;
                    }
                    return null;
                }
        ));
//        zack.code();
//        zack.debug();
        zackproxy.code();
        zackproxy.debug();
    }
}

interface develop{
    void code();
    void debug();
}
class javadevelop implements develop{

    private String name;

    javadevelop(String name)
    {
        this.name = name;
    }
    @Override
    public void code() {
        System.out.println("coding");
    }

    @Override
    public void debug() {
        System.out.println("debuging");
    }
}