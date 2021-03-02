@param com.vwds.sinfo28.pages.root.RootPage page

@layout.base(content = @`
    <h1>Hello SINFO 28</h1>
    <form method="get">
        <button type="submit">Apply</button>
        <label>
            <input type="radio" name="cat-variation" value="light" checked="${!page.isDark}">
            Light
        </label>
        <label>
            <input type="radio" name="cat-variation" value="dark" checked="${page.isDark}">
            Dark
        </label>
        <p><b>${page.catName}</b></p>
        <p><a href="${page.catImgPath}"><i>${page.catImgPath}</i></a></p>
    </form>
`)
