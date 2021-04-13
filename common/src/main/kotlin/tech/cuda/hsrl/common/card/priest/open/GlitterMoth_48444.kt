package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GlitterMoth_48444 : Card() {
    override val id = 48444
    override val name = "闪光飞蛾"
    override val description = "<b>战吼：</b> 如果你的牌库中只有法力值消耗为奇数的牌，使你所有其他随从的生命值翻倍。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy4
    override val background = "扑火太险，不如跳舞。"
    override val artist = "Bill Ruan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a45e34829b542f1848ce1485204f57ea33b7581ab529492fc177920d4258e9a.png"
}
