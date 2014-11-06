public class Patron {
    //declares books and name
    String name;
    Book b1, b2, b3;
    
    public Patron(String n)
    {
        //declares books and name
        name = n;
        b1 = null;
        b2 = null;
        b3 = null;
    }
    //if can borrow
    public boolean borrow(Book b){
        boolean canborrow = (b1 == null || b2 == null || b3 == null);
        if (canborrow)
        {
            if (b1 == null)b1=b;
            else if (b2 == null)b2=b;
            else b3=b;
            return true;
        }
        else return false;
    }
    //has book code
    public boolean hasBook(Book b)
    {
        if(b1 == b)return true;
        else if(b2 == b)return true;
        else if(b3 == b)return true;
        else return false;
    }
    //return book
    public boolean returnBook(Book b)
    {
        if(hasBook(b)){
            if(b1 == b)b1 = null;
            else if(b2 == b)b2 = null;
            else b3 = null;
            return true;
        }
        else return false;
    }
    //gets the name
    public String getName()
    {
        return name;
    }
}