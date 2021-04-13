package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BigGameHunter_1657 : Card() {
    override val id = 1657
    override val name = "王牌猎人"
    override val description = "<b>战吼：</b> 消灭一个攻击力大于或等于7的随从。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "魔暴龙之类的猎物已经让他提不起兴趣了。很快，他就会提着一把生锈的“科罗尔之刃”去猎杀奥妮克希亚了。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d79c845bd921fb44b126a077c5556713d29da02c1975f82e2adf79109f193aef.png"
}
