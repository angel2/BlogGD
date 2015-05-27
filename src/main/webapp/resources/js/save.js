function save(){

    var instance = $("#bbcode").sceditor("instance");
    var source = instance.val();

    $("#post").val(source);


    console.log(source);

    document.getElementById("postForm").submit();

}