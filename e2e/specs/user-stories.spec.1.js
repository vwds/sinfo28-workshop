describe('SINFO =^__^=', () => {

    // USER STORY 1
    // GIVEN  that I accessed our website with the browser
    // WHEN   the website finishes loading
    // THEN   I see Sandy Hacky on the screen
    // AND    its __name__
    describe("Hacky wears a light shirt", () => {

        // GIVEN
        before(() => {
            // WHEN
            cy.visit('/')
        })

        describe("when website finishes loading", () => {
            // THEN
            it("shows Sandy Hacky on the screen", () => {
                cy.findByRole('img')
                    .should('have.attr', 'src', 'assets/sandy-hacky.jpg')
                    .and('have.attr', 'alt', 'Sandy Hacky SINFO CAT')
            })
            
            it("shows its name", () => {
                cy.findByText(/hi, i am Sandy Hacky/i)
            })
        })
    });

    // USER STORY 2
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