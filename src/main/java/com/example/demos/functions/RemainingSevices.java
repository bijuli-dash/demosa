//package com.example.demos.functions;
//
//import com.example.demos.Repository.userrepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserSevices {
//
//    @Autowired
//    private userrepository registereduser; //repository
//
//    public void bmicalculation(Long id){
//
//
//        User user = registereduser.findById(user.getId(id)).orElse(null);
//
//        assert user != null;
//        float kg = (float) user.getWeight();
//        float cm = (float) user.getWeight();
//        float bmi = 0;
//        bmi = kg/(cm*cm);
//    try{
//        if(bmi<18.5) {
//            System.out.print("You are underweight");
//        }
//        if(bmi >= 18.5 || bmi <= 24.9) {
//            System.out.print("Your weight in normal");
//        }
//        if(bmi >= 25 || bmi <= 29.9) {
//            System.out.print("Your are Overweight");
//        }
//        if(bmi >= 30) {
//            System.out.print("Dayum dude! You're fat af");
//        }
//    }
//       catch(RuntimeException e)
//       {
//           System.out.print("An error occured!");
//       }
//
//
//    }
//
//}
