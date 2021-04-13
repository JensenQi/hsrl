package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FireElemental_69516 : Card() {
    override val id = 69516
    override val name = "火元素"
    override val description = "<b>战吼：</b>造成4点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "他从来不洗澡。嗯..."
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4862e67b6e21b175e93bca58b7d94bdd92aa589407506e9ad7a2ac8a81b19404.png"
}
