package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PotionOfMadness_40373 : Card() {
    override val id = 40373
    override val name = "疯狂药水"
    override val description = "直到回合结束，获得一个攻击力小于或等于2的敌方随从的控制权。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "你一定是疯了才会去喝它！"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba9f3a8f5dcfb98fef3b2becdb7f7cf092d04ba0a320cb417ab110301d10ffb2.png"
}
