package com.marat.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileDownloadTest extends TestBase {

    @Test
    @Tag("downloads")
    public void downloadPdfFile() throws IOException {
        fileDownloadPage.clientPage();
    }
}
