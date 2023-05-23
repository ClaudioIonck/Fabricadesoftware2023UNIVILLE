(function(){

    console.log("Entrou 1");

    $("#tabelaCliente").on("click", ".js-delete", function(){

        console.log("Entrou 2");

        let botaoClicado = $(this);
        $("#btn-sim").attr("data-id", botaoClicado.attr("data-id"));
        $("#modalUser").modal("show");
    });


    $("#btn-sim").on("click", function(){
        
        let botaoSim = $(this);
        let id = botaoSim.attr("data-id");

        $.ajax({
            
            url: "/cliente/remover/" + id,
            method: "GET",
            success: function(){
                window.location.href = "/cliente/";
            }
        });
    });

})();


