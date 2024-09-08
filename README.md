ChatGPT
Q> show me a best example of java spring boot mybatis example of multiple dbms with mapper xml file and no mapper interface
의 테스트

mysql, postgresql 두개의 dbms로 테스트 하지 않고
mssql에 두개의 계정
seize_base,  study로 테스트 하여 올림

ChatGPT에서는
UserPostgresService(@qualifier("postgresSqlSessionTemplate") 없어서 에러난 것을
수정하였고

DataSourceConfig.java
sessionFactory.setConfigLocation(new
ClassPathResource("mybatis-config.xml"));도 추가하였음
