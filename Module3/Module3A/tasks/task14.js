
const books = {
    title: "Hacks to Testing",
    description: "Guide to Software Testing",
    numberOfPages: 108,
    author: "Maryblossom Onyeka",
    reading:true,
    toggleReadingStatus: function(){
        if(books.reading===true) {
            books.reading = true
        } else{
            books.reading = false
        }
    }
}

console.log(books.reading)