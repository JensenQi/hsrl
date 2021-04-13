package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Humility_854 : Card() {
    override val id = 854
    override val name = "谦逊"
    override val description = "使一个随从的攻击力变为1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy1635
    override val background = "这张牌真是会让人的心情很糟糕，就像潮湿阴冷的天气。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/619bcc2a62306812686ed8c4b21716446104633c6eeb83cdec18f44d9a264cb0.png"
}
