package com.class23;

public class Test {

	public static void main(String[] args) {
		
		
		
		Employee emp= new Employee();
		emp.salary=90000;
		Employee.work();
		emp.getpaid();
		System.out.println("Creating ScrumTeam object");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getpaid();
		st.artifacts="Product Backlog, Sprint backlog, BurddownChart";
		st.ceremonies="Sprint grooming, Sprint Planning Dayli standup, Sprint Retro";		
        st.attendScrumMeetings();
        st.workOnArtifacts();
        System.out.println("Creating Developer object"); 
        Developer dev=new Developer();
        Developer.work();
        dev.salary=12000;
        dev.getpaid();
        dev.artifacts="sprint backlogs";
        dev.workOnArtifacts();
        dev.attendScrumMeetings();
        dev.code();
        Tester qa=new Tester();
        Tester.work();
        qa.salary=12000;
        qa.getpaid();
        qa.artifacts="sprint backlogs";
        qa.workOnArtifacts();
        qa.attendScrumMeetings();
        qa.tes();
        
        BusinessAnalyst ba=new BusinessAnalyst();
        BusinessAnalyst.work();
        ba.salary=12000;
        ba.getpaid();
        ba.artifacts="sprint backlogs";
        ba.workOnArtifacts();
        ba.attendScrumMeetings();
        ba.writesUserStories();
        
        ScrumMaster sm=new ScrumMaster();
        ScrumMaster.work();
        sm.salary=12000;
        sm.getpaid();
        sm.artifacts="sprint backlogs";
        sm.workOnArtifacts();
        sm.attendScrumMeetings();
        sm.attendScrumMeetings();
        
        ProducsOwner po=new ProducsOwner();
        ProducsOwner.work();
        po.salary=12000;
        ba.getpaid();
        ba.artifacts="sprint backlogs";
        ba.workOnArtifacts();
        ba.attendScrumMeetings();
        ba.writesUserStories();
         FrontEnd fe=new FrontEnd();
         FrontEnd.work();
        fe.salary=12000;
        fe.getpaid();
        fe.artifacts="sprint backlogs";
        fe.workOnArtifacts();
        fe.attendScrumMeetings();
        fe.doHtml();
        fe.code();
        BackEnd be=new BackEnd();
        BackEnd.work();
        be.salary=12000;
        be.getpaid();
        be.artifacts="sprint backlogs";
        be.workOnArtifacts();
        be.attendScrumMeetings();
        be.code();
        ManualTester ma=new ManualTester();
        ManualTester.work();
        ma.salary=12000;
        ma.getpaid();
        ma.artifacts="sprint backlogs";
        ma.workOnArtifacts();
        ma.attendScrumMeetings();
        ma.tes();
        ma.TestManually();
        AutomationTester at=new AutomationTester();
        AutomationTester.work();
        at.salary=12000;
        at.getpaid();
        at.artifacts="sprint backlogs";
        at.workOnArtifacts();
        at.attendScrumMeetings();
        at.tes();
        at.codeInJava();
        
        
	}

}
