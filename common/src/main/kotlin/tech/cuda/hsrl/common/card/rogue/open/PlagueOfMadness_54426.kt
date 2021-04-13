package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlagueOfMadness_54426 : Card() {
    override val id = 54426
    override val name = "疯狂之灾祸"
    override val description = "每个玩家装备一把2/2并具有<b>剧毒</b>的刀。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "械斗的时候就别用蜡烛了。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6dcb978b497b517deb9877ab9f7d559a132cee8c359e0af43d5dcba7971fe82a.png"
}
