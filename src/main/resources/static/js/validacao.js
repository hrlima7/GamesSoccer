$(document).ready(function(){
    $("#formulario").validate({
        rules:{
            nome:{
                maxlength:100,
                minlength:5
            },
            sobrenome:{
                maxlength:100,
                minlength:5
                
            }
        }
    })

})