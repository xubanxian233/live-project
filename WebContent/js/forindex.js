onload=function () {

    document.getElementById('IDnum').addEventListener('input',function(){
        checkIDnum();
    });

    document.getElementById('PhoneNum').addEventListener('input',function(){
        checkPhoneNum();
    });
}
//验证身份证号
function checkIDnum() {
    var x=document.getElementById('IDnum').value;
    var patrn=/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    if (!patrn.test(x)) {
        document.getElementById('mes2').style.display='block';
    } else {
        document.getElementById('mes2').style.display='none';
    }
}
//验证手机号
function checkPhoneNum() {
    var x=document.getElementById('PhoneNum').value;
    var patrn=/^1[345678]\d{9}$/;
    if (!patrn.test(x)) {
        document.getElementById('mes3').style.display='block';
    } else {
        document.getElementById('mes3').style.display='none';
    }
}