const btn=document.getElementById("btn")
const colortext=document.getElementById("color")
const wrap=document.getElementById("wrap")
const hex=[0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F']

btn.addEventListener('click' ,function (){
     let hexColor='#'
     for(let i=1 ; i<=6 ; i++){
        hexColor+=ranHexVal()
     }
     wrap.style.background=hexColor
     colortext.innerHTML=hexColor
})
function ranHexVal(){
     let randomIndex=Math.floor(Math.random()*16)
     return hex[randomIndex]
}




