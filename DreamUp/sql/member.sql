drop table member;
create table member(
	M_No			integer,					-- ��� ��ȣ			
	M_Id			varchar2(20) 	primary key, -- ��� ���̵�
	M_Password		varchar2(100)	not null, -- ��� ��й�ȣ
	M_Email			varchar2(40)	not null, -- ��� �̸��� , �ߺ��˻� �Ұ�
	M_Name			varchar2(20)    not null, --��� �̸�
	M_Date			date		not null, -- ������
    --ȸ�����Խ� �Է� �޴� �÷� (INSERT)
	 
	M_Phone			varchar2(13), --1.�Ŀ��Ҷ� or 2.������Ʈ ��Ͻ� �Է�
	M_Address		varchar2(255), -- 1.�Ŀ��Ҷ� ����� ���� or 2.������Ʈ ��Ͻ� �ּ����� �Է�
	M_Post			varchar2(20), -- 1.�Ŀ��Ҷ� ����� ���� or 2.������Ʈ ��Ͻ� �ּ����� �Է�
	
	M_BankName		varchar2(30), -- ȯ�ҽ� �����
	M_Account		varchar2(20) -- ȯ�ҽ� ���¹�ȣ
	--�Ŀ����� �Է½� �Է� �޴� �÷� (UPDATE)
	
	m_SupportingCount		varchar2(20), -- ���� �Ŀ��ϴ� ������Ʈ �� ���հ� (�Ŀ��� +1)
	m_SupportiedCount		varchar2(20), -- �� ������Ʈ �� �Ŀ��հ� (ȯ�ҽ� -1)
);
	

select * from member     

select m_id from member where m_email='kancho33@naver.com' and m_name ='��ȣâ';

select * from project

delete from member
delete from project

drop table member
drop table project

delete * from member where M_ID='damang';

drop sequence member_seq;
create sequence member_seq
	start with 1
	increment by 1
	nocycle
	nocache;
