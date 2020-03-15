package pojo;

public class Reservation {
    private int reserveNum; // ԤԼ�ִα��
    private String name; // ��ʵ����
    private String ID; // ���֤��
    private String tel; // �ֻ���
    private int number; // ԤԼ����
    private int status; // δ����0 or δ�н�1 or�н�2
    private int winningNum; // �н�����

    //���в��������Ĺ���
    public Reservation(int reserveNum,String name,String ID,String tel,int number,int status,int winningNum) {
        this.reserveNum=reserveNum;
        this.name=name;
        this.ID=ID;
        this.tel=tel;
        this.number=number;
        this.status=status;
        this.winningNum=winningNum;
    }
    
    //Ĭ��status="0"��winningNum=""
    public Reservation(int reserveNum, String name, String ID, String tel, int number) {
        this.reserveNum = reserveNum;
        this.name = name;
        this.ID = ID;
        this.tel = tel;
        this.number = number;
        status=0;
        winningNum=0;
    }
    
    public Reservation() {
    	
    }

    public void setResereNum(int reserveNum) {
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
    
    public void setNumber(int number) {
        this.number=number;
    }
    
    public void setStatus(int status) {
        this.status=status;
    }
    
    public void setWinnningNum(int winningNum) {
        this.winningNum=winningNum;
    }

    public int getReserveNum() {
        return reserveNum;
    }

    public void setReserveNum(int reserveNum) {
        this.reserveNum = reserveNum;
    }

    public int getWinningNum() {
        return winningNum;
    }

    public void setWinningNum(int winningNum) {
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

    public int getNumber() {
        return number;
    }

    public int getStatus() {
        return status;
    }
}
