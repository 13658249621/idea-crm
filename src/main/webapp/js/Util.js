function checksessoin() {
    console.log("请先登录");
    var strSession = sessionStorage.getItem('uname');
    if (strSession=="" || strSession==null){
        window.location.href="index.html";
    }
};//检查是否登录
function GetValue(parameter1,parameter2) {
    var itemString=JSON.stringify(parameter1);

    var test1=itemString.replace("[","");//处理json字符串外中括号
    var ItemObj=test1.replace("]","");//处理json字符串外中括号
    var jsObject = JSON.parse(ItemObj);//把ItemObj转换成Json对象
    var ReturnValue=eval('jsObject.'+parameter2);
    console.log(ReturnValue);
    return ReturnValue;
}//获取BootStrapTable的某一数据项的值,parameter1是bootstrap table接收数据rows中某一项的值，parameter2是rows中某一项的字段，比如uname，payname，uid等
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
    if (GlobolPower =="业主"){
        ManageFix.style.display="none";
        ManageUser.style.display="none";
        ManageParking.style.display="none";
        ManagePay.style.display="none";
        ManageHouse.style.display="none";
        ManageNotice.style.display="none";
        ManageSugg.style.display="none";
    }else if (GlobolPower =="物业管理人员"){
        ManageUser.style.display="none";
    }else if (GlobolPower =="系统管理员"){
        console.log("您是系统管理员")
    }
};//根据权限等级显示不同导航菜单

function logout(){
    window.location.href="index.html";
    sessionStorage.clear();
}