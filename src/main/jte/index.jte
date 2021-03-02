@param com.vwds.sinfo28.pages.root.RootPage page

@layout.base(content = @`
    <h1>Hello SINFO 28</h1>
    <form method="get">
        <button type="submit">${page.catName}</button>
        <label>
            <input type="checkbox" name="cat-variation" checked="${page.isDark}">
            dark
        </label>
        <p><a href="${page.catImgPath}"><i>${page.catImgPath}</i></a></p>
        <input type="hidden" name="cat-id" value="${page.catId}">
    </form>
`)
