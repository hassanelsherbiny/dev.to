let items = document.getElementsByClassName("crayons-story__title");
let arr = "";
let search = '';
for (let i = 0; i < items.length; i++) {
  let atag = items[i].getElementsByTagName("a")[0];
  arr += `- [${atag.innerText}](https://dev.to${atag.attributes["href"].value})`+'\r\n';
  if (i == items.length - 1) {
    debugger;
  }
}
