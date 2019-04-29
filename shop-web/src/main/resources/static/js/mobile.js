$(function(){
	
})


function reg(){
	
	
	 var arry = $("#miniReg").serializeArray();
    
    $.ajax({
        url: "regist",
        data: JSON.stringify(arry),
        type:"post",
        dataType:"json",
        success: function (d) {
            if(d.status == 200){
            	alert(d.msg);
            	location="locaLogin";
            }
        }
    })
}
}