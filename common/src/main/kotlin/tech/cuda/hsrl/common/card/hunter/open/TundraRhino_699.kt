package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TundraRhino_699 : Card() {
    override val id = 699
    override val name = "苔原犀牛"
    override val description = "你的野兽获得<b>冲锋</b>。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "人们经常无法分清苔原犀牛和科多兽。这是一头苔原犀牛，对不对？"
    override val artist = "Lars Grant-West"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/235967c3b6ffba5f5113593afc7e4de8baae68086e5b1dc6c96475cf2e66f6e1.png"
}
