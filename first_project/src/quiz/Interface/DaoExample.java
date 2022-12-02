package quiz.Interface;

public class DaoExample {
	public static void dbwork(DataAcessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		DataAcessObject oracledao = new OracleDao(); 
		dbwork(oracledao);
		dbwork(new MysqlDao());
	}

}
