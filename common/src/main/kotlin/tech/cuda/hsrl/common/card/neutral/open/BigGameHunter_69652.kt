package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BigGameHunter_69652 : Card() {
    override val id = 69652
    override val name = "王牌猎人"
    override val description = "<b>战吼：</b> 消灭一个攻击力大于或等于7的随从。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "魔暴龙之类的猎物已经让他提不起兴趣了。很快，他就会提着一把生锈的“科罗尔之刃”去猎杀奥妮克希亚了。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/519000d751358f91d27cb0ca407ad809c0ce2e409e3b9d1e93455d91e3ac56c2.png"
}
