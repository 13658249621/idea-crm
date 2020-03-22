function checksessoin() {
    console.log("请先登录");
    var strSession = sessionStorage.getItem('uname');
    if (strSession=="" || strSession==null){
        window.location.href="index.html";
    }
};//检查是否登录

function toIndex() {
    window.location.href="index.html";
};//回到登录页面
function back() {
    window.history.back();
};//回到上一个页面
function CheckPower() {
    console.log("已保存用户名");
    var ManageHouse=document.getElementById("ManageHouse");
    var ManageFix=document.getElementById("ManageFix");
    var ManageSugg=document.getElementById("ManageSugg");
    var ManageNotice=document.getElementById("ManageNotice");
    var ManageUser=document.getElementById("ManageUser");
    var ManageParking=document.getElementById("ManageParking");
    var ManagePay=document.getElementById("ManagePay");
    var GlobolUname = sessionStorage.getItem('uname');
    var GlobolPower =sessionStorage.getItem('power');
    console.log(GlobolUname);
    console.log(GlobolPower);
    if (GlobolPower=="业主"){
        ManageFix.style.display="none";
        ManageUser.style.display="none";
        ManageParking.style.display="none";
        ManagePay.style.display="none";
        ManageHouse.style.display="none";
        ManageNotice.style.display="none";
        ManageSugg.style.display="none";
    }else if (GlobolPower=="物业管理人员"){
        ManageUser.style.display="none";
    }
};//根据权限等级显示不同导航菜单