package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoguFleshshaper_53972 : Card() {
    override val id = 53972
    override val name = "魔古血肉塑造者"
    override val description = "<b>突袭</b> 战场上每有一个随从，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 9
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "您好，血肉塑造了解一下！"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/75f9bd1e676d5673dec2ee7a0dbbcaa5f5b481dfe07810822c97bd617968a27e.png"
}
