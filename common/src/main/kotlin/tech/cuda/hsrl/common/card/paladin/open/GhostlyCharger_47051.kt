package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GhostlyCharger_47051 : Card() {
    override val id = 47051
    override val name = "幽灵战马"
    override val description = "<b>圣盾，突袭</b>"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "前任恶灵骑士的坐骑。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/37edd3e8dd188f0b6afe0b4a60db5ae058649ead4fc05d9dd2e78f171f683928.png"
}
