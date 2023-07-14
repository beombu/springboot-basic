# SpringBoot Basic Weekly Mission
스프링부트 basic 위클리미션을 코드리뷰하는 Repository입니다.

## 그림 그리기 및 소개하기
#### 객체의 행동과 상태
![img.png](doc/week2/img.png)

#### 클래스 다이어 그램(역할 및 책임)
![img_1.png](doc/week2/img_1.png)

## 요구 사항
**(기본)** **바우처 관리 애플리케이션**

- [ ]  바우처 관리 애플리케이션에 단위테스트를 작성해보세요.
    - 가능한 많은 단위 테스트코드를 작성하려고 노력해보세요.
    - 엣지 케이스(예외 케이스)를 고려해서 작성해주세요.
    - Hamcrest 의 메쳐들을 다양하게 작성해보고 익숙해져 보세요.
- [ ]  바우처 관리 애플리케이션에서도 과정에서 다루었던 고객을 적용해보세요.
    - customers 테이블 정의 및 추가
    - CustomerRepository 추가 및 JdbcTemplate을 사용해서 구현
- [ ]  (1주차엔 파일로 관리하게 했다.) 바우처 정보를 DB로 관리해보세요.
    - 바우처에 엔터티에 해당하는 vouchers 테이블을 한번 정의해보세요.
    - 바우처 레포지토리를 만들어보세요. (JdbcTemplate을 사용해서 구현)
    - 기존의 파일에서 바우처를 관리한 것을 vouchers 테이블을 통해서 CRUD가 되게 해보세요.

**(심화)** **바우처 지갑을 만들어보세요.**

- 특정 고객에게 바우처를 할당할 수 있습니다.
- 고객이 어떤 바우처를 보유하고 있는지 조회할 수 있어야 합니다.
- 고객이 보유한 바우처를 제거할 수 있어야 합니다.
- 특정 바우처를 보유한 고객을 조회할 수 있어야 합니다.

## 작업 순서 목록
- [x] CommandLineApplication 분리
- [x] MemoryVoucher 삭제 기능 구현 & 테스트
- [x] MemoryVoucher 수정 기능 구현 & 테스트
- [x] Jdbc Connect 구현
- [x] JdbcVoucher 생성 기능 구현
- [x] JdbcVoucher 조회 기능 구현
- [x] JdbcVoucher 삭제 기능 구현
- [x] JdbcVoucher 수정 기능 구현
- [ ] jdbcVoucher 테스트 코드 구현
- [ ] Customer 객체 구현 & 테스트
- [ ] JdbcCustomer 생성 기능 구현 & 테스트
- [ ] JdbcCustomer 조회 기능 구현 & 테스트
- [ ] JdbcCustomer 수정 기능 구현 & 테스트
- [ ] JdbcCustomer 삭제 기능 구현 & 테스트
- [ ] 중간 점검(Wallet 구현 전 멘토님 승인)
