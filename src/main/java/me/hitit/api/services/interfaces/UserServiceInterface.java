package me.hitit.api.services.interfaces;

import me.hitit.api.controllers.forms.SignUpForm;
import me.hitit.api.controllers.forms.UpdateUserPasswordForm;
import me.hitit.api.domains.User;
import me.hitit.api.view_objects.GetUserViewObject;
import me.hitit.api.view_objects.SignUpViewObject;
import me.hitit.api.view_objects.UpdateUserViewObject;

import java.security.NoSuchAlgorithmException;

/**
 * UserService interface.
 *
 * @author devetude
 */
public interface UserServiceInterface {
	/**
	 * Methods to get a user by index.
	 */
	public User getUser(final long idx);

	/**
	 * Methods to get a user by email and password.
	 *
	 * @param email
	 * @param password
	 * @return
	 */
	public GetUserViewObject getUser(final String email, final String password);

	/**
	 * Methods to check email exist.
	 *
	 * @param email
	 * @return
	 */
	public Boolean isEmailExist(final String email);

	/*
	 * Methods to insert user.
	 *
	 * @param suf
	 */
	public SignUpViewObject addUser(final SignUpForm suf) throws NoSuchAlgorithmException;

	/**
	 * Methods to update user.
	 *
	 * @param uupf
	 * @param uidx
	 */
	public UpdateUserViewObject updateUser(final Long uidx, final UpdateUserPasswordForm uupf) throws NoSuchAlgorithmException;

//    /**
//     * Methods to delete user.
//     *
//     * @param idx
//     */
//    public void deleteUser(final long idx);
//

	/**
	 * Methods to check phone number exist.
	 *
	 * @param phoneNumber
	 * @return
	 */
	public Boolean isPhoneNumberExist(final String phoneNumber);
}