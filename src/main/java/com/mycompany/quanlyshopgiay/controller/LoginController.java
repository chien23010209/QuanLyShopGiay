/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlyshopgiay.controller;

import com.mycompany.quanlyshopgiay.action.CheckLogin;
import com.mycompany.quanlyshopgiay.entity.User;
import com.mycompany.quanlyshopgiay.view.LoginView;
import com.mycompany.quanlyshopgiay.view.MainView;
import com.mycompany.quanlyshopgiay.view.ShoesView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class LoginController 
{
    private CheckLogin checkLogin;
    private LoginView loginView;
    private ShoesView shoesView;
    private MainView mainView;
    
    public LoginController(LoginView view) 
    {
        this.loginView = view;
        this.checkLogin = new CheckLogin();
        view.addLoginListener(new LoginListener());
    }
    
    public void showLoginView() 
    {
        loginView.setVisible(true);
    }
    
    class LoginListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            User user = loginView.getUser();
            if (checkLogin.checkUser(user)) 
            {
                // nếu đăng nhập thành công, mở màn hình quản lý sinh viên
                mainView = new MainView();
                MainController mainController = new MainController(mainView);
                mainController.showMainView();
                loginView.setVisible(false);
            } 
            else 
            {
                loginView.showMessage("Tên đăng nhập hoặc mật khẩu không đúng.");
            }
        }
    }
}
