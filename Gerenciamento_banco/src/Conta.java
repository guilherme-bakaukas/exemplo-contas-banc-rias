public class Conta {

    protected String name;
    protected double money;
    protected int id;
    protected Savings saving;

    public Conta(String name, double money, int id ){
        this.name = name;
        this.money = money;
        this.id = id;
        //iniciamos uma poupan�a para o cliente
    }
    
    public void createSaving() {
    	this.saving = new Savings(name, 0, id);
    }

    public double showMoney(){
        return money;
    }

    public void transfer(double value){
        this.money -= value;
    }

    public void recieve(double value){
        this.money += value;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String new_name){
        this.name = new_name;
    }
    
    public void rescue(double money) {
    	if (saving.money >= money) {
    		this.money += money;
    		saving.money -= money;
    	}
    	else {
    		System.out.println("n�o � poss�vel resgatar essa quantia!");
    	}
    }
    public void apply(double money) {
    	this.money -= money;
    	saving.money += money;
    }
}
