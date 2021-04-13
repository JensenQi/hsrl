package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gruul_526 : Card() {
    override val id = 526
    override val name = "格鲁尔"
    override val description = "在每个回合结束时，获得+1/+1。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "人们叫他“屠龙者”格鲁尔。其实他只是想抱抱它们……他不是故意要……"
    override val artist = "Kev Walker"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2720a509d2b6152dfeb903cd79c6f6f94dad6e941ec50b9f82f78c058a294a3b.png"
}
