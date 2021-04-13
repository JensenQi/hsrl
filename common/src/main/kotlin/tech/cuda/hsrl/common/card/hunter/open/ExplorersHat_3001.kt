package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExplorersHat_3001 : Card() {
    override val id = 3001
    override val name = "探险帽"
    override val description = "使一个随从获得+1/+1，以及“<b>亡语：</b>将一张“探险帽”置入你的手牌。”"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Loe
    override val background = "很遗憾，哈里森·琼斯没能加入到探险者协会，但他的探险帽却成了会员的标配。"
    override val artist = "Joe Wilson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8f9d3aa6d8af7f824690462cde88d84b7853c8f043fe3fb1c95de508aac06a9d.png"
}
