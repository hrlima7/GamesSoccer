

    function imc() {
        let altura = parseFloat(document.getElementById("altura").innerHTML);
        let peso = parseFloat(document.getElementById("peso").innerHTML);

        let calculo = peso / (Math.pow(altura, 2));
        let arrecalc = parseFloat(calculo.toFixed(2));
        return arrecalc

    }
    
    imc();


    let meuImc = imc();
    document.getElementById("imc").innerHTML = meuImc;

    if (meuImc < 25) {
        $(".cximc1").css("background-color", "yellow");
    } else {
        $(".ccximc1").css("background-color", "red");

    };
