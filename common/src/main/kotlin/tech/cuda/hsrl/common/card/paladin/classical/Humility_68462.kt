package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Humility_68462 : Card() {
    override val id = 68462
    override val name = "谦逊"
    override val description = "使一个随从的攻击力变为1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "这张牌真是会让人的心情很糟糕，就像潮湿阴冷的天气。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/78ba1c5713cba52af778cb76c9db4dbcb3f101a049d044f9079054351946b2ef.png"
}
