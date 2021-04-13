package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HoundmasterShaw_47488 : Card() {
    override val id = 47488
    override val name = "驯犬大师肖尔"
    override val description = "你的其他随从都获得<b>突袭</b>。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "“它们都是好孩子，苔丝。”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6459185f2566c4838f5adf47d8a8eed37af3fbf4160e595f1696ed5ca69fd751.png"
}
