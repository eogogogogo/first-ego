let els = document.querySelectorAll('div');
console.log(els);
//console.log(els[0].dataset.fruitName);
//console.log(els[1].dataset.fruitName);
// els.forEach(el => {
//   console.log(el.dataset.fruitName);
// });
// els.forEach(function (el) {
//   console.log(el.dataset.fruitName);
// });
for(let i=0;i<els.length;i++){
  console.log(els[i].dataset.fruitName);
}