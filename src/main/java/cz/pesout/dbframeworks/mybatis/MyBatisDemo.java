package cz.pesout.dbframeworks.mybatis;

import cz.pesout.dbframeworks.data.CountryRecord;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {

            // See src/main/resources/CountryMapper.xml
            List<CountryRecord> countries = session.selectList(
                    "cz.pesout.dbframeworks.mybatis.CountryMapper.selectBigCountries", 1_000_000);

            for (CountryRecord c : countries) {
                System.out.printf("%s - %s, %d%n", c.code(), c.name(), c.population());
            }
        }

    }
}
