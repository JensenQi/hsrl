package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Waxadred_55104 : Card() {
    override val id = 55104
    override val name = "蜡烛巨龙"
    override val description = "<b>亡语：</b>将一支蜡烛洗入你的牌库。抽到蜡烛时，重新召唤蜡烛巨龙。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "蜡烛巨龙，为王而战。翻过原野，万物焦烂！"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c78113633082d6efa75e89a94d0f0f88c2e12b10dec17402b5bd74e573997a4.png"
}
