module collegeinfo {
    exports college.student;
}
module app {
    requires collegeinfo;
}