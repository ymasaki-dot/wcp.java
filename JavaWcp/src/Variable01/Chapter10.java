package Variable01;

import java.sql.SQLException;

public class Chapter10 {
	public static void main(String[] args) {
		try {
			int array[] = {1,3,5};
			Chapter10.validIndex(array, 2);
			Chapter10.validIndex(array, 2);
			
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegaArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}
		System.out.println("mainメソッド終了");
	}
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
}
