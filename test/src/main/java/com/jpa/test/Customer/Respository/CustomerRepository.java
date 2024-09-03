package com.jpa.test.Customer.Respository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jpa.test.Customer.Entity.Customer;
import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    /*
     * extends CrudRepository : 해당 클래스를 상속받아 안에 있는 save, saveAll, findById,
     * existsById, findAll, findAllById, count,
     * deleteById, delete, deleteAllById, deleteAll 함수를 사용가능
     */

    List<Customer> findByName(String name);

    List<Customer> findByNameLike(String name);

    // List<Customer> findByNameLikeOrderByAddressAsc(String name); // ASC, DESC 로 정렬가능

    // List<Customer> findByNameOrAddress(String name, String address); -> 이름과 주소 중
    // 한곳에 들어있는 값 조회
    // List<Customer> findByNameAndAddress(String name, String address); -> 이름과 주소 중
    // 모두 들어있는 값 조회

    // nativeQuery true면 표준 SQL, false면 JPQL
    // @Query("from Customer where name = ?1 and adress = ?2") JPQL -> ?1은 첫번째 매개변수 value1, ?2는 두번째 매개변수 value2가 들어가서 실행
    // @Query(value = "select * from Customer where name = ?1 and adress = ?2", nativeQuery = true) -> 표준 SQL
    @Query(value = "select * from Customer where name = ?1 and address like ?2", nativeQuery = true) // like로 변경해서도 가능
    List<Customer> findVipList(String value1, String value2);
}
