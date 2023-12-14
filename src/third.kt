 class Book(private val name:String, private val author:String, private val publishYear: Int) {
     fun bookData(): String {
         return "$name - $author ($publishYear)"

     }
 }

 class BookInfoSystem{
     private val books = mutableListOf<Book>()

     fun addBook(book: Book){
         books.add(book)
     }

//     fun showBookDetails() {
//         books.forEach{ println{it.bookData()} }
//     }

     fun showBookDetails() {
         for (book in books) {
             println(book.bookData())
         }
     }
 }


 fun main() {
     val book1 = Book("1984","George Orwell", 1949)
     val book2 = Book("Suç ve Ceza","Fyodor Dostoyevski", 1866)

     val bookSystem = BookInfoSystem()

     bookSystem.addBook(book1)
     bookSystem.addBook(book2)

     bookSystem.showBookDetails()
 }