class AccessModifiersDemo {

    private int privateVar = 15;


    double defaultVar = 20.0;


    protected boolean protectedVar = true;


    public String publicVar = "Hello";


    public int getPrivateVar() {
        return privateVar;
    }

    double getDefaultVar() {
        return defaultVar;
    }


    protected boolean getProtectedVar() {
        return protectedVar;
    }


    public String getPublicVar() {
        return publicVar;
    }
}

class SubclassDemo extends AccessModifiersDemo {

    void displayProtectedVar() {
        boolean value = getProtectedVar();
        System.out.println("ProtectedVar in Subclass: " + value);
    }
}

 class l32 {
    public static void main(String[] args) {

        AccessModifiersDemo demo = new AccessModifiersDemo();

        System.out.println("PrivateVar: " + demo.getPrivateVar());
        System.out.println("DefaultVar: " + demo.getDefaultVar());
        System.out.println("ProtectedVar: " + demo.getProtectedVar());
        System.out.println("PublicVar: " + demo.getPublicVar());


        SubclassDemo subDemo = new SubclassDemo();


        subDemo.displayProtectedVar();
    }
}
