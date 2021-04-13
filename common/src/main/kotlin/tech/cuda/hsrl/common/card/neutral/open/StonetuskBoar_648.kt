package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StonetuskBoar_648 : Card() {
    override val id = 648
    override val name = "石牙野猪"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "决斗的时候离它们远点儿。"
    override val artist = "Howard Lyon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b6b2918950e9e4f25dea6f40db9810c4065081366f0424f906f3857fbc7dd8c1.png"
}
