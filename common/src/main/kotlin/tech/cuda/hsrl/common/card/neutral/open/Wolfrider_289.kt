package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wolfrider_289 : Card() {
    override val id = 289
    override val name = "狼骑兵"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "兽人劫掠者们以狼作为坐骑是因为它们能够适应艰苦的环境，而且它们特别温顺，很会讨兽人喜欢。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/156674ccf709ba998cfdca97362ff1fb049beed550ad15f6ecc2d5a37272bef9.png"
}
