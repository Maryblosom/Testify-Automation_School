
function converter(meter){
    const lengthincm = meter * 100;
    return lengthincm;
}

const lengthvalue = converter(35)

console.log(lengthvalue +"cm") 