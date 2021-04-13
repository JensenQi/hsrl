package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PenFlinger_59039 : Card() {
    override val id = 59039
    override val name = "甩笔侏儒"
    override val description = "<b>战吼：</b>造成1点伤害。<b>法术迸发：</b>将该随从移回你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "笔确实胜于长剑，特别是在短距离投射打击时的空气动力学性能方面。"
    override val artist = "Zoe Feng"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/20b65361f9eacbb1b5246f6e5fef8a31edc749276ada46b48d68af113da66a1c.png"
}
