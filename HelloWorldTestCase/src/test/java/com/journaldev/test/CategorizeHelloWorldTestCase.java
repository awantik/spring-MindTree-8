package com.journaldev.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.skillspeed.HelloWorldTestCase;
import com.skillspeed.ParametrizedHelloWorldTestCase;
import com.skillspeed.categories.Mandatory;
import com.skillspeed.categories.Optional;

@RunWith(Categories.class)
@IncludeCategory(Mandatory.class)
@ExcludeCategory(Optional.class)
@SuiteClasses({ParametrizedHelloWorldTestCase.class,HelloWorldTestCase.class})
public class CategorizeHelloWorldTestCase {

}
