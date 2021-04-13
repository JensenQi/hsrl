package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Tracking_69545 : Card() {
    override val id = 69545
    override val name = "追踪术"
    override val description = "从你的牌库中<b>发现</b>一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "为了那些不知道该把什么牌放入套牌的人准备的！"
    override val artist = "Mauro Cascioli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/07f8e75ab2701dcba3054550796d4ebfe2fa03401b9cb42ee9af034924360cf3.png"
}
