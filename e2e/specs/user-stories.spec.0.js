describe('SINFO =^__^=', () => {

    it('it works', () => {
        cy.visit('/')

        cy.findByRole('heading').should('contain', 'Hello SINFO 28')
    })

    // USER STORY #1
    // GIVEN  that I accessed our website with the browser
    // WHEN   the website finishes loading
    // THEN   I see Sandy Hacky on the screen
    // AND    its __name__
    describe("Hacky wears a light shirt", () => {
    });

    // USER STORY #2
    // GIVEN  that I accessed our website with the browser
    // AND    Sandy Hacky is on the screen
    // WHEN   I select the 'Dark' option
    // AND    press 'Apply' button
    // THEN   I see Grey Hacky on the screen
    // AND    its __name__
    describe("Hacky wears a dark shirt", () => {
    })

    // USER STORY #3
    // GIVEN  that I accessed our website with the browser
    // AND    Grey Hacky is on the screen
    // WHEN   I select the 'Light' option
    // AND    press 'Apply' button
    // THEN   I see Sandy Hacky on the screen
    // AND    its __name__
    describe("Hacky switches between shirts", () => {
    })
})