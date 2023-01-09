# springboot-crud-board

이 프로젝트는 CRUD와 로그인, 회원가입 기능을 갖춘 기본적인 게시판을 구현한 프로젝트로

스프링부트를 공부하고 실습해보기 위해 시작하였습니다.

프로젝트의 진행과정은 [게시판 만들기](https://jeehwan94.tistory.com/20)를 통해 확인할 수 있습니다.

## 개발환경

- Eclipse
- STS4
- maven (빌드도구)
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

## 배포도구

- AWS EC2

## ERD

## API 정리

- 질문 리스트 보기 (get)

  - localhost:8080/question/list
  - localhost:8080/

- 각 질문에 대한 상세 페이지 (get)

  - localhost:8080/question/detail/{id}

- 답변 등록 기능(post)
  - localhost:8080/answer/create/{id}

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

- 23.01.08
  - thymeleaf 를 통한 question_list 페이지 작성 및 질문 데이터 출력
  - main controller 를 통해 '/' 페이지 접속 시 redirect 완료
  - service 작성

4. 질문 상세 페이지 작성

- 23.01.08

  - 질문 상세(제목, 내용) 출력 페이지 작성

- 23.01.09
  - 질문 상세 페이지에 답변 출력 및 답변 등록기능 추가
  - 질문 상세 페이지에 bootstrap 적용

5. 답변 등록 페이지 작성

- 답변 등록 페이지에 bootstrap 적용

- 23.01.09

## Todo_list

4. 질문 상세 페이지 작성

- 질문이 없을 경우 예외처리 기능 필요
- 질문 상세 페이지에서 다른 정보 (작성자, 날짜) 출력 필요

7. 질문 등록 기능 개발

- 양식이 채워지지 않으면 예외처리

8. 네비게이션바 개발
9. 페이징 기능 개발
10. 답변 개수 표시 기능
11. 회원가입 기능 구현
12. 로그인 및 로그아웃 기능 구현
13. 게시글 수정 및 삭제 기능 구현
14. 게시글 검색 기능 구현

## 프로젝트를 통해 배운것
