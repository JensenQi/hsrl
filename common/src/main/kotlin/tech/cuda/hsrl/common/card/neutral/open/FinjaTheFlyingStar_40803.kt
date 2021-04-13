package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FinjaTheFlyingStar_40803 : Card() {
    override val id = 40803
    override val name = "飞火流星·芬杰"
    override val description = "<b>潜行</b> 每当该随从攻击并消灭一个随从，便从你的牌库中召唤两个鱼人。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "忍者大师，鱼人的传奇英雄。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/51146905abfde00b8016832248e49dd288ed6d968ff203af10e06e2dc264750a.png"
}
