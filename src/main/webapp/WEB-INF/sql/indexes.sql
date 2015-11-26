create index IX_F9F7829F on SYMPOSIUM_Report (reportStatus);
create index IX_3A8D96F on SYMPOSIUM_Report (uuid_);
create index IX_6C063F59 on SYMPOSIUM_Report (uuid_, companyId);
create unique index IX_6898C81B on SYMPOSIUM_Report (uuid_, groupId);