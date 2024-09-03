SPRING BOOT + JPA + H2 DATABASE 사용실습

참고유튜브 : https://www.youtube.com/watch?v=WZDth-5KP5M&t=1886s

![image](https://github.com/user-attachments/assets/e14cbe95-538a-4113-a16e-8c0c734192d8)

1. Entity 설정
   
![image](https://github.com/user-attachments/assets/3800dad6-0b65-4fd9-99bc-1907f4400be7)

- @Data : lombok Getter, Setter 자동설정
- @Entity : Entity설정
- @Id : 테이블 PK 설정
- @GeneratedValue(strategy = GenerationType.IDENTITY) : 값 자동증가(시퀀스)
- @Column : 컬럼속성 지정

2. Controller 설정
   
![image](https://github.com/user-attachments/assets/c13f8e19-64c7-4e87-9f6c-77c9fd03cb13)

- Put(삽입), Post(수정), Delete(삭제), Get(조회)로 RestfulAPI

3.Repository 설정

![image](https://github.com/user-attachments/assets/656c960a-f3e2-40cf-9678-8612eacee7b1)

- exteneds CrudRepository 상속을 통해서 JPA 기본함수 사용가능
- findById, findByname, findByAddress 등으로 컬럼 1개의 값 조회
- findByNameAndAddress, findByNameOrAddress 로 컬럼 2개의 값 조회
- findByNameLike 로 Like를 붙이면 like 검색
- @Query에 쿼리를 사용하여 조건검색 가능 ?1, ?2 는 첫번재, 두번째 파라매터값이 들어가서 실행
- nativeQuery = true (표준SQL), false (JPQL)로 검색

4. application.properties
   
![image](https://github.com/user-attachments/assets/f57fd3ad-10e6-451d-bcd2-8e9b2fda1cb8)





