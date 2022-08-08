package com.galvanize;

public class Main
{
    public static void main(String[] args)
    {
        if(args.length < 1)
        {
            System.out.println("Please specify a name and email.");
        }
        else if(args.length == 1)
        {
            System.out.println("Please specify an email for " + args[0]);
        }
        else if(args.length > 1)
        {
            System.out.println(String.format("%s", args[0]) + " " + "<" + args[1] + ">");
        }
        else
        {
            System.out.println(String.format("%s", args[0]) + " " + "<" + args[1] + ">");
        }
    }
}