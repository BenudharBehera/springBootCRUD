package com.stl.exception;

public interface ExceptionFactory<E extends Exception>
{
    E create(String message);
}