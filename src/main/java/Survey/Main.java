/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Survey;

/**
 *
 * @author RCAT
 */

//https://copyassignment.com/survey-management-system-in-java/


import java.sql.SQLException;

public class Main {
	public static void main(String args[]) throws SQLException {
		Login login = new Login();
		login.loginView();
	}
}
