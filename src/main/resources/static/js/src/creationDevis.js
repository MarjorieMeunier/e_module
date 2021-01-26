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
            var option =  "<option value="+item['id_composant']+" data-prix="+item['prix']+">"+item['nature_composant']+"</option>";
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

    $("#prixTotal"+id_module).val((prix*unite).toFixed(2));
}

function majPrixComposant(e){
    var prix = $(e).find(':selected').attr("data-prix");
    var id_module = $(e).attr("data-module");

    console.log(id_module);
    console.log(prix);

    $("#prixUnitaire"+id_module).val(prix);
    $("#nombreUnite"+id_module).val(1);
    $("#nombreUnite"+id_module).attr("data-prix", prix);
    $("#prixTotal"+id_module).val(prix);
}

$("#inputRechercherClient").on('input',function(e){
    console.log($(this).val());

    var nomPrenom = $(this).val();

    $.get("/e_module/clientNomPrenom?nomPrenom=" + nomPrenom, function (data){

        console.log(data);
        var option = "";
        $("#listeClients").html("");
        data.forEach(function (item, i){
            console.log(item);
            option = "<option value='"+item["id_client"]+"' label='"+item["nom_client"]+" "+item["prenom_client"]+"'>"+item["nom_client"]+" "+item["prenom_client"]+"</option>"
            $("#listeClients").append(option);
        });
    });

    inputval = $('#inputRechercherClient').val();

    if (!isNaN(inputval)) {
        console.log("val : "+inputval);

        $.get("/e_module/clientFromId?id_client=" + inputval, function (data){

            console.log(data);

            $("#inputNomClient").val(data["nom_client"]);
            $("#inputPrenomClient").val(data["prenom_client"]);
            $("#inputAdresseClient").val(data["adresse_client"]);
            $("#inputCPClient").val(data["cp_client"]);
            $("#inputVilleClient").val(data["ville_client"]);
            $("#inputTelClient").val(data["telephone_client"]);
            $("#inputEmailClient").val(data["mail_client"]);

            creerRefDevis();
        });

    } else {
    }
});

function creerRefDevis(){
    var nomProjet = $("#inputNomProjet").val();
    var nomClient = $("#inputNomClient").val();

    var today = new Date();
    var date = today.getFullYear()+''+(today.getMonth()+1)+''+today.getDate()+''+today.getHours();

    var ref = nomProjet+""+nomClient+""+date;

    $("#inputRefProjet").val(ref);
}

function sauvegarderDevis(){

    var ref_chantier = $("#inputNomProjet").val();
    var nom_chantier = $("#inputRefProjet").val();
    var date_chantier = today.getFullYear()+'/'+(today.getMonth()+1)+'/'+today.getDate();
    var id_utilisateur = $("#inputCommercial").val();
    var id_client = $("#inputRechercherClient").val();
    //var id_gamme = $("#");

    var paramList={
        ref_chantier:ref_chantier,
        nom_chantier:nom_chantier,
        id_utilisateur:id_utilisateur,
        id_client:id_client
    };

    var json = JSON.stringify(paramList);

    $.ajax({
        url: "/e_module/sauvegarderClient",
        data: json,
        cache: false,
        processData: false,
        type: 'POST',
        dataType:'json',
        success: function (dataofconfirm) {
            // do something with the result
        }
    });
}


