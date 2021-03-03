@param com.vwds.sinfo28.pages.root.RootPage page

@layout.base(content = @`
    <h1>Hello SINFO 28</h1>
    <div class="media-object">
        <img src="${page.catImgPath}" alt="${page.catName} SINFO CAT" height="350">
        <form method="get">
            <label>
                <input type="radio" name="cat-variation" checked="${!page.isDark}">
                Light
            </label>
            <label>
                <input type="radio" name="cat-variation" value="dark" checked="${page.isDark}">
                Dark
            </label>
            <button type="submit">Apply</button>
            <p>Hi, I am <b>${page.catName}</b></p>
        </form>
    </div>
`)
