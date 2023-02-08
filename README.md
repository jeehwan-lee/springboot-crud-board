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

- 답변 등록 기능 (post)

  - localhost:8080/answer/create/{id}

- 질문 등록 페이지로 이동 (get)

  - localhost:8080/question/create

- 질문 등록 기능 (post)

  - localhost:8080/question/create

- 회원가입 페이지로 이동 (get)

  - localhost:8080/user/signup

- 회원가입 기능 (post)

  - localhost:8080/user/signup

- 로그인 페이지로 이동 (post)

  - localhost:8080/user/login

- 질문 수정 페이지로 이동 (get)

  - localhost:8080/question/modify/{id}

- 질문 수정 기능 (post)

  - localhost:8080/question/modify/{id}

- 질문 삭제 기능 (get)

  - localhost:8080/question/delete/{id}

- 답변 수정 페이지로 이동 (get)

  - localhost:8080/answer/modify/{id}

- 답변 수정 기능 (post)

  - localhost:8080/answer/modify/{id}

- 답변 삭제 기능 (get)
  - localhost:8080/answer/delete/{id}

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

  - 질문 상세(제목, 내용, 날짜) 출력 페이지 작성

- 23.01.18

  - 템플릿 상속을 통한 질문 상세 페이지 수정

- 23.01.09

  - 질문 상세 페이지에 답변 출력 및 답변 등록기능 추가
  - 질문 상세 페이지에 bootstrap 적용

- 23.01.26
  - 질문 상세 페이지에 글쓴이와 답변에 글쓴이 표시

5. 답변 등록 페이지 작성

- 23.01.09

  - 답변 등록 페이지에 bootstrap 적용

- 23.01.18

  - 템플릿 상속을 통한 답변 등록 페이지 수정

6. 질문 등록 기능 개발

- 23.01.18

  - 질문 등록 기능 개발 완료
  - 작성 양식이 비워져있을 경우 에러메세지 출력 기능 추가

7. 답변 등록 기능 개발

- 23.01.18
  - 답변 등록 기능 개발 완료
  - 작성 양식이 비워져있을 경우 에러메세지 출력 기능 추가

8. 네비게이션바 개발

- 23.01.22

9. 페이징 기능 개발

- 23.01.22
  - url 을 통해 page 값 입력시 페이지 출력
  - 페이지 이동할 수 있는 버튼 개발 완료
  - id 값을 기준으로 내림차순으로 정렬

11. 회원가입 기능 구현

- 23.01.24
  - 스프링 시큐리티 설정 완료
  - 비밀번호 암호화를 통한 회원가입 기능 완료

12. 로그인 및 로그아웃 기능 구현

- 23.01.25

  - 스프링 시큐리티를 통한 로그인 및 로그아웃 완료

13. 글 수정 및 삭제

- 23.02.02
  - question 수정 및 삭제 기능 구현
  - answer 수정 및 삭제 기능 구현

## Todo_list

4. 질문 상세 페이지 작성

- 질문이 없을 경우 예외처리 기능 필요
- userService 의 getUser 메서드에서 User 못찾을 경우 예외처리 필요

10. 답변 개수 표시 기능
11. 게시글 수정 및 삭제 기능 구현

- 답변이 없을 경우 예외처리 기능 필요
- answerService 의 getAnswer 메서드에서 Optional 객체를 통해 받은 Answer 이 없을 경우

12. 게시글 검색 기능 구현

## 프로젝트를 통해 배운것
