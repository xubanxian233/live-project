package pojo;

public class Reservation {
    private String reserveNum; // 预约轮次编号
    private String name; // 真实姓名
    private String ID; // 身份证号
    private String tel; // 手机号
    private String number; // 预约数量
    private String status; // 未开奖0 or 未中奖1 or中奖2
    private String winningNum; // 中奖号码

    //所有参数都带的构造
    public Reservation(String reserveNum,String name,String ID,String tel,String number,String status,String winningNum) {
        this.reserveNum=reserveNum;
        this.name=name;
        this.ID=ID;
        this.tel=tel;
        this.number=number;
        this.status=status;
        this.winningNum=winningNum;
    }
    
    //默认status="0"和winningNum=""
    public Reservation(String reserveNum, String name, String ID, String tel, String number) {
        this.reserveNum = reserveNum;
        this.name = name;
        this.ID = ID;
        this.tel = tel;
        this.number = number;
        status="0";
        winningNum="";
    }

    public void setResereNum(String reserveNum) {
        this.reserveNum=reserveNum;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public void setID(String ID) {
        this.ID=ID;
    }
    
    public void setTel(String tel) {
        this.tel=tel;
    }
    
    public void setNumber(String number) {
        this.number=number;
    }
    
    public void setStatus(String status) {
        this.status=status;
    }
    
    public void setWinnningNum(String winningNum) {
        this.winningNum=winningNum;
    }

    public String getReserveNum() {
        return reserveNum;
    }

    public void setReserveNum(String reserveNum) {
        this.reserveNum = reserveNum;
    }

    public String getWinningNum() {
        return winningNum;
    }

    public void setWinningNum(String winningNum) {
        this.winningNum = winningNum;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getTel() {
        return tel;
    }

    public String getNumber() {
        return number;
    }

    public String getStatus() {
        return status;
    }
}
