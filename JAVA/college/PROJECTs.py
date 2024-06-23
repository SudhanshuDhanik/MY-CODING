import tkinter as tk
from abc import ABC, abstractmethod

class BankAccount(ABC):
    def __init__(self, account_holder, account_number):
        self.account_holder = account_holder
        self.account_number = account_number
        self.balance = 1000

    @abstractmethod
    def deposit(self, amount):
        pass

    @abstractmethod
    def withdraw(self, amount):
        pass

class SavingsAccount(BankAccount):
    def __init__(self, account_holder, account_number, interest_rate):
        super().__init__(account_holder, account_number)
        self.interest_rate = interest_rate

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Insufficient funds!")

class LoanAccount(BankAccount):
    def __init__(self, account_holder, account_number, loan_amount, interest_rate):
        super().__init__(account_holder, account_number)
        self.loan_amount = loan_amount
        self.interest_rate = interest_rate

    def deposit(self, amount):
        print("You cannot deposit into a loan account.")

    def withdraw(self, amount):
        remaining_loan = self.loan_amount - amount
        if remaining_loan >= 0:
            self.loan_amount = remaining_loan
        else:
            print("Loan fully paid!")

# Tkinter GUI
class BankApp(tk.Tk):
    def __init__(self):
        super().__init__()
        self.title("Bank Application")

        self.savings_account = SavingsAccount("John Doe", "SA123456", 0.02)
        self.loan_account = LoanAccount("Jane Doe", "LA789012", 5000, 0.05)

        self.create_widgets()

    def create_widgets(self):
        tk.Label(self, text="Savings Account Balance:").pack()
        tk.Label(self, textvariable=self.savings_account.balance).pack()

        tk.Button(self, text="Deposit to Savings", command=self.deposit_to_savings).pack()
        tk.Button(self, text="Withdraw from Savings", command=self.withdraw_from_savings).pack()

        tk.Label(self, text="Loan Account Balance:").pack()
        tk.Label(self, textvariable=self.loan_account.loan_amount).pack()

        tk.Button(self, text="Withdraw from Loan", command=self.withdraw_from_loan).pack()

    def deposit_to_savings(self):
        amount = float(tk.simpledialog.askstring("Deposit", "Enter deposit amount:"))
        self.savings_account.deposit(amount)
        self.update_ui()

    def withdraw_from_savings(self):
        amount = float(tk.simpledialog.askstring("Withdraw", "Enter withdrawal amount:"))
        self.savings_account.withdraw(amount)
        self.update_ui()

    def withdraw_from_loan(self):
        amount = float(tk.simpledialog.askstring("Withdraw", "Enter withdrawal amount:"))
        self.loan_account.withdraw(amount)
        self.update_ui()

    def update_ui(self):
        # Update the UI to reflect the changes in account balances
        self.savings_account_balance.set(self.savings_account.balance)
        self.loan_account_balance.set(self.loan_account.loan_amount)

if __name__ == "__main__":
    app = BankApp()
    app.mainloop()
