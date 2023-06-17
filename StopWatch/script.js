let btnStart=document.getElementById('Start');
let btnStop=document.getElementById('Stop');
let btnReset=document.getElementById('Reset');

let min=0;
let sec=0;
let count=0;

let timer =false;

btnStart.addEventListener('click' ,function(){
    timer=true;
    stopWatch();
})
btnStop.addEventListener('click',function(){
    timer=false;

})
btnReset.addEventListener('click',function(){
    timer=false;
    count=0;
    sec=0;
    min=0;
    document.getElementById('mins').textContent='0';
    document.getElementById('seconds').textContent='0';
});



function stopWatch(){
    if(timer){
        count++;

        if(count==100){
            sec++;
            count=0;
        }
        if(sec==60){
           min++;
           sec=0;
        }
        if(min==60){
            sec=0;
            min=0;
        }

        let minString=min;
        let secString=sec;
        document.getElementById('mins').textContent=minString;
        document.getElementById('seconds').textContent=secString;
        setTimeout(stopWatch,10);
        
    }
}