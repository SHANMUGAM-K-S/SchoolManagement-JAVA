//package schoolmanagementsystem;
//
//public class Student {
//	
//        private  int id;
//        private String name;
//        private int grade;
//        private int feesPaid;
//        private int feesTotal;
//        
//        /**
//         * 
//         * 
//         * @param id id for the student it was unique
//         * @param name name of the student
//         * @param grade  grade of the student
//         */
//        
//        
//		public Student(int id, String name, int grade) {
////			super();
//			feesPaid=0;
//			feesTotal=25000;
//			this.id = id;
//			this.name = name;
//			this.grade = grade;
//		}
//		
//		public void setGrade(int grade) {
//			this.grade=grade;
//		}
////		
//		
// 
//      public void payFees(int fees) {
//    	  feesPaid+=fees;
//    	  School.updateTotalMoneyEarned(feesPaid);
//      }
//
//      
//      
////      
////      return id of the student
//      
//	public int getId() {
//		return id;
//	}
//
////  return name of the student
//	public String getName() {
//		return name;
//	}
//
//	
////  return fees paid by the student
//	public int getFeesPaid() {
//		return feesPaid;
//	}
//
////  return total fees of the student
//	public int getFeesTotal() {
//		return feesTotal;
//	}
//
////  return grade of the student	
//	public int getGrade() {
//		return grade;
//	}
//      
//	
///**
// * 
// * @return  the remaining fees
// */
//	public int getRemainingFees() {
//		return feesTotal-feesPaid;
//	}
//      
// 
//}












package schoolmanagementsystem;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Constructor to initialize student details.
     * @param id Unique ID for the student.
     * @param name Name of the student.
     * @param grade Grade of the student.
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 25000; // Default total fees
    }

    /**
     * Updates the student's grade.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Adds a new fee payment and updates the school's earnings.
     * @param fees Amount paid by the student.
     */
    public void payFees(School school,int fees) {
        feesPaid += fees;
        school.updateTotalMoneyEarned(fees); // FIXED: Only add the new payment
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * @return The remaining fees to be paid by the student.
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
}

