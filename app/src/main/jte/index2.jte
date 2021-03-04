@param com.vwds.sinfo28.pages.root.RootPage page

@layout.base(content = @`
    <div class="media-object">
        <img src="${page.catImgPath}" alt="${page.catName} SINFO CAT" height="350">
        <form method="get">
            <label>
                <input type="radio" name="cat-variation" value="dark" checked="${page.isDark}">
                Dark
            </label>
            <button type="submit">Apply</button>
            <p>Hi, I am ${page.catName}</p>
        </form>
    </div>
`)
