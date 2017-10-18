CREATE TABLE MEMBER(
  MEMBER_ID VARCHAR2(15) PRIMARY KEY,
  MEMBER_PWD VARCHAR2(20)NOT NULL,
  MEMBER_NAME VARCHAR2(50) NOT NULL,
  MEMBER_NO VARCHAR2(13) NOT NULL
  CONSTRAINT MEMBER_NO_UK UNIQUE,
  MEMBER_NIK VARCHAR2(20) NOT NULL
  CONSTRAINT MEMBER_NIK_UK UNIQUE,
  MEMBER_ADDRESS VARCHAR2(255) NOT NULL,
  MEMBER_EMAIL VARCHAR2(255) NOT NULL
  CONSTRAINT MEMBER_EMAIL_UK UNIQUE,
  MEMBER_PHONE VARCHAR2(30) NOT NULL
  CONSTRAINT MEMBER_PHONE_UK UNIQUE,
  SIGNUP_DATE DATE DEFAULT SYSDATE NOT NULL,
  CONNECTION CHAR(1) CHECK(CONNECTION IN('Y','N')) NOT NULL
);
COMMENT ON COLUMN MEMBER.MEMBER_ID IS '���̵�';
COMMENT ON COLUMN MEMBER.MEMBER_PWD IS '��й�ȣ';
COMMENT ON COLUMN MEMBER.MEMBER_NAME IS '�̸�';
COMMENT ON COLUMN MEMBER.MEMBER_NO IS '�ֹι�ȣ';
COMMENT ON COLUMN MEMBER.MEMBER_NIK IS '�г���';
COMMENT ON COLUMN MEMBER.MEMBER_ADDRESS IS '�ּ�';
COMMENT ON COLUMN MEMBER.MEMBER_EMAIL IS '�̸���';
COMMENT ON COLUMN MEMBER.MEMBER_PHONE IS '��ȭ��ȣ';
COMMENT ON COLUMN MEMBER.SIGNUP_DATE IS '������';
COMMENT ON COLUMN MEMBER.CONNECTION IS '���ӿ���';