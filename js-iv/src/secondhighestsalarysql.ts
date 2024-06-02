import { PrismaClient } from '@prisma/client'
const prisma = new PrismaClient()

async function findSecondHighestSalary() {
    try {
        await prisma.$connect()

        const res: [{ [key: string]: number }] =
            await prisma.$queryRaw`select salary from Employee order by salary desc limit 1 offset 1`

        return res.length > 0 ? res[0].salary : null
    }
    catch (err) {
        console.log('query failed', err)
    }
}

async function updateSecondHighestSalary() {
    try {
        await prisma.$connect()

        const res =
            await prisma.$executeRaw`update Employee set salary = 100 where salary = (select salary from Employee order by salary desc limit 1 offset 1)`

        console.log(res)
    }
    catch (err) {
        console.log('update failed', err)
    }
}