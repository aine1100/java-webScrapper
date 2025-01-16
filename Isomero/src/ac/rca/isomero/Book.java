package ac.rca.isomero;

/**
 * this is a class called Books which is helping in sorting books in the rca library
 * use of comparable and more
 * @ is used to show key that java will understand
 * @author aine rca student
 * @see  Comparable
 * @see  Object#hashCode
 * @see Object #equals
 * see is like read more
 * @see {@link <a href='https://www.oracle.documentation.com'><a/>}
 */
public class Book implements Comparable {
    /**
     * Identifier of the book as the book id
     */
    private Integer id;
    /**
     * name of the books which is a unique name
     */
    private String name;
    /**
     * the full names of the person who wrote the book
     */
    private String author;
    /**
     * the amount or price of the book on the market
     */
    private Integer price;

    /**
     * this is the  default constructor for our class
     */

    public Book(){

    }

    /**
     *this is a parameterized constructor for our class book with four params id,name,author and price
     * @param id id of the book
     * @param name name of the book
     * @param author full names of the one who wrote the book
     * @param price the amount of the book on the price
     */
    public Book(Integer id,String name,String author,int price ){
        this.id=id;
        this.name=name;
        this.author=author;
        this.price=price;
    }

    /**
     *
     * @return id getting the value of book id
     */


    public Integer getId() {
        return id;
    }

    /**
     *
     * @return id of the book
     */
    public Integer getIdOfBook(){
        return this.id;
    }

    /**
     *
     * @param identifier set id of book
     */

    public void setId(Integer identifier) {
        this.id = identifier;
    }

    /**
     *
     * @return name getting the name of book
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @param name of book
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return author getting author name
     */

    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author set author name
     */

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return price of book on the market
     */

    public int getPrice() {
        return price;
    }

    /**
     *
     * @param price of the book
     */

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     *
     * @return the all information of the book through to string
     */
    @Override
    public  String toString(){
        return "ID= "+this.id + " name="+this.name + " author="+this.author+ " price="+this.price;
    }

    /**
     *
     * @param O the book object as a parameter used for comparison
     * @return the compared output
     * just used for comparison of the books starting on the book id,then name, then author name,and then price
     */

    public int compareTo(Object O) {
        Book book = (Book) O;
        if (this.id.compareTo(book.id) != 0) {
            return this.id.compareTo(book.id);
        }
        ;
        if (this.name.compareTo(book.name) != 0) {
            return this.name.compareTo(book.name);
        }
        if (this.author.compareTo(book.author) != 0) {
            return this.author.compareTo(book.author);
        }
        if (this.price.compareTo(book.price) == 0) {
            return this.price.compareTo(price);
        };



        return -1;
    }

    /**
     *
     * @param O the object of books which is used in sorting through comparison
     * @return the sorted
     * checks the equality things
     */
    public boolean equals(Object O){
        Book b=(Book) O;
        return this.id.equals(b.id)&this.author.equals(b.author)&this.name.equals(b.name)&this.price.equals(b.price);

    }

    /**
     *
     * @return the hashcode value of certain book object
     */

    public int hashCode(){
        return  this.id.hashCode()+this.name.hashCode()+this.price.hashCode()+this.author.hashCode();
    }







}
