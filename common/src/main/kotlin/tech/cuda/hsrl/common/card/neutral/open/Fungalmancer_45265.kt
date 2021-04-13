package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Fungalmancer_45265 : Card() {
    override val id = 45265
    override val name = "菌菇术士"
    override val description = "<b>战吼：</b>使相邻的随从获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "对那些通不过蜡烛学考试的学生来说，真菌分类学是比较容易过关的。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/17326f3b58b2fa3bf56c6987887a36550ec7995882f7240d793d5d9796093744.png"
}
