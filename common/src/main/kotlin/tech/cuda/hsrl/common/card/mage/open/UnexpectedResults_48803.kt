package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnexpectedResults_48803 : Card() {
    override val id = 48803
    override val name = "鲁莽试验"
    override val description = "随机召唤两个法力值消耗为（ 2）的随从<i>（受<b>法术伤害</b>加成影响）</i>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "科学更是一门艺术，很多人意识不到这一点。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8289db51dd6c48ebaa2d0db2b07d0b90761b2e577e0084b2bef77f4c2d9f7fc5.png"
}
