$(function() {
    console.log("ready!");
});

function chargerListeComposant(e){
    var id_module = $(e).attr("data-module");
    var id_famille_composant = $("#selectFamille"+id_module).val();


    console.log(id_famille_composant);

    $.get("/e_module/composants?id_famille_composant=" + id_famille_composant, function (data){
        $("#selectComposant"+id_module).empty();
        console.log(data);
        data.forEach(function (item, i){
            console.log(item);
            var option =  "<option value="+item['id_composant']+">"+item['nature_composant']+"</option>";
            $("#selectComposant"+id_module).append(option);

            $("#prixUnitaire"+id_module).val(item['prix']);
            $("#nombreUnite"+id_module).val(1);
            $("#nombreUnite"+id_module).attr("data-prix", item['prix']);
            $("#prixTotal"+id_module).val(item['prix']);

        });
    });

}

function majPrixTotal(e){
    var prix = $(e).attr("data-prix");
    var id_module = $(e).attr("data-module");
    var unite = $("#nombreUnite"+id_module).val();

    $("#prixTotal"+id_module).val(prix*unite);
}