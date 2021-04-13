package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JarDealer_54013 : Card() {
    override val id = 54013
    override val name = "陶罐商人"
    override val description = "<b>亡语：</b>随机将一张法力值消耗为（1）的随从牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "要不要来开个盲罐试试手气？"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1fb44e6e2caca649a25b02744695b0d8a2fbb790f42c0ea5361833ebfafa042d.png"
}
