//package com.example.demos.functions;
//
//import com.example.demos.Repository.userrepository;
//import com.example.demos.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RemainingSevices implements RemainingServicesimpl{
//
//    @Autowired
//    private userrepository fetchrepo; // repository
//
//    @Override
//    public void bmicalculation(Long id) {
//        try {
//            User user = fetchrepo.findById(id).orElse(null);
//
//            if (user != null) {
//                float kg = (float) user.getWeight();
//                float cm = (float) user.getHeight() / 100; // Convert height to meters
//                float bmi = kg / (cm * cm);
//
//                if (bmi < 18.5) {
//                    System.out.println("You are underweight");
//                } else if (bmi >= 18.5 && bmi <= 24.9) {
//                    System.out.println("Your weight is normal");
//                } else if (bmi >= 25 && bmi <= 29.9) {
//                    System.out.println("You are overweight");
//                } else if (bmi >= 30) {
//                    System.out.println("Dayum dude! You're fat af");
//                }
//            } else {
//                System.out.println("User with ID " + id + " not found");
//            }
//        } catch (Exception e) {
//            System.out.println("An error occurred: " + e.getMessage());
//        }
//    }
//}
