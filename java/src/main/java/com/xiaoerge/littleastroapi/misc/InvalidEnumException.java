/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiaoerge.littleastroapi.misc;

/**
 *
 * @author xiaoerge
 */
public class InvalidEnumException extends Exception
{
    public InvalidEnumException()
    {
        super();
    }
    public InvalidEnumException(String message)
    {
        super(message);
    }
    public InvalidEnumException(Throwable cause)
    {
        super(cause);
    }
    public InvalidEnumException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
