# springboot-crud-board

이 프로젝트는 CRUD와 로그인, 회원가입 기능을 갖춘 기본적인 게시판을 구현한 프로젝트로

스프링부트를 공부하고 실습해보기 위해 시작하였습니다.

프로젝트의 진행과정은 [게시판 만들기](https://jeehwan94.tistory.com/20)를 통해 확인할 수 있습니다.

## 개발환경

- Eclipse
- STS4
- 빌드도구 : maven
- JAVA 8

## 외부 라이브러리

- Spring Boot DevTools
- Lombok
- Spring Data JPA
- MySQL Driver
- Spring Security
- Thymeleaf
- Spring Web
- BootStrap

## API 정리

## 업데이트 내역

1. 세팅 및 환경설정

- 23.01.04
  - 외부 라이브러리 추가
  - Main controller 작성 및 브라우저 접속 성공

2. JPA를 통한 기본 엔티티 작성

- 23.01.05
  - question, answer 엔티티 작성 및 테이블 생성

3. Repository와 Service, Controller 작성

- 23.01.06
  - QuestionRepository, AnswerRepository 작성
  - Question 데이터 조회 성공

## Todo_list

3. Repository와 Service, Controller 작성

- Controller 작성을 통한 질문 list 랜더링
- front 부분 thymeleaf 를 통해 작성

4. 질문 상세 페이지 작성
5. 답변 등록 페이지 작성
6. 부트 스트랩을 통한 페이지 랜더링
7. 질문 등록 기능 개발
8. 네비게이션바 개발
9. 페이징 기능 개발
10. 답변 개수 표시 기능
11. 회원가입 기능 구현
12. 로그인 및 로그아웃 기능 구현
13. 게시글 수정 및 삭제 기능 구현
14. 게시글 검색 기능 구현
