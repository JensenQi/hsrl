package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Blazecaller_41928 : Card() {
    override val id = 41928
    override val name = "火焰使者"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则造成5点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "本来他想管自己叫金翼杀手的，可惜被人注册了。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b2a73bd3ee24b00a1483bebeba60937bf99d6bc22c1da376cabef48aa3e81cc4.png"
}
