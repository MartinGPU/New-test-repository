package com.marat.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class UpdateUserDataTest extends TestBase{

@Test
@Tag("update")
    void updateData() {
    updateUserDataPage.updateData();
    updateUserDataPage.checkProfile();
    updateUserDataPage.clearData();
}
}
