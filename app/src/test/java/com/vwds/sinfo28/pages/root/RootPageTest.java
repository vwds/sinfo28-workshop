package com.vwds.sinfo28.pages.root;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootPageTest {

    @Nested
    public class LightCatTest {

        @Test
        void testCatName() {
            RootPage page = new RootPage(false);

            assertEquals("Sandy Hacky", page.catName);
        }

        @Test
        void testCatImagePath() {
            RootPage page = new RootPage(false);

            assertEquals("assets/cats/light-cat.jpg", page.catImgPath);
        }
    }

    @Nested
    public class DarkCatTest {

        @Test
        void testCatName() {
            RootPage page = new RootPage(true);

            assertEquals("Hacky Grey", page.catName);
        }

        @Test
        void testCatImagePath() {
            RootPage page = new RootPage(true);

            assertEquals("assets/cats/dark-cat.jpg", page.catImgPath);
        }
    }
}