drop table reward;
create table reward(
	Re_No		integer			primary key,		
	Pro_No		integer		 	not null references project(Pro_No),
	Re_Money	integer			not null, -- 후원(서약) 금액
	Re_Title	varchar2(30)	not null, -- 리워드 타이틀
	Re_Item		varchar2(30)	not null, -- 리워트 아이템 목록
	Re_delivery date			not null, -- 배송 예정일
	Re_Amount	integer			not null  -- 남은 리워드 갯수 수
	--프로젝트 리워드 등록시 필요 컬럼
);

alter table reward add colum re_delivery 

alter table reward ADD(re_delivery date not null);

select * from reward
drop sequence reward_seq;
create sequence reward_seq
	start with 1
	increment by 1
	nocycle
	nocache;