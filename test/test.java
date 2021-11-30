//
//import DBContext.OrderDAO;
//<<<<<<< HEAD
//import DBContext.ShipDAO;
//import DBContext.UserDAO;
//import SMTP.GmailAPI;
//import entity.Order;
//import entity.ShipInfo;
//=======
//import DBContext.OrderDetailDAO;
//import DBContext.UserDAO;
//import SMTP.GmailAPI;
//import entity.Order;
//import entity.OrderDetail;
//>>>>>>> c3454b0182e81c4e3e8b3e0e9f01c89d81f4d5b6
//import entity.Users;
//import java.util.ArrayList;
//import java.util.List;
//import javax.mail.MessagingException;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
///**
// *
// * @author BEAN
// */
//public class test {
//<<<<<<< HEAD
//    
//    public static void main(String[] args) {
////        OrderDAO odao = new OrderDAO();
////        List<Order> o = odao.getOrderByOdID(1);
////
////        for (Order order : o) {
////            System.out.println(order.getId());
////        }
//        ShipDAO sdao = new ShipDAO();
//        ShipInfo s = sdao.getShipInfoByOdID(1);
//        System.out.println(s.getCustomerName());
//    }
//    
//=======
//
//    public static void main(String[] args) {
//        OrderDAO orderDAO = new OrderDAO();
//        Order orders = orderDAO.getAnOrderByUserID(4);
//        System.out.println(orders.getId());
//    }
//>>>>>>> c3454b0182e81c4e3e8b3e0e9f01c89d81f4d5b6
//}
//
////    public static void main(String[] args) throws MessagingException {
////<<<<<<< HEAD
////        OrderDAO orderDAO = new OrderDAO();
////        List<Order> orders = orderDAO.getOrderByUserID(5);
////        for (Order order : orders) {
////            System.out.println(order);
////=======
////          OrderDAO orderDAO = new OrderDAO();
////
////            List<Order> orders = orderDAO.getAllOrders();
////        for (Order o : orders ) {
////            System.out.println(o);
////>>>>>>> 5352cea26f81520573aa49703ca9266c6230c2d6
////        }
////    }
////
////}
//
