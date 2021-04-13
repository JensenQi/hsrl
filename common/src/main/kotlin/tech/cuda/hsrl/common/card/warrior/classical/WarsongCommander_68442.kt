package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarsongCommander_68442 : Card() {
    override val id = 68442
    override val name = "战歌指挥官"
    override val description = "每当你召唤一个攻击力小于或等于3的随从，使其获得<b>冲锋</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "战歌氏族中闹剧不断，什么三教九流的人都能当上他们的指挥官。"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00fa167ab1e394104fe9911a9aa77feeb1934f33e269fbc1ddfcea6586aa87c4.png"
}
