CREATE TABLE DONATE(
  DONATION_NO VARCHAR2(13) PRIMARY KEY,
  MEMBER_ID VARCHAR2(15) NOT NULL,
  DONATION NUMBER NOT NULL,
  DONATION_DATE DATE DEFAULT SYSDATE NOT NULL
);
ALTER TABLE DONATE
ADD CONSTRAINT FK_MEMBER_ID FOREIGN KEY(MEMBER_ID)
REFERENCES MEMBER(MEMBER_ID);

COMMENT ON COLUMN DONATE.DONATION_NO IS '��� ��ȣ';
COMMENT ON COLUMN DONATE.MEMBER_ID IS '���̵�';
COMMENT ON COLUMN DONATE.DONATION IS '��α�';
COMMENT ON COLUMN DONATE.DONATION_DATE IS '�������';