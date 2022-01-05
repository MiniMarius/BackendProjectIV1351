package se.kth.iv1351;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import se.kth.iv1351.cliController.UserController;
import se.kth.iv1351.view.BlockingInterpreter;

import java.io.IOException;
import java.io.InputStream;

public class CliAppMain {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        new BlockingInterpreter(new UserController(sqlSessionFactory)).handleCmds();
    }
}
