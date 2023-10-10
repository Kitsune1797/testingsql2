package holdSql;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RunOnHoldSQL {
	private static final String CONFIG_FILE_PATH = "config/mybatis-config.xml";
	
	public static void main(String [] args) throws IOException {
		Reader reader = Resources.getResourceAsReader(CONFIG_FILE_PATH);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();
		List<OnHold> hold = session.selectList("selectAllOnHold");
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writer().writeValueAsString(hold));
		
		OnHold holdEdit = new OnHold();
		holdEdit = hold.get(0);
		holdEdit.setREMARK("RMK");
		holdEdit.setTRX_STATUS("TEST FAILE");
		session.update("updateOnHold",holdEdit);
		session.commit();
		session.close();
		
	}
}

