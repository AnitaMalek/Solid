package sda.LiskovSubstitution.Customer;

public class Customer {

    // blemu z wykorzystaniem zasady Liskov Substition:
    //abstract class Customer {
    //	abstract int discount(int sales);
    //	void add(Database db){
    //		db.add(this);
    //	}
    //}
    //class Enquiry extends Customer
    //{
    //	@Override
    //    int discount(int sales)
    //    {
    //        return sales * 5;
    //    }
    //
    //	@Override
    //    void add(Database db)
    //    {
    //        throw new Exception("Not allowed");
    //    }
    //}
    //
    //class public BetterGoldCustomer extends Customer
    //{
    //	@Override
    //    int discount(int sales)
    //    {
    //        return sales - 100;
    //    }
    //}
    //
    //class public BetterSilverCustomer extends Customer
    //{
    //	@Override
    //    int discount(int sales)
    //    {
    //        return sales - 50;
    //    }
    //}
}
