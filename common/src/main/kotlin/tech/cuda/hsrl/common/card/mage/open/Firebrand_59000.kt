package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Firebrand_59000 : Card() {
    override val id = 59000
    override val name = "火印火妖"
    override val description = "<b>法术迸发：</b>造成4点伤害，随机分配到所有敌方随从身上。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "你好烧啊。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e6957a87cb712f18a8d8ffcf4ade8541078a43b4fe98decc56b254f9181044bb.png"
}
