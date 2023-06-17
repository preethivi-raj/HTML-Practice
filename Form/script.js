let form=document.querySelector('#form')
let username=document.getElementById('username')
let password=document.getElementById('password')
let email=document.getElementById('email')
let cpassword=document.getElementById('cpassword')


form.addEventListener('submit' , (e)=>{
    e.preventDefault();
    validateInput();
})

function validateInput(){
    const usernameVal=username.value.trim();
    const emailVal=email.value.trim();
    const passwordVal =password.value.trim();
    const cpasswordVal=cpassword.value.trim();

    if(usernameVal===''){
        setError(username , "User is Required");
    }else{
        setSuccess(username);
    }

    if(emailVal===''){
        setError(email , "Email is Required")
    }else if(!validateEmail(emailVal)){
         setError(email , "Eneter a valid Email") 
    }
    else{
        setSuccess(email)
    }

    if(passwordVal===''){
        setError(password , "Password is Required")

    }
    else if(passwordVal.length()<8){
          setError(password , "Password must be atleat 8 letters")
    }
    else{
        setSuccess(password)
    }

    if(cpasswordVal===''){
        setError(cpassword , "Plesae Confirm the Password")
    }
    else if(cpasswordVal!==passwordVal){
        setError(cpassword , "Password is doesn`t match")
    }
    else{
        setSuccess(cpassword)
    }

}

function setError(element , message){
      const inputgroup=element.parentElemet;
      const errorElement = inputgroup.querySelector('.error');

      errorElement.innerText=message;
      inputgroup.classList.add('error')
      inputgroup.classList.remove('success')

}

function setSuccess(element ){
    const inputgroup=element.parentElemet;
    const errorElement = inputgroup.querySelector('.error');

    errorElement.innerText='';
    inputgroup.classList.add('success')
    inputgroup.classList.remove('error')

}

const validateEmail = (email) => {
    return String(email)
      .toLowerCase()
      .match(
        /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|.(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
      );
  };