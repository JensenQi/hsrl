package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CramSession_59639 : Card() {
    override val id = 59639
    override val name = "考前刷夜"
    override val description = "抽 1张牌<i>（受<b>法术伤害</b>加成影响）</i>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "教材上的奥术字体能赋予你近乎无穷的威力与能量！但它不能让你保持清醒，提神还得靠咖啡。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2f2464d6fa952283573dd67f71a22da544fcff79c7f914f14f21698dd80280ae.png"
}
