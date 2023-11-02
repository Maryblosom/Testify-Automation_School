
const books =  [
    {
        title: "Hacks to Testing",
    description: "Guide to Software Testing",
    numberOfPages: 108,
    author: "Maryblossom",
    reading:true
    },
    {
    title: "Road to learn",
    description: "Tips on how to learn",
    numberOfPages: 99,
    author: "Mary",
    reading:false
    },
    {
        title: "Wild Stories",
    description: "Unimaginary stories",
    numberOfPages: 108,
    author: "Blossom",
    reading:true
    }
] 

for(let x = 0; x < books.length; x = x+1){
    if (books[x].reading === true){
       console.log(books[x].title)
       console.log(books[x].description)
       console.log(books[x].numberOfPages)
       console.log(books[x].author)
       console.log(books[x].reading)
       console.log("------")
    }
}

