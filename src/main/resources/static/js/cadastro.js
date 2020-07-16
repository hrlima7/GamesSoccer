
var filds = document.querySelectorAll("#formulario [name]")
var user = {};

filds.forEach(function(field,index){

    if (field.name == "sexo"){
        console.log("SIM tem sexo" + field.name);

    }
    else{
      
        user[field.name] = field.value ; 

    }


});

console.log(user);