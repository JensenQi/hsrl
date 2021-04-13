package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LabPartner_59013 : Card() {
    override val id = 59013
    override val name = "研究伙伴"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“老师，我的作业被一个侏儒烧掉了！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f598c712ab51f660f3174791f678d50d476cf071775861a6934be89006ef5021.png"
}
