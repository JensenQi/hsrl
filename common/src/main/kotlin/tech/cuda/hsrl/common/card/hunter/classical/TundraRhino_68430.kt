package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TundraRhino_68430 : Card() {
    override val id = 68430
    override val name = "苔原犀牛"
    override val description = "你的野兽获得<b>冲锋</b>。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "人们经常无法分清苔原犀牛和科多兽。这是一头苔原犀牛，对不对？"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1805b26bf6988a3d29c88fcf6b320d42e82d2c62b2a66baa0587b223ff49865d.png"
}
