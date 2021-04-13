package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BarrensScavenger_63217 : Card() {
    override val id = 63217
    override val name = "贫瘠之地拾荒者"
    override val description = "<b>嘲讽</b> 当你的牌库少于或等于10张时，则法力值消耗为（1）点。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "第一百个半人马倒下了，她终于拿到了足够的半人马护腕。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a0c2829c92effa21e7b02136ae6a71ae1c0286d2ba9e3a5f9fc2dbd3c3f76381.png"
}
