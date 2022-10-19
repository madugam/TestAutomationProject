package org.example.testPrg;

public class SampleProgm {
    String name, msg;
    SampleProgm()
    {
        name = "madugam";
        msg = "success in git";
    }
    public static void main(String[] main)
    {
        SampleProgm con = new SampleProgm();
        System.out.print(con.name + " -- " + con.msg);
    }

}
