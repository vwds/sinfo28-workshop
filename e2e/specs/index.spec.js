describe('Sinfo Cats page', () => {
    beforeEach(() => {
        cy.visit('/')
    })

    it('shows the correct heading', () => {
        cy.findByRole('heading').should('contain', 'Hello SINFO 28')
    })

    it('shows the light cat by default', () => {
        verifyCat('Sandy Hacky')
    })

    describe('shows the configuration form', () => {
        it('with the light option selected', () => {
            // cy.findByRole('radio', { name: 'Light', checked: true}) // worse error messages
            cy.findByRole('radio', { name: 'Light' }).should('be.checked')
        })

        it('with the dark option NOT selected', () => {
            // cy.findByRole('radio', { name: 'Dark', checked: false}) // worse error messages
            cy.findByRole('radio', { name: 'Dark' }).should('not.be.checked')
        })

        it('and a submit button', () => {
            cy.findByRole('button', { name: 'Apply' }).should('have.attr', 'type', 'submit')
        })
    })

    it('user can change the cat color', () => {
        cy.findByRole('radio', { name: 'Dark', checked: false }).click()
        cy.findByRole('button', { name: 'Apply' }).click()

        verifyCat('Grey Hacky')

        cy.findByRole('radio', { name: 'Light' }).should('not.be.checked')
        cy.findByRole('radio', { name: 'Dark' }).should('be.checked')
    })

    // TIP: leave this for a refactoring! Do it inline first
    const verifyCat = (catName) => {
        cy.findByText(/hi, i am/i)
        cy.findByText(catName)

        const fileName = catName.toLocaleLowerCase().split(' ').join('-')

        cy.findByRole('img')
            .should('have.attr', 'src', `assets/${fileName}.jpg`)
            .and('have.attr', 'alt', `${catName} SINFO CAT`)
    }
})