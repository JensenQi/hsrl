package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BigGameHunter_69807 : Card() {
    override val id = 69807
    override val name = "王牌猎人"
    override val description = "<b>战吼：</b> 消灭一个攻击力大于或等于7的随从。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "魔暴龙之类的猎物已经让他提不起兴趣了。很快，他就会提着一把生锈的“科罗尔之刃”去猎杀奥妮克希亚了。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7cf10fd2d0e822321b4dc99d6a2caacf57b784b2e360b01b658878009724d679.png"
}
